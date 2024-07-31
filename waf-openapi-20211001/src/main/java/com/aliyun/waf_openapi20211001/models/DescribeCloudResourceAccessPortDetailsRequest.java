// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeCloudResourceAccessPortDetailsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf-cn-tl32ast****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>443</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <strong>example:</strong>
     * <p>https</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-2zeugkfj81jvo****4tqm</p>
     */
    @NameInMap("ResourceInstanceId")
    public String resourceInstanceId;

    /**
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>clb7</p>
     */
    @NameInMap("ResourceProduct")
    public String resourceProduct;

    public static DescribeCloudResourceAccessPortDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudResourceAccessPortDetailsRequest self = new DescribeCloudResourceAccessPortDetailsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudResourceAccessPortDetailsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeCloudResourceAccessPortDetailsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCloudResourceAccessPortDetailsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCloudResourceAccessPortDetailsRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public DescribeCloudResourceAccessPortDetailsRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public DescribeCloudResourceAccessPortDetailsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCloudResourceAccessPortDetailsRequest setResourceInstanceId(String resourceInstanceId) {
        this.resourceInstanceId = resourceInstanceId;
        return this;
    }
    public String getResourceInstanceId() {
        return this.resourceInstanceId;
    }

    public DescribeCloudResourceAccessPortDetailsRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeCloudResourceAccessPortDetailsRequest setResourceProduct(String resourceProduct) {
        this.resourceProduct = resourceProduct;
        return this;
    }
    public String getResourceProduct() {
        return this.resourceProduct;
    }

}
