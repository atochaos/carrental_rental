package carrental;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CarRentalRepository extends PagingAndSortingRepository<CarRental, Long>{

    List<CarRental> findByCarNo(String carNo);
}