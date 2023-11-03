// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateOssScanConfigRequest extends TeaModel {
    @NameInMap("BucketNameList")
    public java.util.List<String> bucketNameList;

    @NameInMap("Enable")
    public Integer enable;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("KeySuffixList")
    public java.util.List<String> keySuffixList;

    @NameInMap("ScanDayList")
    public java.util.List<Integer> scanDayList;

    @NameInMap("StartTime")
    public String startTime;

    public static UpdateOssScanConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOssScanConfigRequest self = new UpdateOssScanConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOssScanConfigRequest setBucketNameList(java.util.List<String> bucketNameList) {
        this.bucketNameList = bucketNameList;
        return this;
    }
    public java.util.List<String> getBucketNameList() {
        return this.bucketNameList;
    }

    public UpdateOssScanConfigRequest setEnable(Integer enable) {
        this.enable = enable;
        return this;
    }
    public Integer getEnable() {
        return this.enable;
    }

    public UpdateOssScanConfigRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public UpdateOssScanConfigRequest setKeySuffixList(java.util.List<String> keySuffixList) {
        this.keySuffixList = keySuffixList;
        return this;
    }
    public java.util.List<String> getKeySuffixList() {
        return this.keySuffixList;
    }

    public UpdateOssScanConfigRequest setScanDayList(java.util.List<Integer> scanDayList) {
        this.scanDayList = scanDayList;
        return this;
    }
    public java.util.List<Integer> getScanDayList() {
        return this.scanDayList;
    }

    public UpdateOssScanConfigRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
