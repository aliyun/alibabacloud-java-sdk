// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCImageListRequest extends TeaModel {
    /**
     * <p>The image architecture. Valid values:</p>
     * <ul>
     * <li>x86_64</li>
     * <li>arm64</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>x86_64</p>
     */
    @NameInMap("Architecture")
    public String architecture;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The image type. Set the value to <strong>self</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>self</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeRCImageListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCImageListRequest self = new DescribeRCImageListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRCImageListRequest setArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }
    public String getArchitecture() {
        return this.architecture;
    }

    public DescribeRCImageListRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeRCImageListRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public DescribeRCImageListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRCImageListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRCImageListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRCImageListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
