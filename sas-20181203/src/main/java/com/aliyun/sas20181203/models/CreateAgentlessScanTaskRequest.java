// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateAgentlessScanTaskRequest extends TeaModel {
    @NameInMap("AutoDeleteDays")
    public Integer autoDeleteDays;

    @NameInMap("ReleaseAfterScan")
    public Boolean releaseAfterScan;

    @NameInMap("ScanDataDisk")
    public Boolean scanDataDisk;

    @NameInMap("TargetType")
    public Integer targetType;

    @NameInMap("UuidList")
    public java.util.List<String> uuidList;

    public static CreateAgentlessScanTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentlessScanTaskRequest self = new CreateAgentlessScanTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentlessScanTaskRequest setAutoDeleteDays(Integer autoDeleteDays) {
        this.autoDeleteDays = autoDeleteDays;
        return this;
    }
    public Integer getAutoDeleteDays() {
        return this.autoDeleteDays;
    }

    public CreateAgentlessScanTaskRequest setReleaseAfterScan(Boolean releaseAfterScan) {
        this.releaseAfterScan = releaseAfterScan;
        return this;
    }
    public Boolean getReleaseAfterScan() {
        return this.releaseAfterScan;
    }

    public CreateAgentlessScanTaskRequest setScanDataDisk(Boolean scanDataDisk) {
        this.scanDataDisk = scanDataDisk;
        return this;
    }
    public Boolean getScanDataDisk() {
        return this.scanDataDisk;
    }

    public CreateAgentlessScanTaskRequest setTargetType(Integer targetType) {
        this.targetType = targetType;
        return this;
    }
    public Integer getTargetType() {
        return this.targetType;
    }

    public CreateAgentlessScanTaskRequest setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

}
