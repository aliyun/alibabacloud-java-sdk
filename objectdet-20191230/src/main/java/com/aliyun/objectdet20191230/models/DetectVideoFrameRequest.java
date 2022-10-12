// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVideoFrameRequest extends TeaModel {
    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("FeatureConfig")
    public String featureConfig;

    @NameInMap("Features")
    public java.util.List<String> features;

    @NameInMap("Height")
    public Long height;

    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("StreamArn")
    public String streamArn;

    @NameInMap("Width")
    public Long width;

    public static DetectVideoFrameRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectVideoFrameRequest self = new DetectVideoFrameRequest();
        return TeaModel.build(map, self);
    }

    public DetectVideoFrameRequest setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public DetectVideoFrameRequest setFeatureConfig(String featureConfig) {
        this.featureConfig = featureConfig;
        return this;
    }
    public String getFeatureConfig() {
        return this.featureConfig;
    }

    public DetectVideoFrameRequest setFeatures(java.util.List<String> features) {
        this.features = features;
        return this;
    }
    public java.util.List<String> getFeatures() {
        return this.features;
    }

    public DetectVideoFrameRequest setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

    public DetectVideoFrameRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public DetectVideoFrameRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DetectVideoFrameRequest setStreamArn(String streamArn) {
        this.streamArn = streamArn;
        return this;
    }
    public String getStreamArn() {
        return this.streamArn;
    }

    public DetectVideoFrameRequest setWidth(Long width) {
        this.width = width;
        return this;
    }
    public Long getWidth() {
        return this.width;
    }

}
