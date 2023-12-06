// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateOssScanConfigRequest extends TeaModel {
    /**
     * <p>The names of buckets.</p>
     */
    @NameInMap("BucketNameList")
    public java.util.List<String> bucketNameList;

    /**
     * <p>Specifies whether to enable the policy. Valid values:</p>
     * <br>
     * <p>*   **1**: yes</p>
     * <p>*   **0**: no</p>
     */
    @NameInMap("Enable")
    public Integer enable;

    /**
     * <p>The time when the scan ends. The time must be in the HH:mm:ss format.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The suffixes of the files to scan.</p>
     */
    @NameInMap("KeySuffixList")
    public java.util.List<String> keySuffixList;

    /**
     * <p>The days on which the scan is executed in a week.</p>
     */
    @NameInMap("ScanDayList")
    public java.util.List<Integer> scanDayList;

    /**
     * <p>The time when the scan starts. The time must be in the HH:mm:ss format.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static CreateOssScanConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOssScanConfigRequest self = new CreateOssScanConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateOssScanConfigRequest setBucketNameList(java.util.List<String> bucketNameList) {
        this.bucketNameList = bucketNameList;
        return this;
    }
    public java.util.List<String> getBucketNameList() {
        return this.bucketNameList;
    }

    public CreateOssScanConfigRequest setEnable(Integer enable) {
        this.enable = enable;
        return this;
    }
    public Integer getEnable() {
        return this.enable;
    }

    public CreateOssScanConfigRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateOssScanConfigRequest setKeySuffixList(java.util.List<String> keySuffixList) {
        this.keySuffixList = keySuffixList;
        return this;
    }
    public java.util.List<String> getKeySuffixList() {
        return this.keySuffixList;
    }

    public CreateOssScanConfigRequest setScanDayList(java.util.List<Integer> scanDayList) {
        this.scanDayList = scanDayList;
        return this;
    }
    public java.util.List<Integer> getScanDayList() {
        return this.scanDayList;
    }

    public CreateOssScanConfigRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
