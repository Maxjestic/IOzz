package com.example.demo.db;

import org.springframework.data.repository.CrudRepository;

public interface IScoreRepository extends CrudRepository<ScoreRow, Long> {
}
