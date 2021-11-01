// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVideoFrameShrinkRequest extends TeaModel {
    // 图片创建时间
    @NameInMap("CreateTime")
    public Long createTime;

    // AI每个功能具体配置描述，每个AI算法配置都不一样
    @NameInMap("FeatureConfig")
    public String featureConfig;

    // AI功能名称列表
    @NameInMap("Features")
    public String featuresShrink;

    // 图像高度
    @NameInMap("Height")
    public Long height;

    // 图片URL地址
    @NameInMap("ImageURL")
    public String imageURL;

    // 自用拥有者pk
    @NameInMap("OwnerId")
    public Long ownerId;

    // 流资源唯一描述
    @NameInMap("StreamArn")
    public String streamArn;

    // 图像宽度
    @NameInMap("Width")
    public Long width;

    public static DetectVideoFrameShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectVideoFrameShrinkRequest self = new DetectVideoFrameShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DetectVideoFrameShrinkRequest setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public DetectVideoFrameShrinkRequest setFeatureConfig(String featureConfig) {
        this.featureConfig = featureConfig;
        return this;
    }
    public String getFeatureConfig() {
        return this.featureConfig;
    }

    public DetectVideoFrameShrinkRequest setFeaturesShrink(String featuresShrink) {
        this.featuresShrink = featuresShrink;
        return this;
    }
    public String getFeaturesShrink() {
        return this.featuresShrink;
    }

    public DetectVideoFrameShrinkRequest setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

    public DetectVideoFrameShrinkRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public DetectVideoFrameShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DetectVideoFrameShrinkRequest setStreamArn(String streamArn) {
        this.streamArn = streamArn;
        return this;
    }
    public String getStreamArn() {
        return this.streamArn;
    }

    public DetectVideoFrameShrinkRequest setWidth(Long width) {
        this.width = width;
        return this;
    }
    public Long getWidth() {
        return this.width;
    }

}
