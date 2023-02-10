// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageRequest extends TeaModel {
    /**
     * <p>The instance ID of the image.</p>
     * <br>
     * <p>>  You can call the [DescribeImageInstances](~~DescribeImageInstances~~) operation to query the IDs of instances.</p>
     */
    @NameInMap("ImageInstanceId")
    public String imageInstanceId;

    /**
     * <p>The region ID of the image.</p>
     * <br>
     * <p>>  You can call the [DescribeImageInstances](~~DescribeImageInstances~~) operation to query the IDs of regions.</p>
     */
    @NameInMap("ImageRegionId")
    public String imageRegionId;

    /**
     * <p>The ID of the image repository.</p>
     * <br>
     * <p>>  You can call the [DescribeImageInstances](~~DescribeImageInstances~~) operation to query the IDs of image repositories.</p>
     */
    @NameInMap("ImageRepoId")
    public String imageRepoId;

    /**
     * <p>The tag that is added to the image.</p>
     * <br>
     * <p>>  You can call the [DescribeImageInstances](~~DescribeImageInstances~~) operation to query tags.</p>
     */
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
