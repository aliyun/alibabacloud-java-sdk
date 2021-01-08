// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class ListBatchTaskRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("BatchTaskType")
    public String batchTaskType;

    @NameInMap("Status")
    public String status;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("DataPath")
    public String dataPath;

    public static ListBatchTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBatchTaskRequest self = new ListBatchTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListBatchTaskRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListBatchTaskRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListBatchTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListBatchTaskRequest setBatchTaskType(String batchTaskType) {
        this.batchTaskType = batchTaskType;
        return this;
    }
    public String getBatchTaskType() {
        return this.batchTaskType;
    }

    public ListBatchTaskRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListBatchTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListBatchTaskRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public ListBatchTaskRequest setDataPath(String dataPath) {
        this.dataPath = dataPath;
        return this;
    }
    public String getDataPath() {
        return this.dataPath;
    }

}
