// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCASSlsLogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Total")
    public Long total;

    @NameInMap("Data")
    public java.util.List<QueryCASSlsLogResponseBodyData> data;

    public static QueryCASSlsLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCASSlsLogResponseBody self = new QueryCASSlsLogResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCASSlsLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCASSlsLogResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCASSlsLogResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryCASSlsLogResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryCASSlsLogResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCASSlsLogResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryCASSlsLogResponseBody setData(java.util.List<QueryCASSlsLogResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryCASSlsLogResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryCASSlsLogResponseBodyDataContents extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryCASSlsLogResponseBodyDataContents build(java.util.Map<String, ?> map) throws Exception {
            QueryCASSlsLogResponseBodyDataContents self = new QueryCASSlsLogResponseBodyDataContents();
            return TeaModel.build(map, self);
        }

        public QueryCASSlsLogResponseBodyDataContents setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryCASSlsLogResponseBodyDataContents setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryCASSlsLogResponseBodyData extends TeaModel {
        @NameInMap("LogTime")
        public Long logTime;

        @NameInMap("Source")
        public String source;

        @NameInMap("Contents")
        public java.util.List<QueryCASSlsLogResponseBodyDataContents> contents;

        public static QueryCASSlsLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCASSlsLogResponseBodyData self = new QueryCASSlsLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCASSlsLogResponseBodyData setLogTime(Long logTime) {
            this.logTime = logTime;
            return this;
        }
        public Long getLogTime() {
            return this.logTime;
        }

        public QueryCASSlsLogResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public QueryCASSlsLogResponseBodyData setContents(java.util.List<QueryCASSlsLogResponseBodyDataContents> contents) {
            this.contents = contents;
            return this;
        }
        public java.util.List<QueryCASSlsLogResponseBodyDataContents> getContents() {
            return this.contents;
        }

    }

}
