// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListBillingResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("list")
    public java.util.List<ListBillingResponseBodyList> list;

    /**
     * <p>错误描述，成功时为空</p>
     */
    @NameInMap("message")
    public String message;

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
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>总数</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListBillingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBillingResponseBody self = new ListBillingResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBillingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBillingResponseBody setList(java.util.List<ListBillingResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListBillingResponseBodyList> getList() {
        return this.list;
    }

    public ListBillingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListBillingResponseBody setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListBillingResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListBillingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBillingResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListBillingResponseBodyList extends TeaModel {
        /**
         * <p>账单业务ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleBillingId</p>
         */
        @NameInMap("billingId")
        public String billingId;

        /**
         * <p>业务来源ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleBizId</p>
         */
        @NameInMap("bizId")
        public String bizId;

        /**
         * <p>业务来源类型</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("bizType")
        public String bizType;

        /**
         * <p>costSource</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("costSource")
        public java.util.List<String> costSource;

        /**
         * <p>costSourceDisplayName</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("costSourceDisplayName")
        public java.util.List<String> costSourceDisplayName;

        /**
         * <p>结束时间</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-01T12:00:00Z</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <p>入口对象ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleEntryObjectId</p>
         */
        @NameInMap("entryObjectId")
        public String entryObjectId;

        /**
         * <p>入口对象类型</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("entryObjectType")
        public String entryObjectType;

        /**
         * <p>是否影子账单</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isShadow")
        public Boolean isShadow;

        /**
         * <p>操作类型</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("operation")
        public String operation;

        /**
         * <p>操作类型展示名称</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("operationDisplayName")
        public String operationDisplayName;

        /**
         * <p>开始时间</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-01T12:00:00Z</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <p>状态</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>状态展示名称</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("statusDisplayName")
        public String statusDisplayName;

        /**
         * <p>租户ID</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("tenantId")
        public Long tenantId;

        /**
         * <p>汇总 credit 消耗</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("totalCreditCost")
        public String totalCreditCost;

        /**
         * <p>WINNEXO 平台用户ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("wnUserId")
        public String wnUserId;

        public static ListBillingResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListBillingResponseBodyList self = new ListBillingResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListBillingResponseBodyList setBillingId(String billingId) {
            this.billingId = billingId;
            return this;
        }
        public String getBillingId() {
            return this.billingId;
        }

        public ListBillingResponseBodyList setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public ListBillingResponseBodyList setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public ListBillingResponseBodyList setCostSource(java.util.List<String> costSource) {
            this.costSource = costSource;
            return this;
        }
        public java.util.List<String> getCostSource() {
            return this.costSource;
        }

        public ListBillingResponseBodyList setCostSourceDisplayName(java.util.List<String> costSourceDisplayName) {
            this.costSourceDisplayName = costSourceDisplayName;
            return this;
        }
        public java.util.List<String> getCostSourceDisplayName() {
            return this.costSourceDisplayName;
        }

        public ListBillingResponseBodyList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListBillingResponseBodyList setEntryObjectId(String entryObjectId) {
            this.entryObjectId = entryObjectId;
            return this;
        }
        public String getEntryObjectId() {
            return this.entryObjectId;
        }

        public ListBillingResponseBodyList setEntryObjectType(String entryObjectType) {
            this.entryObjectType = entryObjectType;
            return this;
        }
        public String getEntryObjectType() {
            return this.entryObjectType;
        }

        public ListBillingResponseBodyList setIsShadow(Boolean isShadow) {
            this.isShadow = isShadow;
            return this;
        }
        public Boolean getIsShadow() {
            return this.isShadow;
        }

        public ListBillingResponseBodyList setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public ListBillingResponseBodyList setOperationDisplayName(String operationDisplayName) {
            this.operationDisplayName = operationDisplayName;
            return this;
        }
        public String getOperationDisplayName() {
            return this.operationDisplayName;
        }

        public ListBillingResponseBodyList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListBillingResponseBodyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListBillingResponseBodyList setStatusDisplayName(String statusDisplayName) {
            this.statusDisplayName = statusDisplayName;
            return this;
        }
        public String getStatusDisplayName() {
            return this.statusDisplayName;
        }

        public ListBillingResponseBodyList setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListBillingResponseBodyList setTotalCreditCost(String totalCreditCost) {
            this.totalCreditCost = totalCreditCost;
            return this;
        }
        public String getTotalCreditCost() {
            return this.totalCreditCost;
        }

        public ListBillingResponseBodyList setWnUserId(String wnUserId) {
            this.wnUserId = wnUserId;
            return this;
        }
        public String getWnUserId() {
            return this.wnUserId;
        }

    }

}
