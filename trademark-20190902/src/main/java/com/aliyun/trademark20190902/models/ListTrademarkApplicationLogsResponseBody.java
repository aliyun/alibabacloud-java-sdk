// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class ListTrademarkApplicationLogsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TrademarkApplicationLogs")
    public ListTrademarkApplicationLogsResponseBodyTrademarkApplicationLogs trademarkApplicationLogs;

    public static ListTrademarkApplicationLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTrademarkApplicationLogsResponseBody self = new ListTrademarkApplicationLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTrademarkApplicationLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTrademarkApplicationLogsResponseBody setTrademarkApplicationLogs(ListTrademarkApplicationLogsResponseBodyTrademarkApplicationLogs trademarkApplicationLogs) {
        this.trademarkApplicationLogs = trademarkApplicationLogs;
        return this;
    }
    public ListTrademarkApplicationLogsResponseBodyTrademarkApplicationLogs getTrademarkApplicationLogs() {
        return this.trademarkApplicationLogs;
    }

    public static class ListTrademarkApplicationLogsResponseBodyTrademarkApplicationLogsTrademarkApplicationLog extends TeaModel {
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

        public static ListTrademarkApplicationLogsResponseBodyTrademarkApplicationLogsTrademarkApplicationLog build(java.util.Map<String, ?> map) throws Exception {
            ListTrademarkApplicationLogsResponseBodyTrademarkApplicationLogsTrademarkApplicationLog self = new ListTrademarkApplicationLogsResponseBodyTrademarkApplicationLogsTrademarkApplicationLog();
            return TeaModel.build(map, self);
        }

        public ListTrademarkApplicationLogsResponseBodyTrademarkApplicationLogsTrademarkApplicationLog setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public ListTrademarkApplicationLogsResponseBodyTrademarkApplicationLogsTrademarkApplicationLog setBizStatus(Integer bizStatus) {
            this.bizStatus = bizStatus;
            return this;
        }
        public Integer getBizStatus() {
            return this.bizStatus;
        }

        public ListTrademarkApplicationLogsResponseBodyTrademarkApplicationLogsTrademarkApplicationLog setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public ListTrademarkApplicationLogsResponseBodyTrademarkApplicationLogsTrademarkApplicationLog setOperateTime(Long operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public Long getOperateTime() {
            return this.operateTime;
        }

        public ListTrademarkApplicationLogsResponseBodyTrademarkApplicationLogsTrademarkApplicationLog setOperateType(Integer operateType) {
            this.operateType = operateType;
            return this;
        }
        public Integer getOperateType() {
            return this.operateType;
        }

    }

    public static class ListTrademarkApplicationLogsResponseBodyTrademarkApplicationLogs extends TeaModel {
        @NameInMap("TrademarkApplicationLog")
        public java.util.List<ListTrademarkApplicationLogsResponseBodyTrademarkApplicationLogsTrademarkApplicationLog> trademarkApplicationLog;

        public static ListTrademarkApplicationLogsResponseBodyTrademarkApplicationLogs build(java.util.Map<String, ?> map) throws Exception {
            ListTrademarkApplicationLogsResponseBodyTrademarkApplicationLogs self = new ListTrademarkApplicationLogsResponseBodyTrademarkApplicationLogs();
            return TeaModel.build(map, self);
        }

        public ListTrademarkApplicationLogsResponseBodyTrademarkApplicationLogs setTrademarkApplicationLog(java.util.List<ListTrademarkApplicationLogsResponseBodyTrademarkApplicationLogsTrademarkApplicationLog> trademarkApplicationLog) {
            this.trademarkApplicationLog = trademarkApplicationLog;
            return this;
        }
        public java.util.List<ListTrademarkApplicationLogsResponseBodyTrademarkApplicationLogsTrademarkApplicationLog> getTrademarkApplicationLog() {
            return this.trademarkApplicationLog;
        }

    }

}
