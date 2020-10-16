// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateVideoComposeTaskRequest extends TeaModel {
    @NameInMap("CorpId")
    @Validation(required = true)
    public String corpId;

    @NameInMap("BucketName")
    @Validation(required = true)
    public String bucketName;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("ImageFileNames")
    @Validation(required = true)
    public String imageFileNames;

    @NameInMap("AudioFileName")
    @Validation(required = true)
    public String audioFileName;

    @NameInMap("ImageParameters")
    @Validation(required = true)
    public String imageParameters;

    @NameInMap("VideoFormat")
    public String videoFormat;

    @NameInMap("VideoFrameRate")
    public Integer videoFrameRate;

    public static CreateVideoComposeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoComposeTaskRequest self = new CreateVideoComposeTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateVideoComposeTaskRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public CreateVideoComposeTaskRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public CreateVideoComposeTaskRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateVideoComposeTaskRequest setImageFileNames(String imageFileNames) {
        this.imageFileNames = imageFileNames;
        return this;
    }
    public String getImageFileNames() {
        return this.imageFileNames;
    }

    public CreateVideoComposeTaskRequest setAudioFileName(String audioFileName) {
        this.audioFileName = audioFileName;
        return this;
    }
    public String getAudioFileName() {
        return this.audioFileName;
    }

    public CreateVideoComposeTaskRequest setImageParameters(String imageParameters) {
        this.imageParameters = imageParameters;
        return this;
    }
    public String getImageParameters() {
        return this.imageParameters;
    }

    public CreateVideoComposeTaskRequest setVideoFormat(String videoFormat) {
        this.videoFormat = videoFormat;
        return this;
    }
    public String getVideoFormat() {
        return this.videoFormat;
    }

    public CreateVideoComposeTaskRequest setVideoFrameRate(Integer videoFrameRate) {
        this.videoFrameRate = videoFrameRate;
        return this;
    }
    public Integer getVideoFrameRate() {
        return this.videoFrameRate;
    }

}
