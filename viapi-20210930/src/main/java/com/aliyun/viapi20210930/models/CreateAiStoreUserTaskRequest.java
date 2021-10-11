// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class CreateAiStoreUserTaskRequest extends TeaModel {
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

    public static CreateAiStoreUserTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAiStoreUserTaskRequest self = new CreateAiStoreUserTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateAiStoreUserTaskRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public CreateAiStoreUserTaskRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public CreateAiStoreUserTaskRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public CreateAiStoreUserTaskRequest setBucketKeyPrefix(String bucketKeyPrefix) {
        this.bucketKeyPrefix = bucketKeyPrefix;
        return this;
    }
    public String getBucketKeyPrefix() {
        return this.bucketKeyPrefix;
    }

    public CreateAiStoreUserTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAiStoreUserTaskRequest setParamInfo(String paramInfo) {
        this.paramInfo = paramInfo;
        return this;
    }
    public String getParamInfo() {
        return this.paramInfo;
    }

    public CreateAiStoreUserTaskRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateAiStoreUserTaskRequest setReceiveConfig(String receiveConfig) {
        this.receiveConfig = receiveConfig;
        return this;
    }
    public String getReceiveConfig() {
        return this.receiveConfig;
    }

    public CreateAiStoreUserTaskRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
