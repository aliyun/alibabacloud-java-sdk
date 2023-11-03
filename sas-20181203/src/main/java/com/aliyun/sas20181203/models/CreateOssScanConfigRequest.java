// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateOssScanConfigRequest extends TeaModel {
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
