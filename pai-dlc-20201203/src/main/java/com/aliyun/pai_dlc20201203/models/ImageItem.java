// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ImageItem extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>gpu</p>
     */
    @NameInMap("AcceleratorType")
    public String acceleratorType;

    /**
     * <strong>example:</strong>
     * <p>ken</p>
     */
    @NameInMap("AuthorId")
    public String authorId;

    /**
     * <strong>example:</strong>
     * <p>PyTorchJob</p>
     */
    @NameInMap("Framework")
    public String framework;

    /**
     * <strong>example:</strong>
     * <p>Community</p>
     */
    @NameInMap("ImageProviderType")
    public String imageProviderType;

    /**
     * <strong>example:</strong>
     * <p>tensorflow-training:2.3-cpu-py36-ubuntu18.04</p>
     */
    @NameInMap("ImageTag")
    public String imageTag;

    /**
     * <strong>example:</strong>
     * <p>registry.cn-beijing.aliyuncs.com/pai-dlc/tensorflow-training:2.3-cpu-py36-ubuntu18.04</p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <strong>example:</strong>
     * <p>registry-vpc.cn-beijing.aliyuncs.com/pai-dlc/tensorflow-training:2.3-cpu-py36-ubuntu18.04</p>
     */
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

    public ImageItem setAuthorId(String authorId) {
        this.authorId = authorId;
        return this;
    }
    public String getAuthorId() {
        return this.authorId;
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
