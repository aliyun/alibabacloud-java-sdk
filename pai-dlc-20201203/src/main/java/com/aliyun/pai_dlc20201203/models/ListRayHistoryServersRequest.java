// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListRayHistoryServersRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <strong>example:</strong>
     * <p>2020-11-09T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("IdPrefix")
    public String idPrefix;

    /**
     * <strong>example:</strong>
     * <p>2020-11-09T16:00:00Z</p>
     */
    @NameInMap("ModifiedAfter")
    public String modifiedAfter;

    /**
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

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
     * <p>Postpaid</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <strong>example:</strong>
     * <p>quotaxxx</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ShowOwn")
    public Boolean showOwn;

    /**
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <strong>example:</strong>
     * <p>2020-11-08T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("UserIdForFilter")
    public String userIdForFilter;

    /**
     * <strong>example:</strong>
     * <p>myusername</p>
     */
    @NameInMap("Username")
    public String username;

    /**
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
