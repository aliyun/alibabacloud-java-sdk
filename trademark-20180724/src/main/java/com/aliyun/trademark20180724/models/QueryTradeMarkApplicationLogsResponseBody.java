// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTradeMarkApplicationLogsResponseBody extends TeaModel {
    @NameInMap("Data")
    public QueryTradeMarkApplicationLogsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryTradeMarkApplicationLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTradeMarkApplicationLogsResponseBody self = new QueryTradeMarkApplicationLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTradeMarkApplicationLogsResponseBody setData(QueryTradeMarkApplicationLogsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTradeMarkApplicationLogsResponseBodyData getData() {
        return this.data;
    }

    public QueryTradeMarkApplicationLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryTradeMarkApplicationLogsResponseBodyDataData extends TeaModel {
        @NameInMap("BizId")
        public String bizId;

        @NameInMap("BizStatus")
        public Integer bizStatus;

        @NameInMap("ExtendContent")
        public String extendContent;

        @NameInMap("Note")
        public String note;

        @NameInMap("OperateTime")
        public Long operateTime;

        @NameInMap("OperateType")
        public Integer operateType;

        @NameInMap("ToBizStatus")
        public Integer toBizStatus;

        public static QueryTradeMarkApplicationLogsResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            QueryTradeMarkApplicationLogsResponseBodyDataData self = new QueryTradeMarkApplicationLogsResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public QueryTradeMarkApplicationLogsResponseBodyDataData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryTradeMarkApplicationLogsResponseBodyDataData setBizStatus(Integer bizStatus) {
            this.bizStatus = bizStatus;
            return this;
        }
        public Integer getBizStatus() {
            return this.bizStatus;
        }

        public QueryTradeMarkApplicationLogsResponseBodyDataData setExtendContent(String extendContent) {
            this.extendContent = extendContent;
            return this;
        }
        public String getExtendContent() {
            return this.extendContent;
        }

        public QueryTradeMarkApplicationLogsResponseBodyDataData setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public QueryTradeMarkApplicationLogsResponseBodyDataData setOperateTime(Long operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public Long getOperateTime() {
            return this.operateTime;
        }

        public QueryTradeMarkApplicationLogsResponseBodyDataData setOperateType(Integer operateType) {
            this.operateType = operateType;
            return this;
        }
        public Integer getOperateType() {
            return this.operateType;
        }

        public QueryTradeMarkApplicationLogsResponseBodyDataData setToBizStatus(Integer toBizStatus) {
            this.toBizStatus = toBizStatus;
            return this;
        }
        public Integer getToBizStatus() {
            return this.toBizStatus;
        }

    }

    public static class QueryTradeMarkApplicationLogsResponseBodyData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<QueryTradeMarkApplicationLogsResponseBodyDataData> data;

        public static QueryTradeMarkApplicationLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTradeMarkApplicationLogsResponseBodyData self = new QueryTradeMarkApplicationLogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTradeMarkApplicationLogsResponseBodyData setData(java.util.List<QueryTradeMarkApplicationLogsResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryTradeMarkApplicationLogsResponseBodyDataData> getData() {
            return this.data;
        }

    }

}
