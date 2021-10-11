// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class UpdateAiStoreUserTaskRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("ApiName")
    public String apiName;

    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("BucketKeyPrefix")
    public String bucketKeyPrefix;

    @NameInMap("Name")
    public String name;

    @NameInMap("ParamInfo")
    public String paramInfo;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("ReceiveConfig")
    public String receiveConfig;

    @NameInMap("Status")
    public String status;

    @NameInMap("Id")
    public Long id;

    public static UpdateAiStoreUserTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiStoreUserTaskRequest self = new UpdateAiStoreUserTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAiStoreUserTaskRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public UpdateAiStoreUserTaskRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public UpdateAiStoreUserTaskRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public UpdateAiStoreUserTaskRequest setBucketKeyPrefix(String bucketKeyPrefix) {
        this.bucketKeyPrefix = bucketKeyPrefix;
        return this;
    }
    public String getBucketKeyPrefix() {
        return this.bucketKeyPrefix;
    }

    public UpdateAiStoreUserTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAiStoreUserTaskRequest setParamInfo(String paramInfo) {
        this.paramInfo = paramInfo;
        return this;
    }
    public String getParamInfo() {
        return this.paramInfo;
    }

    public UpdateAiStoreUserTaskRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateAiStoreUserTaskRequest setReceiveConfig(String receiveConfig) {
        this.receiveConfig = receiveConfig;
        return this;
    }
    public String getReceiveConfig() {
        return this.receiveConfig;
    }

    public UpdateAiStoreUserTaskRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateAiStoreUserTaskRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
