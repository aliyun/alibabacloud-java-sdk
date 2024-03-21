// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class ListAdminTrademarkApplicationLogsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TrademarkApplicationLogs")
    public java.util.List<ListAdminTrademarkApplicationLogsResponseBodyTrademarkApplicationLogs> trademarkApplicationLogs;

    public static ListAdminTrademarkApplicationLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAdminTrademarkApplicationLogsResponseBody self = new ListAdminTrademarkApplicationLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAdminTrademarkApplicationLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAdminTrademarkApplicationLogsResponseBody setTrademarkApplicationLogs(java.util.List<ListAdminTrademarkApplicationLogsResponseBodyTrademarkApplicationLogs> trademarkApplicationLogs) {
        this.trademarkApplicationLogs = trademarkApplicationLogs;
        return this;
    }
    public java.util.List<ListAdminTrademarkApplicationLogsResponseBodyTrademarkApplicationLogs> getTrademarkApplicationLogs() {
        return this.trademarkApplicationLogs;
    }

    public static class ListAdminTrademarkApplicationLogsResponseBodyTrademarkApplicationLogs extends TeaModel {
        @NameInMap("BizId")
        public String bizId;

        @NameInMap("BizStatus")
        public Integer bizStatus;

        @NameInMap("Note")
        public String note;

        @NameInMap("OperateTime")
        public Long operateTime;

        @NameInMap("OperateType")
        public Integer operateType;

        public static ListAdminTrademarkApplicationLogsResponseBodyTrademarkApplicationLogs build(java.util.Map<String, ?> map) throws Exception {
            ListAdminTrademarkApplicationLogsResponseBodyTrademarkApplicationLogs self = new ListAdminTrademarkApplicationLogsResponseBodyTrademarkApplicationLogs();
            return TeaModel.build(map, self);
        }

        public ListAdminTrademarkApplicationLogsResponseBodyTrademarkApplicationLogs setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public ListAdminTrademarkApplicationLogsResponseBodyTrademarkApplicationLogs setBizStatus(Integer bizStatus) {
            this.bizStatus = bizStatus;
            return this;
        }
        public Integer getBizStatus() {
            return this.bizStatus;
        }

        public ListAdminTrademarkApplicationLogsResponseBodyTrademarkApplicationLogs setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public ListAdminTrademarkApplicationLogsResponseBodyTrademarkApplicationLogs setOperateTime(Long operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public Long getOperateTime() {
            return this.operateTime;
        }

        public ListAdminTrademarkApplicationLogsResponseBodyTrademarkApplicationLogs setOperateType(Integer operateType) {
            this.operateType = operateType;
            return this;
        }
        public Integer getOperateType() {
            return this.operateType;
        }

    }

}
