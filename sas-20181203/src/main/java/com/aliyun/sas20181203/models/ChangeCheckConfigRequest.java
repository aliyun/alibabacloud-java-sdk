// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ChangeCheckConfigRequest extends TeaModel {
    @NameInMap("CycleDays")
    public java.util.List<Integer> cycleDays;

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

    public static ChangeCheckConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeCheckConfigRequest self = new ChangeCheckConfigRequest();
        return TeaModel.build(map, self);
    }

    public ChangeCheckConfigRequest setCycleDays(java.util.List<Integer> cycleDays) {
        this.cycleDays = cycleDays;
        return this;
    }
    public java.util.List<Integer> getCycleDays() {
        return this.cycleDays;
    }

    public ChangeCheckConfigRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public ChangeCheckConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ChangeCheckConfigRequest setStandardIds(java.util.List<Long> standardIds) {
        this.standardIds = standardIds;
        return this;
    }
    public java.util.List<Long> getStandardIds() {
        return this.standardIds;
    }

    public ChangeCheckConfigRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

}
