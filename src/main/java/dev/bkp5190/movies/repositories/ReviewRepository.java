package dev.bkp5190.movies.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.bkp5190.movies.documents.Review;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}