// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class CreateScanTaskRequest extends TeaModel {
    @NameInMap("DataLimitId")
    public Long dataLimitId;

    @NameInMap("IntervalDay")
    public Integer intervalDay;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("OssScanPath")
    public String ossScanPath;

    @NameInMap("ResourceType")
    public Long resourceType;

    @NameInMap("RunHour")
    public Integer runHour;

    @NameInMap("RunMinute")
    public Integer runMinute;

    @NameInMap("ScanRange")
    public Integer scanRange;

    @NameInMap("ScanRangeContent")
    public String scanRangeContent;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TaskUserName")
    public String taskUserName;

    public static CreateScanTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScanTaskRequest self = new CreateScanTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateScanTaskRequest setDataLimitId(Long dataLimitId) {
        this.dataLimitId = dataLimitId;
        return this;
    }
    public Long getDataLimitId() {
        return this.dataLimitId;
    }

    public CreateScanTaskRequest setIntervalDay(Integer intervalDay) {
        this.intervalDay = intervalDay;
        return this;
    }
    public Integer getIntervalDay() {
        return this.intervalDay;
    }

    public CreateScanTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateScanTaskRequest setOssScanPath(String ossScanPath) {
        this.ossScanPath = ossScanPath;
        return this;
    }
    public String getOssScanPath() {
        return this.ossScanPath;
    }

    public CreateScanTaskRequest setResourceType(Long resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Long getResourceType() {
        return this.resourceType;
    }

    public CreateScanTaskRequest setRunHour(Integer runHour) {
        this.runHour = runHour;
        return this;
    }
    public Integer getRunHour() {
        return this.runHour;
    }

    public CreateScanTaskRequest setRunMinute(Integer runMinute) {
        this.runMinute = runMinute;
        return this;
    }
    public Integer getRunMinute() {
        return this.runMinute;
    }

    public CreateScanTaskRequest setScanRange(Integer scanRange) {
        this.scanRange = scanRange;
        return this;
    }
    public Integer getScanRange() {
        return this.scanRange;
    }

    public CreateScanTaskRequest setScanRangeContent(String scanRangeContent) {
        this.scanRangeContent = scanRangeContent;
        return this;
    }
    public String getScanRangeContent() {
        return this.scanRangeContent;
    }

    public CreateScanTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateScanTaskRequest setTaskUserName(String taskUserName) {
        this.taskUserName = taskUserName;
        return this;
    }
    public String getTaskUserName() {
        return this.taskUserName;
    }

}
