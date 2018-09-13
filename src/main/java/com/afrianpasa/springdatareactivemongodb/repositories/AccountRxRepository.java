package com.afrianpasa.springdatareactivemongodb.repositories;

import org.springframework.data.repository.reactive.RxJava2CrudRepository;

import com.afrianpasa.springdatareactivemongodb.models.Account;
import com.mongodb.async.client.Observable;

import io.reactivex.Single;

public interface AccountRxRepository extends RxJava2CrudRepository<Account, String>{
	Observable<Account> findAllByValue(Double value);
	Single<Account> findFirstByOwner(Single<String> owner);
}
