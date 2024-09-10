// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateJenkinsImageScanTaskRequest extends TeaModel {
    /**
     * <p>The digest of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>a8c9f3765684cd8d9053db9523eab58878e99a199217500efd9ae2a860a7e01e</p>
     */
    @NameInMap("Digest")
    public String digest;

    /**
     * <p>The time when the image was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1717430400000</p>
     */
    @NameInMap("ImageCreate")
    public Long imageCreate;

    /**
     * <p>The ID of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>b10ef7b245c34a0822055c74fc4a0e8b5baf0279306316b2c517a501ed250b1e</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The size of the image. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>6120340</p>
     */
    @NameInMap("ImageSize")
    public Long imageSize;

    /**
     * <p>The time when the image was updated.</p>
     * 
     * <strong>example:</strong>
     * <p>1717430498600</p>
     */
    @NameInMap("ImageUpdate")
    public Long imageUpdate;

    /**
     * <p>The information about the Jenkins environment.</p>
     * 
     * <strong>example:</strong>
     * <p>release</p>
     */
    @NameInMap("JenkinsEnv")
    public String jenkinsEnv;

    /**
     * <p>The namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>lkl-zf-ss-ccss</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The name of the image repository.</p>
     * 
     * <strong>example:</strong>
     * <p>sdk</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>119.136.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The tag of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>00f597223f-20210831-1</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>The token that is used to access the Jenkins image repository.</p>
     * 
     * <strong>example:</strong>
     * <p>c3de8326-273e-11fc-a0e3-d012435c****</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>The UUID of the image asset.</p>
     * 
     * <strong>example:</strong>
     * <p>5b268326-273e-44fc-a0e3-9482435c****</p>
     */
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
