// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryPushRecordsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>i91D***********kXIh/dVBEQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PushInfos")
    public QueryPushRecordsResponseBodyPushInfos pushInfos;

    /**
     * <strong>example:</strong>
     * <p>9B24B396-249D-55E4-8CA1-66C9B50BB734</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>193</p>
     */
    @NameInMap("Total")
    public Integer total;

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

    public QueryPushRecordsResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryPushRecordsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryPushRecordsResponseBody setPushInfos(QueryPushRecordsResponseBodyPushInfos pushInfos) {
        this.pushInfos = pushInfos;
        return this;
    }
    public QueryPushRecordsResponseBodyPushInfos getPushInfos() {
        return this.pushInfos;
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

    public static class QueryPushRecordsResponseBodyPushInfosPushInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>333526247</p>
         */
        @NameInMap("AppKey")
        public Long appKey;

        /**
         * <strong>example:</strong>
         * <p>abcd</p>
         */
        @NameInMap("Body")
        public String body;

        /**
         * <strong>example:</strong>
         * <p>ANDROID</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <strong>example:</strong>
         * <p>510431</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        /**
         * <strong>example:</strong>
         * <p>2021-09-15T02:05:24Z</p>
         */
        @NameInMap("PushTime")
        public String pushTime;

        /**
         * <strong>example:</strong>
         * <p>NOTICE</p>
         */
        @NameInMap("PushType")
        public String pushType;

        /**
         * <strong>example:</strong>
         * <p>DEVICE</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>SENT</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>DEVICE</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <strong>example:</strong>
         * <p>sssss</p>
         */
        @NameInMap("Title")
        public String title;

        public static QueryPushRecordsResponseBodyPushInfosPushInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryPushRecordsResponseBodyPushInfosPushInfo self = new QueryPushRecordsResponseBodyPushInfosPushInfo();
            return TeaModel.build(map, self);
        }

        public QueryPushRecordsResponseBodyPushInfosPushInfo setAppKey(Long appKey) {
            this.appKey = appKey;
            return this;
        }
        public Long getAppKey() {
            return this.appKey;
        }

        public QueryPushRecordsResponseBodyPushInfosPushInfo setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public QueryPushRecordsResponseBodyPushInfosPushInfo setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public QueryPushRecordsResponseBodyPushInfosPushInfo setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public QueryPushRecordsResponseBodyPushInfosPushInfo setPushTime(String pushTime) {
            this.pushTime = pushTime;
            return this;
        }
        public String getPushTime() {
            return this.pushTime;
        }

        public QueryPushRecordsResponseBodyPushInfosPushInfo setPushType(String pushType) {
            this.pushType = pushType;
            return this;
        }
        public String getPushType() {
            return this.pushType;
        }

        public QueryPushRecordsResponseBodyPushInfosPushInfo setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public QueryPushRecordsResponseBodyPushInfosPushInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryPushRecordsResponseBodyPushInfosPushInfo setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public QueryPushRecordsResponseBodyPushInfosPushInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
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
