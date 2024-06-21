// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListChangeSetsRequest extends TeaModel {
    /**
     * <p>The ID of the change set. If detailed information about the change set is not required, you can use this parameter to replace the GetChangeSet operation.</p>
     * 
     * <strong>example:</strong>
     * <p>1f6521a4-05af-4975-afe9-bc4b45ad****</p>
     */
    @NameInMap("ChangeSetId")
    public String changeSetId;

    /**
     * <p>The name of change set N. Maximum value of N: 5. You can use an asterisk (\*) as a wildcard for fuzzy search.</p>
     * 
     * <strong>example:</strong>
     * <p>MyChangeSet</p>
     */
    @NameInMap("ChangeSetName")
    public java.util.List<String> changeSetName;

    /**
     * <p>The execution status of change set N. Maximum value of N: 5. Valid values:</p>
     * <ul>
     * <li>UNAVAILABLE</li>
     * <li>AVAILABLE</li>
     * <li>EXECUTE_IN_PROGRESS</li>
     * <li>EXECUTE_COMPLETE</li>
     * <li>EXECUTE_FAILED</li>
     * <li>OBSOLETE</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AVAILABLE</p>
     */
    @NameInMap("ExecutionStatus")
    public java.util.List<String> executionStatus;

    /**
     * <p>The page number.\
     * Pages start from page 1.\
     * Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.\
     * Valid values: 1 to 50.\
     * Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region ID of the change set. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the stack.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
     */
    @NameInMap("StackId")
    public String stackId;

    /**
     * <p>The status of change set N. Maximum value of N: 5. Valid values:</p>
     * <ul>
     * <li>CREATE_PENDING</li>
     * <li>CREATE_IN_PROGRESS</li>
     * <li>CREATE_COMPLETE</li>
     * <li>CREATE_FAILED</li>
     * <li>DELETE_FAILED</li>
     * <li>DELETE_COMPLETE</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CREATE_COMPLETE</p>
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
