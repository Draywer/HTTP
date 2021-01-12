package ru.idcore;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Fact {

    private Status status;
    private String type;
    private boolean deleted;
    private String factId;
    private String userId;
    private String description;
    private int rating;
    private String source;
    private String updatedAt;
    private String createdAt;
    private boolean used;

    public Fact(@JsonProperty("status") Status status,
                @JsonProperty("type") String type,
                @JsonProperty("deleted") boolean deleted,
                @JsonProperty("_id") String factId,
                @JsonProperty("user") String userId,
                @JsonProperty("text") String description,
                @JsonProperty("__v") int rating,
                @JsonProperty("source") String source,
                @JsonProperty("updatedAt") String updatedAt,
                @JsonProperty("createdAt") String createdAt,
                @JsonProperty("used") boolean used) {
        this.status = status;
        this.type = type;
        this.deleted = deleted;
        this.factId = factId;
        this.userId = userId;
        this.description = description;
        this.rating = rating;
        this.source = source;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.used = used;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getFactId() {
        return factId;
    }

    public void setFactId(String factId) {
        this.factId = factId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    @Override
    public String toString() {
        return "Fact{" +
                "status=" + status +
                ", type='" + type + '\'' +
                ", deleted=" + deleted +
                ", factId='" + factId + '\'' +
                ", userId='" + userId + '\'' +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                ", source='" + source + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", used=" + used +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fact)) return false;
        Fact fact = (Fact) o;
        return isDeleted() == fact.isDeleted() &&
                getRating() == fact.getRating() &&
                isUsed() == fact.isUsed() &&
                getStatus().equals(fact.getStatus()) &&
                getType().equals(fact.getType()) &&
                getFactId().equals(fact.getFactId()) &&
                getUserId().equals(fact.getUserId()) &&
                getDescription().equals(fact.getDescription()) &&
                getSource().equals(fact.getSource()) &&
                getUpdatedAt().equals(fact.getUpdatedAt()) &&
                getCreatedAt().equals(fact.getCreatedAt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStatus(),
                getType(),
                isDeleted(),
                getFactId(),
                getUserId(),
                getDescription(),
                getRating(),
                getSource(),
                getUpdatedAt(),
                getCreatedAt(),
                isUsed());
    }
}
