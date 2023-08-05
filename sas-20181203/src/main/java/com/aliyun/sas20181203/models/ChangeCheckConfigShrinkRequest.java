// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ChangeCheckConfigShrinkRequest extends TeaModel {
    @NameInMap("AddedCheck")
    public java.util.List<ChangeCheckConfigShrinkRequestAddedCheck> addedCheck;

    @NameInMap("ConfigRequirementIds")
    public String configRequirementIdsShrink;

    @NameInMap("ConfigStandardIds")
    public String configStandardIdsShrink;

    @NameInMap("CycleDays")
    public java.util.List<Integer> cycleDays;

    @NameInMap("EnableAddCheck")
    public Boolean enableAddCheck;

    @NameInMap("EnableAutoCheck")
    public Boolean enableAutoCheck;

    /**
     * <p>The end time of the check. The value specifies a point in time in a day. The time period that is specified by the start time and end time must be one of the following time periods:</p>
     * <br>
     * <p>*   **00:00 to 06:00:** If you set the StartTime parameter to 0, you must set the EndTime parameter to 6.</p>
     * <p>*   **06:00 to 12:00**: If you set the StartTime parameter to 6, you must set the EndTime parameter to 12.</p>
     * <p>*   **12:00 to 18:00**: If you set the StartTime parameter to 12, you must set the EndTime parameter to 18.</p>
     * <p>*  **18:00 to 24:00:** If you set the StartTime parameter to 18, you must set the EndTime parameter to 24.</p>
     */
    @NameInMap("EndTime")
    public Integer endTime;

    /**
     * <p>The region ID of the bastion host to query.</p>
     * <br>
     * <p>>  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RemovedCheck")
    public java.util.List<ChangeCheckConfigShrinkRequestRemovedCheck> removedCheck;

    /**
     * <p>An array that consists of the information about the check item.</p>
     */
    @NameInMap("StandardIds")
    public java.util.List<Long> standardIds;

    /**
     * <p>The start time of the check. The value specifies a point in time in a day.</p>
     */
    @NameInMap("StartTime")
    public Integer startTime;

    public static ChangeCheckConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeCheckConfigShrinkRequest self = new ChangeCheckConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ChangeCheckConfigShrinkRequest setAddedCheck(java.util.List<ChangeCheckConfigShrinkRequestAddedCheck> addedCheck) {
        this.addedCheck = addedCheck;
        return this;
    }
    public java.util.List<ChangeCheckConfigShrinkRequestAddedCheck> getAddedCheck() {
        return this.addedCheck;
    }

    public ChangeCheckConfigShrinkRequest setConfigRequirementIdsShrink(String configRequirementIdsShrink) {
        this.configRequirementIdsShrink = configRequirementIdsShrink;
        return this;
    }
    public String getConfigRequirementIdsShrink() {
        return this.configRequirementIdsShrink;
    }

    public ChangeCheckConfigShrinkRequest setConfigStandardIdsShrink(String configStandardIdsShrink) {
        this.configStandardIdsShrink = configStandardIdsShrink;
        return this;
    }
    public String getConfigStandardIdsShrink() {
        return this.configStandardIdsShrink;
    }

    public ChangeCheckConfigShrinkRequest setCycleDays(java.util.List<Integer> cycleDays) {
        this.cycleDays = cycleDays;
        return this;
    }
    public java.util.List<Integer> getCycleDays() {
        return this.cycleDays;
    }

    public ChangeCheckConfigShrinkRequest setEnableAddCheck(Boolean enableAddCheck) {
        this.enableAddCheck = enableAddCheck;
        return this;
    }
    public Boolean getEnableAddCheck() {
        return this.enableAddCheck;
    }

    public ChangeCheckConfigShrinkRequest setEnableAutoCheck(Boolean enableAutoCheck) {
        this.enableAutoCheck = enableAutoCheck;
        return this;
    }
    public Boolean getEnableAutoCheck() {
        return this.enableAutoCheck;
    }

    public ChangeCheckConfigShrinkRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public ChangeCheckConfigShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ChangeCheckConfigShrinkRequest setRemovedCheck(java.util.List<ChangeCheckConfigShrinkRequestRemovedCheck> removedCheck) {
        this.removedCheck = removedCheck;
        return this;
    }
    public java.util.List<ChangeCheckConfigShrinkRequestRemovedCheck> getRemovedCheck() {
        return this.removedCheck;
    }

    public ChangeCheckConfigShrinkRequest setStandardIds(java.util.List<Long> standardIds) {
        this.standardIds = standardIds;
        return this;
    }
    public java.util.List<Long> getStandardIds() {
        return this.standardIds;
    }

    public ChangeCheckConfigShrinkRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public static class ChangeCheckConfigShrinkRequestAddedCheck extends TeaModel {
        @NameInMap("CheckId")
        public Long checkId;

        @NameInMap("SectionId")
        public Long sectionId;

        public static ChangeCheckConfigShrinkRequestAddedCheck build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckConfigShrinkRequestAddedCheck self = new ChangeCheckConfigShrinkRequestAddedCheck();
            return TeaModel.build(map, self);
        }

        public ChangeCheckConfigShrinkRequestAddedCheck setCheckId(Long checkId) {
            this.checkId = checkId;
            return this;
        }
        public Long getCheckId() {
            return this.checkId;
        }

        public ChangeCheckConfigShrinkRequestAddedCheck setSectionId(Long sectionId) {
            this.sectionId = sectionId;
            return this;
        }
        public Long getSectionId() {
            return this.sectionId;
        }

    }

    public static class ChangeCheckConfigShrinkRequestRemovedCheck extends TeaModel {
        @NameInMap("CheckId")
        public Long checkId;

        @NameInMap("SectionId")
        public Long sectionId;

        public static ChangeCheckConfigShrinkRequestRemovedCheck build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckConfigShrinkRequestRemovedCheck self = new ChangeCheckConfigShrinkRequestRemovedCheck();
            return TeaModel.build(map, self);
        }

        public ChangeCheckConfigShrinkRequestRemovedCheck setCheckId(Long checkId) {
            this.checkId = checkId;
            return this;
        }
        public Long getCheckId() {
            return this.checkId;
        }

        public ChangeCheckConfigShrinkRequestRemovedCheck setSectionId(Long sectionId) {
            this.sectionId = sectionId;
            return this;
        }
        public Long getSectionId() {
            return this.sectionId;
        }

    }

}
