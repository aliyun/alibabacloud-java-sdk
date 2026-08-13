// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListBillingRequest extends TeaModel {
    /**
     * <p>业务来源ID（可选筛选）</p>
     * 
     * <strong>example:</strong>
     * <p>exampleBizId</p>
     */
    @NameInMap("bizId")
    public String bizId;

    /**
     * <p>业务来源类型（可选筛选）</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("bizType")
    public String bizType;

    /**
     * <p>结束时间范围，ISO-8601 字符串，如 2026-08-05T16:30:00.000Z</p>
     * 
     * <strong>example:</strong>
     * <p>2023-10-01T12:00:00Z</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>是否过滤 credit 消耗为 0 的账单，默认 true（过滤）</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ignoreZero")
    public Boolean ignoreZero;

    /**
     * <p>操作类型（可选筛选）</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operation")
    public String operation;

    /**
     * <p>页码</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>每页条数</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>开始时间范围，ISO-8601 字符串，如 2026-08-05T16:30:00.000Z</p>
     * 
     * <strong>example:</strong>
     * <p>2023-10-01T12:00:00Z</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <p>状态（可选筛选）</p>
     * 
     * <strong>example:</strong>
     * <p>READY</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>用户ID（WINNEXO 平台用户ID，可选筛选）</p>
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
