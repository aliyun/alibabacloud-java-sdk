// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListRayHistoryServersRequest extends TeaModel {
    /**
     * <p>The display name of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The end time of the query range. The job creation time is used for filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-09T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID prefix.</p>
     * 
     * <strong>example:</strong>
     * <p>按ID前缀过滤</p>
     */
    @NameInMap("IdPrefix")
    public String idPrefix;

    /**
     * <p>Filters results by the time after which they were modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-09T16:00:00Z</p>
     */
    @NameInMap("ModifiedAfter")
    public String modifiedAfter;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li>desc: descending order.</li>
     * <li>asc: ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number of the page to return in a paged query. Paging starts from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of RayHistoryServer entries to return on each page in a paged query. Paging is used to return results in batches.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li>PrePaid</li>
     * <li>PostPaid.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>The resource group ID. For information about how to query the ID of a dedicated resource group, see <a href="https://help.aliyun.com/document_detail/2651299.html">Manage resource quotas</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>quotaxxx</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>Specifies whether to return only the RayHistoryServer entries created by the current user.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ShowOwn")
    public Boolean showOwn;

    /**
     * <p>The field by which to sort the returned results. Valid values:</p>
     * <ul>
     * <li>DisplayName</li>
     * <li>GmtCreateTime</li>
     * <li>UserId</li>
     * <li>ResourceId</li>
     * <li>Status</li>
     * <li>GmtModifyTime.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-08T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The RayHistoryServer status. Valid values:</p>
     * <ul>
     * <li>Creating: being created.</li>
     * <li>Queuing: waiting in queue.</li>
     * <li>Running: running.</li>
     * <li>Stopped: stopped.</li>
     * <li>Failed: failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The storage path of Ray logs.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://bucket-test-hangzhou.oss-cn-hangzhou-internal.aliyuncs.com/tmp</p>
     */
    @NameInMap("StoragePath")
    public String storagePath;

    /**
     * <p>Filters results by user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("UserIdForFilter")
    public String userIdForFilter;

    /**
     * <p>Filters results by username.</p>
     * 
     * <strong>example:</strong>
     * <p>myusername</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The workspace ID. &lt;props=&quot;china&quot;&gt;For information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>..</p>
     * 
     * <strong>example:</strong>
     * <p>268</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListRayHistoryServersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRayHistoryServersRequest self = new ListRayHistoryServersRequest();
        return TeaModel.build(map, self);
    }

    public ListRayHistoryServersRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ListRayHistoryServersRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListRayHistoryServersRequest setIdPrefix(String idPrefix) {
        this.idPrefix = idPrefix;
        return this;
    }
    public String getIdPrefix() {
        return this.idPrefix;
    }

    public ListRayHistoryServersRequest setModifiedAfter(String modifiedAfter) {
        this.modifiedAfter = modifiedAfter;
        return this;
    }
    public String getModifiedAfter() {
        return this.modifiedAfter;
    }

    public ListRayHistoryServersRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListRayHistoryServersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRayHistoryServersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRayHistoryServersRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public ListRayHistoryServersRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListRayHistoryServersRequest setShowOwn(Boolean showOwn) {
        this.showOwn = showOwn;
        return this;
    }
    public Boolean getShowOwn() {
        return this.showOwn;
    }

    public ListRayHistoryServersRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListRayHistoryServersRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListRayHistoryServersRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListRayHistoryServersRequest setStoragePath(String storagePath) {
        this.storagePath = storagePath;
        return this;
    }
    public String getStoragePath() {
        return this.storagePath;
    }

    public ListRayHistoryServersRequest setUserIdForFilter(String userIdForFilter) {
        this.userIdForFilter = userIdForFilter;
        return this;
    }
    public String getUserIdForFilter() {
        return this.userIdForFilter;
    }

    public ListRayHistoryServersRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public ListRayHistoryServersRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
