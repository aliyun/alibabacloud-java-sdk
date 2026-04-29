// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetRecallManagementServiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentRecallManagementServiceVersionId")
    public String currentRecallManagementServiceVersionId;

    /**
     * <strong>example:</strong>
     * <p>version-1</p>
     */
    @NameInMap("CurrentRecallManagementServiceVersionName")
    public String currentRecallManagementServiceVersionName;

    /**
     * <strong>example:</strong>
     * <p>this is a test recall</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>2021-12-15T23:24:33.132+08:00</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <strong>example:</strong>
     * <p>2021-12-15T23:24:33.132+08:00</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <strong>example:</strong>
     * <p>hot_group_recall</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RecallManagementServiceId")
    public String recallManagementServiceId;

    /**
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Online</p>
     */
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
