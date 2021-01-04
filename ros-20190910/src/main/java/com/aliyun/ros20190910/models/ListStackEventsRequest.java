// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackEventsRequest extends TeaModel {
    @NameInMap("StackId")
    public String stackId;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("Status")
    public java.util.List<String> status;

    @NameInMap("ResourceType")
    public java.util.List<String> resourceType;

    @NameInMap("LogicalResourceId")
    public java.util.List<String> logicalResourceId;

    public static ListStackEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStackEventsRequest self = new ListStackEventsRequest();
        return TeaModel.build(map, self);
    }

    public ListStackEventsRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public ListStackEventsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListStackEventsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListStackEventsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListStackEventsRequest setStatus(java.util.List<String> status) {
        this.status = status;
        return this;
    }
    public java.util.List<String> getStatus() {
        return this.status;
    }

    public ListStackEventsRequest setResourceType(java.util.List<String> resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public java.util.List<String> getResourceType() {
        return this.resourceType;
    }

    public ListStackEventsRequest setLogicalResourceId(java.util.List<String> logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
        return this;
    }
    public java.util.List<String> getLogicalResourceId() {
        return this.logicalResourceId;
    }

}
