// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMSDdcsPushHistoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("History")
    public java.util.List<QueryMSDdcsPushHistoryResponseBodyHistory> history;

    public static QueryMSDdcsPushHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMSDdcsPushHistoryResponseBody self = new QueryMSDdcsPushHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMSDdcsPushHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMSDdcsPushHistoryResponseBody setHistory(java.util.List<QueryMSDdcsPushHistoryResponseBodyHistory> history) {
        this.history = history;
        return this;
    }
    public java.util.List<QueryMSDdcsPushHistoryResponseBodyHistory> getHistory() {
        return this.history;
    }

    public static class QueryMSDdcsPushHistoryResponseBodyHistory extends TeaModel {
        @NameInMap("ChangeType")
        public String changeType;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("Env")
        public String env;

        @NameInMap("GmtEnd")
        public Long gmtEnd;

        @NameInMap("GmtStart")
        public Long gmtStart;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InfluenceApp")
        public String influenceApp;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("PushResult")
        public String pushResult;

        @NameInMap("PushType")
        public String pushType;

        @NameInMap("Target")
        public String target;

        @NameInMap("Title")
        public String title;

        @NameInMap("Value")
        public String value;

        public static QueryMSDdcsPushHistoryResponseBodyHistory build(java.util.Map<String, ?> map) throws Exception {
            QueryMSDdcsPushHistoryResponseBodyHistory self = new QueryMSDdcsPushHistoryResponseBodyHistory();
            return TeaModel.build(map, self);
        }

        public QueryMSDdcsPushHistoryResponseBodyHistory setChangeType(String changeType) {
            this.changeType = changeType;
            return this;
        }
        public String getChangeType() {
            return this.changeType;
        }

        public QueryMSDdcsPushHistoryResponseBodyHistory setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public QueryMSDdcsPushHistoryResponseBodyHistory setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public QueryMSDdcsPushHistoryResponseBodyHistory setGmtEnd(Long gmtEnd) {
            this.gmtEnd = gmtEnd;
            return this;
        }
        public Long getGmtEnd() {
            return this.gmtEnd;
        }

        public QueryMSDdcsPushHistoryResponseBodyHistory setGmtStart(Long gmtStart) {
            this.gmtStart = gmtStart;
            return this;
        }
        public Long getGmtStart() {
            return this.gmtStart;
        }

        public QueryMSDdcsPushHistoryResponseBodyHistory setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMSDdcsPushHistoryResponseBodyHistory setInfluenceApp(String influenceApp) {
            this.influenceApp = influenceApp;
            return this;
        }
        public String getInfluenceApp() {
            return this.influenceApp;
        }

        public QueryMSDdcsPushHistoryResponseBodyHistory setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryMSDdcsPushHistoryResponseBodyHistory setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public QueryMSDdcsPushHistoryResponseBodyHistory setPushResult(String pushResult) {
            this.pushResult = pushResult;
            return this;
        }
        public String getPushResult() {
            return this.pushResult;
        }

        public QueryMSDdcsPushHistoryResponseBodyHistory setPushType(String pushType) {
            this.pushType = pushType;
            return this;
        }
        public String getPushType() {
            return this.pushType;
        }

        public QueryMSDdcsPushHistoryResponseBodyHistory setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public QueryMSDdcsPushHistoryResponseBodyHistory setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryMSDdcsPushHistoryResponseBodyHistory setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
