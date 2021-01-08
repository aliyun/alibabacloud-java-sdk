// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class CreateBatchTaskRequest extends TeaModel {
    @NameInMap("BatchTaskType")
    public Integer batchTaskType;

    @NameInMap("OssBucketName")
    public String ossBucketName;

    @NameInMap("OssDataPath")
    public String ossDataPath;

    @NameInMap("OssMetaFile")
    public String ossMetaFile;

    @NameInMap("FileUrl")
    public String fileUrl;

    @NameInMap("RoleArn")
    public String roleArn;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateBatchTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchTaskRequest self = new CreateBatchTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateBatchTaskRequest setBatchTaskType(Integer batchTaskType) {
        this.batchTaskType = batchTaskType;
        return this;
    }
    public Integer getBatchTaskType() {
        return this.batchTaskType;
    }

    public CreateBatchTaskRequest setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public CreateBatchTaskRequest setOssDataPath(String ossDataPath) {
        this.ossDataPath = ossDataPath;
        return this;
    }
    public String getOssDataPath() {
        return this.ossDataPath;
    }

    public CreateBatchTaskRequest setOssMetaFile(String ossMetaFile) {
        this.ossMetaFile = ossMetaFile;
        return this;
    }
    public String getOssMetaFile() {
        return this.ossMetaFile;
    }

    public CreateBatchTaskRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public CreateBatchTaskRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public CreateBatchTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateBatchTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
