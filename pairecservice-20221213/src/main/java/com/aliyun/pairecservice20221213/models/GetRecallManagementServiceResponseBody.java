// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetRecallManagementServiceResponseBody extends TeaModel {
    @NameInMap("CurrentRecallManagementServiceVersionId")
    public String currentRecallManagementServiceVersionId;

    @NameInMap("CurrentRecallManagementServiceVersionName")
    public String currentRecallManagementServiceVersionName;

    @NameInMap("Description")
    public String description;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("Name")
    public String name;

    @NameInMap("RecallManagementServiceId")
    public String recallManagementServiceId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static GetRecallManagementServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRecallManagementServiceResponseBody self = new GetRecallManagementServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRecallManagementServiceResponseBody setCurrentRecallManagementServiceVersionId(String currentRecallManagementServiceVersionId) {
        this.currentRecallManagementServiceVersionId = currentRecallManagementServiceVersionId;
        return this;
    }
    public String getCurrentRecallManagementServiceVersionId() {
        return this.currentRecallManagementServiceVersionId;
    }

    public GetRecallManagementServiceResponseBody setCurrentRecallManagementServiceVersionName(String currentRecallManagementServiceVersionName) {
        this.currentRecallManagementServiceVersionName = currentRecallManagementServiceVersionName;
        return this;
    }
    public String getCurrentRecallManagementServiceVersionName() {
        return this.currentRecallManagementServiceVersionName;
    }

    public GetRecallManagementServiceResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetRecallManagementServiceResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetRecallManagementServiceResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetRecallManagementServiceResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetRecallManagementServiceResponseBody setRecallManagementServiceId(String recallManagementServiceId) {
        this.recallManagementServiceId = recallManagementServiceId;
        return this;
    }
    public String getRecallManagementServiceId() {
        return this.recallManagementServiceId;
    }

    public GetRecallManagementServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRecallManagementServiceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
