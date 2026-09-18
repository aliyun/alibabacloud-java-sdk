// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListTensorboardsRequest extends TeaModel {
    /**
     * <p>The visibility of the job. Valid values:</p>
     * <ul>
     * <li>PUBLIC: Visible to all users in this workspace.</li>
     * <li>PRIVATE: Visible only to you and administrators in this workspace.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The display name of the Tensorboard instance.</p>
     * 
     * <strong>example:</strong>
     * <p>TestTensorboard</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The end time of the query range. The creation time of the Tensorboard instance in UTC is used for filtering. If this parameter is left empty, the default value is the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-09T14:45:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Filters Tensorboard instances by DLC job ID. See <a href="https://help.aliyun.com/document_detail/459676.html">ListJobs</a> to obtain the job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dlc-xxx</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li>desc: Descending order.</li>
     * <li>asc: Ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number of the page to return in a paged query. The value starts from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of Tensorboard instances to return per page in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The billing type of the Tensorboard instance. Valid values:</p>
     * <ul>
     * <li>Free: The Tensorboard instance uses free resources.</li>
     * <li>Postpaid: The Tensorboard instance uses pay-as-you-go resources.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>The resource quota ID.</p>
     * <blockquote>
     * <ul>
     * <li>Currently, only whitelisted users can use resource quota resources to create Tensorboard instances. To use this feature, contact us.</li>
     * <li>This value is valid only when the Tensorboard instance uses resource quota resources.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>quota12***</p>
     */
    @NameInMap("QuotaId")
    public String quotaId;

    /**
     * <p>Specifies whether to return only Tensorboard instances created by the current user.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ShowOwn")
    public Boolean showOwn;

    /**
     * <p>Sorts the results by the following fields. Valid values:</p>
     * <ul>
     * <li>DisplayName: The job name.</li>
     * <li>GmtCreateTime: The job creation time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The data source ID. See <a href="https://help.aliyun.com/document_detail/459676.html">ListJobs</a> to obtain the job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dlc-xxxxxx</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The data source type. Currently, only DLC training jobs are supported, which means the value is job.</p>
     * 
     * <strong>example:</strong>
     * <p>job</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The start time of the query range. The creation time of the Tensorboard instance in UTC is used for filtering. If this parameter is left empty, the default value is 7 days before the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-08T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The Tensorboard status. Valid values:</p>
     * <ul>
     * <li>Creating: Being created.</li>
     * <li>Running: Running.</li>
     * <li>Stopped: Stopped.</li>
     * <li>Succeeded: Succeeded.</li>
     * <li>Failed: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Filters the Tensorboard list by Tensorboard ID.</p>
     * 
     * <strong>example:</strong>
     * <p>tensorboard-xxx</p>
     */
    @NameInMap("TensorboardId")
    public String tensorboardId;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>161****3000</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The username.</p>
     * 
     * <strong>example:</strong>
     * <p>she****mo</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>Specifies whether to show details. Valid values:</p>
     * <ul>
     * <li>true: Show details.</li>
     * <li>false: Do not show details.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Verbose")
    public Boolean verbose;

    /**
     * <p>The workspace ID. The Tensorboard list is retrieved based on the workspace ID. &lt;props=&quot;china&quot;&gt;See <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>380</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListTensorboardsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTensorboardsRequest self = new ListTensorboardsRequest();
        return TeaModel.build(map, self);
    }

    public ListTensorboardsRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public ListTensorboardsRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ListTensorboardsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListTensorboardsRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ListTensorboardsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListTensorboardsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTensorboardsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTensorboardsRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public ListTensorboardsRequest setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public ListTensorboardsRequest setShowOwn(Boolean showOwn) {
        this.showOwn = showOwn;
        return this;
    }
    public Boolean getShowOwn() {
        return this.showOwn;
    }

    public ListTensorboardsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListTensorboardsRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public ListTensorboardsRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ListTensorboardsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListTensorboardsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListTensorboardsRequest setTensorboardId(String tensorboardId) {
        this.tensorboardId = tensorboardId;
        return this;
    }
    public String getTensorboardId() {
        return this.tensorboardId;
    }

    public ListTensorboardsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ListTensorboardsRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public ListTensorboardsRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

    public ListTensorboardsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
