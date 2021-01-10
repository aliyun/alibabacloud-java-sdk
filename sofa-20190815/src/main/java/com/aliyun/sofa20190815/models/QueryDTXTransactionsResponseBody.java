// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryDTXTransactionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Long total;

    @NameInMap("Data")
    public java.util.List<QueryDTXTransactionsResponseBodyData> data;

    public static QueryDTXTransactionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDTXTransactionsResponseBody self = new QueryDTXTransactionsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDTXTransactionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDTXTransactionsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDTXTransactionsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryDTXTransactionsResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryDTXTransactionsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryDTXTransactionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDTXTransactionsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryDTXTransactionsResponseBody setData(java.util.List<QueryDTXTransactionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryDTXTransactionsResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryDTXTransactionsResponseBodyData extends TeaModel {
        @NameInMap("ActionMode")
        public Long actionMode;

        @NameInMap("BizType")
        public String bizType;

        @NameInMap("BusinessId")
        public String businessId;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("InitiatorIp")
        public String initiatorIp;

        @NameInMap("InitiatorName")
        public String initiatorName;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("TxId")
        public String txId;

        @NameInMap("ParticipatorIds")
        public java.util.List<String> participatorIds;

        public static QueryDTXTransactionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDTXTransactionsResponseBodyData self = new QueryDTXTransactionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDTXTransactionsResponseBodyData setActionMode(Long actionMode) {
            this.actionMode = actionMode;
            return this;
        }
        public Long getActionMode() {
            return this.actionMode;
        }

        public QueryDTXTransactionsResponseBodyData setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QueryDTXTransactionsResponseBodyData setBusinessId(String businessId) {
            this.businessId = businessId;
            return this;
        }
        public String getBusinessId() {
            return this.businessId;
        }

        public QueryDTXTransactionsResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryDTXTransactionsResponseBodyData setInitiatorIp(String initiatorIp) {
            this.initiatorIp = initiatorIp;
            return this;
        }
        public String getInitiatorIp() {
            return this.initiatorIp;
        }

        public QueryDTXTransactionsResponseBodyData setInitiatorName(String initiatorName) {
            this.initiatorName = initiatorName;
            return this;
        }
        public String getInitiatorName() {
            return this.initiatorName;
        }

        public QueryDTXTransactionsResponseBodyData setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public QueryDTXTransactionsResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryDTXTransactionsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryDTXTransactionsResponseBodyData setTxId(String txId) {
            this.txId = txId;
            return this;
        }
        public String getTxId() {
            return this.txId;
        }

        public QueryDTXTransactionsResponseBodyData setParticipatorIds(java.util.List<String> participatorIds) {
            this.participatorIds = participatorIds;
            return this;
        }
        public java.util.List<String> getParticipatorIds() {
            return this.participatorIds;
        }

    }

}
