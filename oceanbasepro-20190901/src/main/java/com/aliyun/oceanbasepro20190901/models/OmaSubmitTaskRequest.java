// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class OmaSubmitTaskRequest extends TeaModel {
    @NameInMap("DetailReport")
    public Boolean detailReport;

    @NameInMap("FileId")
    public String fileId;

    @NameInMap("FileType")
    public String fileType;

    @NameInMap("SourceFrom")
    public String sourceFrom;

    @NameInMap("TargetDbType")
    public String targetDbType;

    @NameInMap("TargetDbVersion")
    public String targetDbVersion;

    @NameInMap("TaskName")
    public String taskName;

    public static OmaSubmitTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        OmaSubmitTaskRequest self = new OmaSubmitTaskRequest();
        return TeaModel.build(map, self);
    }

    public OmaSubmitTaskRequest setDetailReport(Boolean detailReport) {
        this.detailReport = detailReport;
        return this;
    }
    public Boolean getDetailReport() {
        return this.detailReport;
    }

    public OmaSubmitTaskRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public OmaSubmitTaskRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public OmaSubmitTaskRequest setSourceFrom(String sourceFrom) {
        this.sourceFrom = sourceFrom;
        return this;
    }
    public String getSourceFrom() {
        return this.sourceFrom;
    }

    public OmaSubmitTaskRequest setTargetDbType(String targetDbType) {
        this.targetDbType = targetDbType;
        return this;
    }
    public String getTargetDbType() {
        return this.targetDbType;
    }

    public OmaSubmitTaskRequest setTargetDbVersion(String targetDbVersion) {
        this.targetDbVersion = targetDbVersion;
        return this;
    }
    public String getTargetDbVersion() {
        return this.targetDbVersion;
    }

    public OmaSubmitTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
