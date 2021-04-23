// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class CreateBatchTaskAdvanceRequest extends TeaModel {
    @NameInMap("FileUrlObject")
    @Validation(required = true)
    public java.io.InputStream fileUrlObject;

    @NameInMap("BatchTaskType")
    public Integer batchTaskType;

    @NameInMap("OssBucketName")
    public String ossBucketName;

    @NameInMap("OssDataPath")
    public String ossDataPath;

    @NameInMap("OssMetaFile")
    public String ossMetaFile;

    @NameInMap("RoleArn")
    public String roleArn;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CallbackUrl")
    public String callbackUrl;

    public static CreateBatchTaskAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchTaskAdvanceRequest self = new CreateBatchTaskAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateBatchTaskAdvanceRequest setFileUrlObject(java.io.InputStream fileUrlObject) {
        this.fileUrlObject = fileUrlObject;
        return this;
    }
    public java.io.InputStream getFileUrlObject() {
        return this.fileUrlObject;
    }

    public CreateBatchTaskAdvanceRequest setBatchTaskType(Integer batchTaskType) {
        this.batchTaskType = batchTaskType;
        return this;
    }
    public Integer getBatchTaskType() {
        return this.batchTaskType;
    }

    public CreateBatchTaskAdvanceRequest setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public CreateBatchTaskAdvanceRequest setOssDataPath(String ossDataPath) {
        this.ossDataPath = ossDataPath;
        return this;
    }
    public String getOssDataPath() {
        return this.ossDataPath;
    }

    public CreateBatchTaskAdvanceRequest setOssMetaFile(String ossMetaFile) {
        this.ossMetaFile = ossMetaFile;
        return this;
    }
    public String getOssMetaFile() {
        return this.ossMetaFile;
    }

    public CreateBatchTaskAdvanceRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public CreateBatchTaskAdvanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateBatchTaskAdvanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateBatchTaskAdvanceRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

}
