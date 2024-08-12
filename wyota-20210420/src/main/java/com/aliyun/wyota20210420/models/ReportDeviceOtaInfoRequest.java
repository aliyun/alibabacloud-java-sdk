// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ReportDeviceOtaInfoRequest extends TeaModel {
    @NameInMap("BaseVersion")
    public String baseVersion;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("Model")
    public String model;

    @NameInMap("Note")
    public String note;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("TargetVersion")
    public String targetVersion;

    public static ReportDeviceOtaInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportDeviceOtaInfoRequest self = new ReportDeviceOtaInfoRequest();
        return TeaModel.build(map, self);
    }

    public ReportDeviceOtaInfoRequest setBaseVersion(String baseVersion) {
        this.baseVersion = baseVersion;
        return this;
    }
    public String getBaseVersion() {
        return this.baseVersion;
    }

    public ReportDeviceOtaInfoRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ReportDeviceOtaInfoRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ReportDeviceOtaInfoRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public ReportDeviceOtaInfoRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ReportDeviceOtaInfoRequest setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }
    public String getTargetVersion() {
        return this.targetVersion;
    }

}
