// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListChangeSetsRequest extends TeaModel {
    /**
     * <p>The ID of the change set. If detailed information about the change set is not required, you can use this parameter to replace the GetChangeSet operation.</p>
     */
    @NameInMap("ChangeSetId")
    public String changeSetId;

    /**
     * <p>The name of change set N. Maximum value of N: 5. You can use an asterisk (\*) as a wildcard for fuzzy search.</p>
     */
    @NameInMap("ChangeSetName")
    public java.util.List<String> changeSetName;

    /**
     * <p>The execution status of change set N. Maximum value of N: 5. Valid values:</p>
     * <br>
     * <p>*   UNAVAILABLE</p>
     * <p>*   AVAILABLE</p>
     * <p>*   EXECUTE_IN_PROGRESS</p>
     * <p>*   EXECUTE_COMPLETE</p>
     * <p>*   EXECUTE_FAILED</p>
     * <p>*   OBSOLETE</p>
     */
    @NameInMap("ExecutionStatus")
    public java.util.List<String> executionStatus;

    /**
     * <p>The page number.\</p>
     * <p>Pages start from page 1.\</p>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.\</p>
     * <p>Valid values: 1 to 50.\</p>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region ID of the change set. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the stack.</p>
     */
    @NameInMap("StackId")
    public String stackId;

    /**
     * <p>The status of change set N. Maximum value of N: 5. Valid values:</p>
     * <br>
     * <p>*   CREATE_PENDING</p>
     * <p>*   CREATE_IN_PROGRESS</p>
     * <p>*   CREATE_COMPLETE</p>
     * <p>*   CREATE_FAILED</p>
     * <p>*   DELETE_FAILED</p>
     * <p>*   DELETE_COMPLETE</p>
     */
    @NameInMap("Status")
    public java.util.List<String> status;

    public static ListChangeSetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChangeSetsRequest self = new ListChangeSetsRequest();
        return TeaModel.build(map, self);
    }

    public ListChangeSetsRequest setChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
        return this;
    }
    public String getChangeSetId() {
        return this.changeSetId;
    }

    public ListChangeSetsRequest setChangeSetName(java.util.List<String> changeSetName) {
        this.changeSetName = changeSetName;
        return this;
    }
    public java.util.List<String> getChangeSetName() {
        return this.changeSetName;
    }

    public ListChangeSetsRequest setExecutionStatus(java.util.List<String> executionStatus) {
        this.executionStatus = executionStatus;
        return this;
    }
    public java.util.List<String> getExecutionStatus() {
        return this.executionStatus;
    }

    public ListChangeSetsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
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

}
