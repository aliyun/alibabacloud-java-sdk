// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class DescribeDownloadImageInfoRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("DownloadType")
    public String downloadType;

    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>ImageUserBuyId</p>
     */
    @NameInMap("ImageUserBuyId")
    public Long imageUserBuyId;

    @NameInMap("SpecificationName")
    public String specificationName;

    public static DescribeDownloadImageInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadImageInfoRequest self = new DescribeDownloadImageInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadImageInfoRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DescribeDownloadImageInfoRequest setDownloadType(String downloadType) {
        this.downloadType = downloadType;
        return this;
    }
    public String getDownloadType() {
        return this.downloadType;
    }

    public DescribeDownloadImageInfoRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeDownloadImageInfoRequest setImageUserBuyId(Long imageUserBuyId) {
        this.imageUserBuyId = imageUserBuyId;
        return this;
    }
    public Long getImageUserBuyId() {
        return this.imageUserBuyId;
    }

    public DescribeDownloadImageInfoRequest setSpecificationName(String specificationName) {
        this.specificationName = specificationName;
        return this;
    }
    public String getSpecificationName() {
        return this.specificationName;
    }

}
