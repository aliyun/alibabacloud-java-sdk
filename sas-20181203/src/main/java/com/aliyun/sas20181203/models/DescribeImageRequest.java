// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageRequest extends TeaModel {
    @NameInMap("ImageInstanceId")
    public String imageInstanceId;

    @NameInMap("ImageRegionId")
    public String imageRegionId;

    @NameInMap("ImageRepoId")
    public String imageRepoId;

    @NameInMap("ImageTag")
    public String imageTag;

    public static DescribeImageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageRequest self = new DescribeImageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageRequest setImageInstanceId(String imageInstanceId) {
        this.imageInstanceId = imageInstanceId;
        return this;
    }
    public String getImageInstanceId() {
        return this.imageInstanceId;
    }

    public DescribeImageRequest setImageRegionId(String imageRegionId) {
        this.imageRegionId = imageRegionId;
        return this;
    }
    public String getImageRegionId() {
        return this.imageRegionId;
    }

    public DescribeImageRequest setImageRepoId(String imageRepoId) {
        this.imageRepoId = imageRepoId;
        return this;
    }
    public String getImageRepoId() {
        return this.imageRepoId;
    }

    public DescribeImageRequest setImageTag(String imageTag) {
        this.imageTag = imageTag;
        return this;
    }
    public String getImageTag() {
        return this.imageTag;
    }

}
