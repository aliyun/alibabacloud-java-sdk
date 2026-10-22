// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class QueryForOperationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryForOperationResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>BEE90F8C-EDC2-5394-953B-D07A121612B5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryForOperationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryForOperationResponseBody self = new QueryForOperationResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryForOperationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryForOperationResponseBody setData(QueryForOperationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryForOperationResponseBodyData getData() {
        return this.data;
    }

    public QueryForOperationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryForOperationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryForOperationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryForOperationResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1788873796000</p>
         */
        @NameInMap("ApplyTime")
        public Long applyTime;

        /**
         * <strong>example:</strong>
         * <p>EIP</p>
         */
        @NameInMap("AssetType")
        public String assetType;

        /**
         * <strong>example:</strong>
         * <p>agree</p>
         */
        @NameInMap("AuditMemo")
        public String auditMemo;

        /**
         * <strong>example:</strong>
         * <p>1791937132000</p>
         */
        @NameInMap("AuditTime")
        public Long auditTime;

        /**
         * <strong>example:</strong>
         * <p>149754</p>
         */
        @NameInMap("Auditor")
        public String auditor;

        /**
         * <strong>example:</strong>
         * <p>1068723216148614</p>
         */
        @NameInMap("CustomerUid")
        public String customerUid;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("EmailType")
        public String emailType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasUnsubscribe")
        public Boolean hasUnsubscribe;

        /**
         * <strong>example:</strong>
         * <p>710864062</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>10.0.158.58</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SendCount")
        public String sendCount;

        /**
         * <strong>example:</strong>
         * <p>Executing</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("UseDesc")
        public String useDesc;

        public static QueryForOperationResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryForOperationResponseBodyDataList self = new QueryForOperationResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryForOperationResponseBodyDataList setApplyTime(Long applyTime) {
            this.applyTime = applyTime;
            return this;
        }
        public Long getApplyTime() {
            return this.applyTime;
        }

        public QueryForOperationResponseBodyDataList setAssetType(String assetType) {
            this.assetType = assetType;
            return this;
        }
        public String getAssetType() {
            return this.assetType;
        }

        public QueryForOperationResponseBodyDataList setAuditMemo(String auditMemo) {
            this.auditMemo = auditMemo;
            return this;
        }
        public String getAuditMemo() {
            return this.auditMemo;
        }

        public QueryForOperationResponseBodyDataList setAuditTime(Long auditTime) {
            this.auditTime = auditTime;
            return this;
        }
        public Long getAuditTime() {
            return this.auditTime;
        }

        public QueryForOperationResponseBodyDataList setAuditor(String auditor) {
            this.auditor = auditor;
            return this;
        }
        public String getAuditor() {
            return this.auditor;
        }

        public QueryForOperationResponseBodyDataList setCustomerUid(String customerUid) {
            this.customerUid = customerUid;
            return this;
        }
        public String getCustomerUid() {
            return this.customerUid;
        }

        public QueryForOperationResponseBodyDataList setEmailType(String emailType) {
            this.emailType = emailType;
            return this;
        }
        public String getEmailType() {
            return this.emailType;
        }

        public QueryForOperationResponseBodyDataList setHasUnsubscribe(Boolean hasUnsubscribe) {
            this.hasUnsubscribe = hasUnsubscribe;
            return this;
        }
        public Boolean getHasUnsubscribe() {
            return this.hasUnsubscribe;
        }

        public QueryForOperationResponseBodyDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryForOperationResponseBodyDataList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public QueryForOperationResponseBodyDataList setSendCount(String sendCount) {
            this.sendCount = sendCount;
            return this;
        }
        public String getSendCount() {
            return this.sendCount;
        }

        public QueryForOperationResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryForOperationResponseBodyDataList setUseDesc(String useDesc) {
            this.useDesc = useDesc;
            return this;
        }
        public String getUseDesc() {
            return this.useDesc;
        }

    }

    public static class QueryForOperationResponseBodyDataPageInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static QueryForOperationResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryForOperationResponseBodyDataPageInfo self = new QueryForOperationResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public QueryForOperationResponseBodyDataPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryForOperationResponseBodyDataPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryForOperationResponseBodyDataPageInfo setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class QueryForOperationResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<QueryForOperationResponseBodyDataList> list;

        @NameInMap("PageInfo")
        public QueryForOperationResponseBodyDataPageInfo pageInfo;

        public static QueryForOperationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryForOperationResponseBodyData self = new QueryForOperationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryForOperationResponseBodyData setList(java.util.List<QueryForOperationResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryForOperationResponseBodyDataList> getList() {
            return this.list;
        }

        public QueryForOperationResponseBodyData setPageInfo(QueryForOperationResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public QueryForOperationResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

    }

}
