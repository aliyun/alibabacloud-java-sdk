// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMSServiceSubscriberResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Subscribers")
    public java.util.List<QueryMSServiceSubscriberResponseBodySubscribers> subscribers;

    public static QueryMSServiceSubscriberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMSServiceSubscriberResponseBody self = new QueryMSServiceSubscriberResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMSServiceSubscriberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMSServiceSubscriberResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryMSServiceSubscriberResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryMSServiceSubscriberResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryMSServiceSubscriberResponseBody setSubscribers(java.util.List<QueryMSServiceSubscriberResponseBodySubscribers> subscribers) {
        this.subscribers = subscribers;
        return this;
    }
    public java.util.List<QueryMSServiceSubscriberResponseBodySubscribers> getSubscribers() {
        return this.subscribers;
    }

    public static class QueryMSServiceSubscriberResponseBodySubscribers extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("HostIp")
        public String hostIp;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Zone")
        public String zone;

        public static QueryMSServiceSubscriberResponseBodySubscribers build(java.util.Map<String, ?> map) throws Exception {
            QueryMSServiceSubscriberResponseBodySubscribers self = new QueryMSServiceSubscriberResponseBodySubscribers();
            return TeaModel.build(map, self);
        }

        public QueryMSServiceSubscriberResponseBodySubscribers setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryMSServiceSubscriberResponseBodySubscribers setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public QueryMSServiceSubscriberResponseBodySubscribers setHostIp(String hostIp) {
            this.hostIp = hostIp;
            return this;
        }
        public String getHostIp() {
            return this.hostIp;
        }

        public QueryMSServiceSubscriberResponseBodySubscribers setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryMSServiceSubscriberResponseBodySubscribers setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

}
