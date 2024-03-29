package org.softuni.finalpoject.repository;

import org.softuni.finalpoject.domain.entities.Instrument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstrumentRepository extends JpaRepository<Instrument, String> {
}
