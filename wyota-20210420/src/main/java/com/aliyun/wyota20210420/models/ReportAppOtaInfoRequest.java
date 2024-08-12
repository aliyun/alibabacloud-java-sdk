// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ReportAppOtaInfoRequest extends TeaModel {
    @NameInMap("BaseVersion")
    public String baseVersion;

    @NameInMap("ClientType")
    public Integer clientType;

    @NameInMap("ClientUid")
    public String clientUid;

    @NameInMap("Note")
    public String note;

    @NameInMap("OsType")
    public String osType;

    @NameInMap("Project")
    public String project;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("TargetVersion")
    public String targetVersion;

    @NameInMap("TaskUid")
    public String taskUid;

    public static ReportAppOtaInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportAppOtaInfoRequest self = new ReportAppOtaInfoRequest();
        return TeaModel.build(map, self);
    }

    public ReportAppOtaInfoRequest setBaseVersion(String baseVersion) {
        this.baseVersion = baseVersion;
        return this;
    }
    public String getBaseVersion() {
        return this.baseVersion;
    }

    public ReportAppOtaInfoRequest setClientType(Integer clientType) {
        this.clientType = clientType;
        return this;
    }
    public Integer getClientType() {
        return this.clientType;
    }

    public ReportAppOtaInfoRequest setClientUid(String clientUid) {
        this.clientUid = clientUid;
        return this;
    }
    public String getClientUid() {
        return this.clientUid;
    }

    public ReportAppOtaInfoRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public ReportAppOtaInfoRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public ReportAppOtaInfoRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public ReportAppOtaInfoRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ReportAppOtaInfoRequest setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }
    public String getTargetVersion() {
        return this.targetVersion;
    }

    public ReportAppOtaInfoRequest setTaskUid(String taskUid) {
        this.taskUid = taskUid;
        return this;
    }
    public String getTaskUid() {
        return this.taskUid;
    }

}
