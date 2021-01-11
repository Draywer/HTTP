package ru.idcore;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.Objects;

public class Fact {

    private Status status;
    private String type;
    private boolean deleted;
    private String _id;
    private String user;
    private String text;
    private int __v;
    private String source;
    private String updatedAt;
    private String createdAt;
    private boolean used;

    public Fact(@JsonProperty("status") Status status,
                @JsonProperty("type") String type,
                @JsonProperty("deleted") boolean deleted,
                @JsonProperty("_id") String _id,
                @JsonProperty("user") String user,
                @JsonProperty("text") String text,
                @JsonProperty("__v") int __v,
                @JsonProperty("source") String source,
                @JsonProperty("updatedAt") String updatedAt,
                @JsonProperty("createdAt") String createdAt,
                @JsonProperty("used") boolean used) {
        this.status = status;
        this.type = type;
        this.deleted = deleted;
        this._id = _id;
        this.user = user;
        this.text = text;
        this.__v = __v;
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

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
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
                ", _id='" + _id + '\'' +
                ", user='" + user + '\'' +
                ", text='" + text + '\'' +
                ", __v=" + __v +
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
                get__v() == fact.get__v() &&
                isUsed() == fact.isUsed() &&
                getStatus().equals(fact.getStatus()) &&
                getType().equals(fact.getType()) &&
                get_id().equals(fact.get_id()) &&
                getUser().equals(fact.getUser()) &&
                getText().equals(fact.getText()) &&
                getSource().equals(fact.getSource()) &&
                getUpdatedAt().equals(fact.getUpdatedAt()) &&
                getCreatedAt().equals(fact.getCreatedAt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStatus(),
                getType(),
                isDeleted(),
                get_id(),
                getUser(),
                getText(),
                get__v(),
                getSource(),
                getUpdatedAt(),
                getCreatedAt(),
                isUsed());
    }
}
