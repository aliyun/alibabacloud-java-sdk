// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dinga93c84f4d***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MustHasCdc")
    public Boolean mustHasCdc;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-acfmyst47hjw***</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>enterprise</p>
     */
    @NameInMap("Series")
    public String series;

    /**
     * <strong>example:</strong>
     * <p>[{\&quot;TagKey\&quot;:\&quot;test\&quot;,\&quot;TagValue\&quot;:\&quot;test-value\&quot;}]</p>
     */
    @NameInMap("Tags")
    public String tags;

    public static DescribeDBInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesRequest self = new DescribeDBInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDBInstancesRequest setMustHasCdc(Boolean mustHasCdc) {
        this.mustHasCdc = mustHasCdc;
        return this;
    }
    public Boolean getMustHasCdc() {
        return this.mustHasCdc;
    }

    public DescribeDBInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDBInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDBInstancesRequest setSeries(String series) {
        this.series = series;
        return this;
    }
    public String getSeries() {
        return this.series;
    }

    public DescribeDBInstancesRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
