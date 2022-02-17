package com.company.composition;

import java.util.Objects;

public class RewardMember {

    private boolean rewardMember;

    public RewardMember(boolean rewardMember) {
        this.rewardMember = rewardMember;
    }

    public boolean isRewardMember() {
        return rewardMember;
    }

    public void setRewardMember(boolean rewardMember) {
        this.rewardMember = rewardMember;
    }

    // Equal and HashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RewardMember that = (RewardMember) o;
        return rewardMember == that.rewardMember;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rewardMember);
    }

    // To String

    @Override
    public String toString() {
        return "RewardMember{" +
                "rewardMember=" + rewardMember +
                '}';
    }
}
