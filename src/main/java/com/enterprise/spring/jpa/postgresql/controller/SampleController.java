package com.enterprise.spring.jpa.postgresql.controller;

import com.enterprise.spring.jpa.postgresql.model.SampleTable;
import com.enterprise.spring.jpa.postgresql.repository.SampleTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sample")
public class SampleController {

    @Autowired
    SampleTableRepository sampleTableRepository;

    @GetMapping("/fetch")
    public ResponseEntity<List<SampleTable>> getAllDetails(@RequestParam(required = false) String name) {
        try {
            List<SampleTable> sample = new ArrayList<SampleTable>();

            if (name == null)
                sampleTableRepository.findAll().forEach(sample::add);
            else
                sampleTableRepository.findByNameContaining(name).forEach(sample::add);

            if (sample.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(sample, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

	@GetMapping("/fetch/{id}")
	public ResponseEntity<SampleTable> getRecordById(@PathVariable("id") long id) {
		Optional<SampleTable> tableData = sampleTableRepository.findById(id);

		if (tableData.isPresent()) {
			return new ResponseEntity<>(tableData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}