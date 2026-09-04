// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListBillingRequest extends TeaModel {
    /**
     * <p>The unique business identifier. When bizType is LibraryChat, bizId refers to the document library ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleBizId</p>
     */
    @NameInMap("bizId")
    public String bizId;

    /**
     * <p>The business type. Currently supported values: model Q&amp;A (LlmChat) and document library Q&amp;A (LibraryChat).</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("bizType")
    public String bizType;

    /**
     * <p>The actual end timestamp of the live stream, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-10-01T12:00:00Z</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>Specifies whether to filter out bills with zero credit consumption. Default value: true (filter out).</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ignoreZero")
    public Boolean ignoreZero;

    /**
     * <p>The operation type. Valid values:</p>
     * <ul>
     * <li>start: indicates task creation. This is the default value and does not need to be explicitly set in most cases.</li>
     * <li>stop: stops a real-time meeting task. This corresponds to the creation of a real-time meeting. After the meeting ends, set this to stop to trigger the call. This is used in real-time meeting scenarios.</li>
     * </ul>
     * <p>Note: When ending a real-time recording, you must set this parameter to stop.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operation")
    public String operation;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>The number of entries per page. Default value: 20. Minimum value: 1. Maximum value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The query start time. The value is a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-10-01T12:00:00Z</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <p>The task status. The status is returned as Running upon submission.</p>
     * 
     * <strong>example:</strong>
     * <p>READY</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The tenant ID. This is a common parameter. In winnexo-cli, pass it explicitly with --tenant-id.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The user ID (WINNEXO platform user ID, optional filter).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("wnUserId")
    public String wnUserId;

    public static ListBillingRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBillingRequest self = new ListBillingRequest();
        return TeaModel.build(map, self);
    }

    public ListBillingRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ListBillingRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ListBillingRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListBillingRequest setIgnoreZero(Boolean ignoreZero) {
        this.ignoreZero = ignoreZero;
        return this;
    }
    public Boolean getIgnoreZero() {
        return this.ignoreZero;
    }

    public ListBillingRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public ListBillingRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListBillingRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListBillingRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListBillingRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListBillingRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListBillingRequest setWnUserId(String wnUserId) {
        this.wnUserId = wnUserId;
        return this;
    }
    public String getWnUserId() {
        return this.wnUserId;
    }

}
