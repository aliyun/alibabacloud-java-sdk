// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetTaskResponseBody extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtExecutedTime")
    public String gmtExecutedTime;

    @NameInMap("GmtFinishedTime")
    public String gmtFinishedTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("ObjectId")
    public String objectId;

    @NameInMap("ObjectType")
    public String objectType;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RunningConfig")
    public String runningConfig;

    @NameInMap("Status")
    public String status;

    @NameInMap("Type")
    public String type;

    public static GetTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskResponseBody self = new GetTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public GetTaskResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetTaskResponseBody setGmtExecutedTime(String gmtExecutedTime) {
        this.gmtExecutedTime = gmtExecutedTime;
        return this;
    }
    public String getGmtExecutedTime() {
        return this.gmtExecutedTime;
    }

    public GetTaskResponseBody setGmtFinishedTime(String gmtFinishedTime) {
        this.gmtFinishedTime = gmtFinishedTime;
        return this;
    }
    public String getGmtFinishedTime() {
        return this.gmtFinishedTime;
    }

    public GetTaskResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetTaskResponseBody setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public GetTaskResponseBody setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public GetTaskResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetTaskResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskResponseBody setRunningConfig(String runningConfig) {
        this.runningConfig = runningConfig;
        return this;
    }
    public String getRunningConfig() {
        return this.runningConfig;
    }

    public GetTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetTaskResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
