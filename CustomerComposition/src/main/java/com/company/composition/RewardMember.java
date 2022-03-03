package com.company.composition;

import java.util.Objects;

public class RewardMember {

    private boolean rewardMember;


    public boolean isRewardMember() {
        return rewardMember;
    }

    public RewardMember() {
    }

    public RewardMember(boolean rewardMember) {
        this.rewardMember = rewardMember;
    }

    public void getRewardMember(boolean rewardMember) {
        this.rewardMember = rewardMember;
    }

    public void setRewardMember(boolean rewardMember) {
        this.rewardMember = rewardMember;
    }

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

    @Override
    public String toString() {
        return "RewardMember{" +
                "rewardMember=" + rewardMember +
                '}';
    }
}
