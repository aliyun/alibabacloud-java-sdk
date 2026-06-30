// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribePackageDeductionsRequest extends TeaModel {
    /**
     * <p>The end time, in Unix timestamp format.</p>
     * 
     * <strong>example:</strong>
     * <p>1709117383000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>An array of instance IDs. If you specify this parameter, the <code>PackageIds</code> parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>An array of package IDs.</p>
     */
    @NameInMap("PackageIds")
    public java.util.List<String> packageIds;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>Desktop</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("ResourceTypes")
    public java.util.List<String> resourceTypes;

    /**
     * <p>The start time, in Unix timestamp format.</p>
     * 
     * <strong>example:</strong>
     * <p>1709117383000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribePackageDeductionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePackageDeductionsRequest self = new DescribePackageDeductionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePackageDeductionsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribePackageDeductionsRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DescribePackageDeductionsRequest setPackageIds(java.util.List<String> packageIds) {
        this.packageIds = packageIds;
        return this;
    }
    public java.util.List<String> getPackageIds() {
        return this.packageIds;
    }

    public DescribePackageDeductionsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribePackageDeductionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePackageDeductionsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribePackageDeductionsRequest setResourceTypes(java.util.List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public java.util.List<String> getResourceTypes() {
        return this.resourceTypes;
    }

    public DescribePackageDeductionsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
