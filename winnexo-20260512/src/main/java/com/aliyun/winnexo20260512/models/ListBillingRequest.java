// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListBillingRequest extends TeaModel {
    /**
     * <p>The platform application token issued by the console. If you specify this parameter, the request is executed as the user specified by opsUserId or opsUserCode.</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The unique identifier of the business. When bizType is set to LibraryChat, bizId refers to the ID of the document library.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleBizId</p>
     */
    @NameInMap("bizId")
    public String bizId;

    /**
     * <p>The business type. Valid values: LlmChat (model Q&amp;A) and LibraryChat (document library Q&amp;A).</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("bizType")
    public String bizType;

    /**
     * <p>The actual end timestamp of the live stream. The value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-10-01T12:00:00Z</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>Specifies whether to filter out bills with zero credit consumption. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ignoreZero")
    public Boolean ignoreZero;

    /**
     * <p>The operation item. Valid values:</p>
     * <ul>
     * <li>start: indicates the creation of a task. This is the default value and usually does not need to be explicitly specified.</li>
     * <li>stop: stops a real-time meeting task. This corresponds to the creation of a real-time meeting and is set to stop to trigger a call after the meeting ends. This value is used in real-time meeting scenarios.
     * Note: When you end a real-time recording, you must set this parameter to stop.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operation")
    public String operation;

    /**
     * <p>The code of the proxy user, which is unique within the tenant. This parameter is used only when the application credential is configured as source_uid.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>The ID of the proxy user, which is the WINNEXO platform user ID. This parameter is used only when the application credential is configured as winnexo_uid.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

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
     * <p>The start time of the query. The value is a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-10-01T12:00:00Z</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <p>The task status. A status of Running is returned immediately after the task is submitted.</p>
     * 
     * <strong>example:</strong>
     * <p>READY</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The tenant ID. This is a common parameter. For winnexo-cli, this parameter is explicitly passed by using --tenant-id.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The user ID, which is the WINNEXO platform user ID. This parameter is optional for filtering.</p>
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

    public ListBillingRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
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

    public ListBillingRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public ListBillingRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
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
