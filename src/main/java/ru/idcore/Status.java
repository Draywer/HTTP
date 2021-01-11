package ru.idcore;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Status {

    private boolean verified;
    private int sentCount;

    public Status(@JsonProperty("verified") boolean verified,
                  @JsonProperty("sentCount") int sentCount) {
        this.verified = verified;
        this.sentCount = sentCount;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public int getSentCount() {
        return sentCount;
    }

    public void setSentCount(int sentCount) {
        this.sentCount = sentCount;
    }

    @Override
    public String toString() {
        return "Status{" +
                "verified=" + verified +
                ", sentCount=" + sentCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Status)) return false;
        Status status = (Status) o;
        return isVerified() == status.isVerified() &&
                getSentCount() == status.getSentCount();
    }

    @Override
    public int hashCode() {
        return Objects.hash(isVerified(), getSentCount());
    }
}
