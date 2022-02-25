// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateJenkinsImageScanTaskRequest extends TeaModel {
    // 镜像 digest
    @NameInMap("Digest")
    public String digest;

    // 创建时间，timestamp
    @NameInMap("ImageCreate")
    public Long imageCreate;

    // imageId
    @NameInMap("ImageId")
    public String imageId;

    // 镜像大小，字节
    @NameInMap("ImageSize")
    public Long imageSize;

    // 修改时间，timestamp
    @NameInMap("ImageUpdate")
    public Long imageUpdate;

    @NameInMap("JenkinsEnv")
    public String jenkinsEnv;

    // 镜像命名空间，可选
    @NameInMap("Namespace")
    public String namespace;

    // repo名称
    @NameInMap("RepoName")
    public String repoName;

    @NameInMap("SourceIp")
    public String sourceIp;

    // 镜像标签
    @NameInMap("Tag")
    public String tag;

    // jenkins 镜像仓库 token，必填
    @NameInMap("Token")
    public String token;

    // 资产 uuid
    @NameInMap("Uuid")
    public String uuid;

    public static CreateJenkinsImageScanTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJenkinsImageScanTaskRequest self = new CreateJenkinsImageScanTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateJenkinsImageScanTaskRequest setDigest(String digest) {
        this.digest = digest;
        return this;
    }
    public String getDigest() {
        return this.digest;
    }

    public CreateJenkinsImageScanTaskRequest setImageCreate(Long imageCreate) {
        this.imageCreate = imageCreate;
        return this;
    }
    public Long getImageCreate() {
        return this.imageCreate;
    }

    public CreateJenkinsImageScanTaskRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateJenkinsImageScanTaskRequest setImageSize(Long imageSize) {
        this.imageSize = imageSize;
        return this;
    }
    public Long getImageSize() {
        return this.imageSize;
    }

    public CreateJenkinsImageScanTaskRequest setImageUpdate(Long imageUpdate) {
        this.imageUpdate = imageUpdate;
        return this;
    }
    public Long getImageUpdate() {
        return this.imageUpdate;
    }

    public CreateJenkinsImageScanTaskRequest setJenkinsEnv(String jenkinsEnv) {
        this.jenkinsEnv = jenkinsEnv;
        return this;
    }
    public String getJenkinsEnv() {
        return this.jenkinsEnv;
    }

    public CreateJenkinsImageScanTaskRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateJenkinsImageScanTaskRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public CreateJenkinsImageScanTaskRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateJenkinsImageScanTaskRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public CreateJenkinsImageScanTaskRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public CreateJenkinsImageScanTaskRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
