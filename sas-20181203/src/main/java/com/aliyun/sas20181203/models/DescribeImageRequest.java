// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageRequest extends TeaModel {
    /**
     * <p>The image instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeImageInstances~~">DescribeImageInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-hfs6gaawhyu6****</p>
     */
    @NameInMap("ImageInstanceId")
    public String imageInstanceId;

    /**
     * <p>The region ID of the image.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeImageInstances~~">DescribeImageInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ImageRegionId")
    public String imageRegionId;

    /**
     * <p>The image repository ID.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeImageInstances~~">DescribeImageInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crr-7i88t7lx3fmf****</p>
     */
    @NameInMap("ImageRepoId")
    public String imageRepoId;

    /**
     * <p>The image tag.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeImageInstances~~">DescribeImageInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.8.0.15</p>
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
