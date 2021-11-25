// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ImageItem extends TeaModel {
    // 加速器类型
    @NameInMap("AcceleratorType")
    public String acceleratorType;

    // 镜像包含的框架类型
    @NameInMap("Framework")
    public String framework;

    // 镜像类型
    @NameInMap("ImageProviderType")
    public String imageProviderType;

    // 镜像Tag
    @NameInMap("ImageTag")
    public String imageTag;

    // 镜像地址
    @NameInMap("ImageUrl")
    public String imageUrl;

    // 镜像vpc地址
    @NameInMap("ImageUrlVpc")
    public String imageUrlVpc;

    public static ImageItem build(java.util.Map<String, ?> map) throws Exception {
        ImageItem self = new ImageItem();
        return TeaModel.build(map, self);
    }

    public ImageItem setAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
        return this;
    }
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    public ImageItem setFramework(String framework) {
        this.framework = framework;
        return this;
    }
    public String getFramework() {
        return this.framework;
    }

    public ImageItem setImageProviderType(String imageProviderType) {
        this.imageProviderType = imageProviderType;
        return this;
    }
    public String getImageProviderType() {
        return this.imageProviderType;
    }

    public ImageItem setImageTag(String imageTag) {
        this.imageTag = imageTag;
        return this;
    }
    public String getImageTag() {
        return this.imageTag;
    }

    public ImageItem setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public ImageItem setImageUrlVpc(String imageUrlVpc) {
        this.imageUrlVpc = imageUrlVpc;
        return this;
    }
    public String getImageUrlVpc() {
        return this.imageUrlVpc;
    }

}
