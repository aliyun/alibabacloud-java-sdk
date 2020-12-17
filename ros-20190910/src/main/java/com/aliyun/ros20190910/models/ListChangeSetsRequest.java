// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListChangeSetsRequest extends TeaModel {
    @NameInMap("StackId")
    @Validation(required = true)
    public String stackId;

    @NameInMap("Status")
    public java.util.List<String> status;

    @NameInMap("ChangeSetName")
    public java.util.List<String> changeSetName;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("ExecutionStatus")
    public java.util.List<String> executionStatus;

    @NameInMap("ChangeSetId")
    public String changeSetId;

    public static ListChangeSetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChangeSetsRequest self = new ListChangeSetsRequest();
        return TeaModel.build(map, self);
    }

    public ListChangeSetsRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public ListChangeSetsRequest setStatus(java.util.List<String> status) {
        this.status = status;
        return this;
    }
    public java.util.List<String> getStatus() {
        return this.status;
    }

    public ListChangeSetsRequest setChangeSetName(java.util.List<String> changeSetName) {
        this.changeSetName = changeSetName;
        return this;
    }
    public java.util.List<String> getChangeSetName() {
        return this.changeSetName;
    }

    public ListChangeSetsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListChangeSetsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListChangeSetsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListChangeSetsRequest setExecutionStatus(java.util.List<String> executionStatus) {
        this.executionStatus = executionStatus;
        return this;
    }
    public java.util.List<String> getExecutionStatus() {
        return this.executionStatus;
    }

    public ListChangeSetsRequest setChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
        return this;
    }
    public String getChangeSetId() {
        return this.changeSetId;
    }

}
