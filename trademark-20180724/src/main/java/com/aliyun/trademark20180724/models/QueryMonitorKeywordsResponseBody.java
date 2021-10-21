// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryMonitorKeywordsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryMonitorKeywordsResponseBodyData data;

    public static QueryMonitorKeywordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMonitorKeywordsResponseBody self = new QueryMonitorKeywordsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMonitorKeywordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMonitorKeywordsResponseBody setData(QueryMonitorKeywordsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryMonitorKeywordsResponseBodyData getData() {
        return this.data;
    }

    public static class QueryMonitorKeywordsResponseBodyData extends TeaModel {
        @NameInMap("Keywords")
        public java.util.List<String> keywords;

        public static QueryMonitorKeywordsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMonitorKeywordsResponseBodyData self = new QueryMonitorKeywordsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMonitorKeywordsResponseBodyData setKeywords(java.util.List<String> keywords) {
            this.keywords = keywords;
            return this;
        }
        public java.util.List<String> getKeywords() {
            return this.keywords;
        }

    }

}
