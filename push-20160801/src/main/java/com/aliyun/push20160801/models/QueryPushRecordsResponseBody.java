// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryPushRecordsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("PushInfos")
    public QueryPushRecordsResponseBodyPushInfos pushInfos;

    public static QueryPushRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPushRecordsResponseBody self = new QueryPushRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPushRecordsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryPushRecordsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryPushRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPushRecordsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public QueryPushRecordsResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryPushRecordsResponseBody setPushInfos(QueryPushRecordsResponseBodyPushInfos pushInfos) {
        this.pushInfos = pushInfos;
        return this;
    }
    public QueryPushRecordsResponseBodyPushInfos getPushInfos() {
        return this.pushInfos;
    }

    public static class QueryPushRecordsResponseBodyPushInfosPushInfo extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("MessageId")
        public String messageId;

        @NameInMap("AppKey")
        public Long appKey;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("PushType")
        public String pushType;

        @NameInMap("Body")
        public String body;

        @NameInMap("Title")
        public String title;

        @NameInMap("Source")
        public String source;

        @NameInMap("PushTime")
        public String pushTime;

        @NameInMap("Target")
        public String target;

        public static QueryPushRecordsResponseBodyPushInfosPushInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryPushRecordsResponseBodyPushInfosPushInfo self = new QueryPushRecordsResponseBodyPushInfosPushInfo();
            return TeaModel.build(map, self);
        }

        public QueryPushRecordsResponseBodyPushInfosPushInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryPushRecordsResponseBodyPushInfosPushInfo setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public QueryPushRecordsResponseBodyPushInfosPushInfo setAppKey(Long appKey) {
            this.appKey = appKey;
            return this;
        }
        public Long getAppKey() {
            return this.appKey;
        }

        public QueryPushRecordsResponseBodyPushInfosPushInfo setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public QueryPushRecordsResponseBodyPushInfosPushInfo setPushType(String pushType) {
            this.pushType = pushType;
            return this;
        }
        public String getPushType() {
            return this.pushType;
        }

        public QueryPushRecordsResponseBodyPushInfosPushInfo setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public QueryPushRecordsResponseBodyPushInfosPushInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryPushRecordsResponseBodyPushInfosPushInfo setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public QueryPushRecordsResponseBodyPushInfosPushInfo setPushTime(String pushTime) {
            this.pushTime = pushTime;
            return this;
        }
        public String getPushTime() {
            return this.pushTime;
        }

        public QueryPushRecordsResponseBodyPushInfosPushInfo setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class QueryPushRecordsResponseBodyPushInfos extends TeaModel {
        @NameInMap("PushInfo")
        public java.util.List<QueryPushRecordsResponseBodyPushInfosPushInfo> pushInfo;

        public static QueryPushRecordsResponseBodyPushInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryPushRecordsResponseBodyPushInfos self = new QueryPushRecordsResponseBodyPushInfos();
            return TeaModel.build(map, self);
        }

        public QueryPushRecordsResponseBodyPushInfos setPushInfo(java.util.List<QueryPushRecordsResponseBodyPushInfosPushInfo> pushInfo) {
            this.pushInfo = pushInfo;
            return this;
        }
        public java.util.List<QueryPushRecordsResponseBodyPushInfosPushInfo> getPushInfo() {
            return this.pushInfo;
        }

    }

}
