// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMSServicePublisherResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Publishers")
    public java.util.List<QueryMSServicePublisherResponseBodyPublishers> publishers;

    public static QueryMSServicePublisherResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMSServicePublisherResponseBody self = new QueryMSServicePublisherResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMSServicePublisherResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMSServicePublisherResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryMSServicePublisherResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryMSServicePublisherResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryMSServicePublisherResponseBody setPublishers(java.util.List<QueryMSServicePublisherResponseBodyPublishers> publishers) {
        this.publishers = publishers;
        return this;
    }
    public java.util.List<QueryMSServicePublisherResponseBodyPublishers> getPublishers() {
        return this.publishers;
    }

    public static class QueryMSServicePublisherResponseBodyPublishers extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("HostIp")
        public String hostIp;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ServiceIp")
        public String serviceIp;

        @NameInMap("ServicePort")
        public Integer servicePort;

        @NameInMap("Weight")
        public Integer weight;

        @NameInMap("Zone")
        public String zone;

        public static QueryMSServicePublisherResponseBodyPublishers build(java.util.Map<String, ?> map) throws Exception {
            QueryMSServicePublisherResponseBodyPublishers self = new QueryMSServicePublisherResponseBodyPublishers();
            return TeaModel.build(map, self);
        }

        public QueryMSServicePublisherResponseBodyPublishers setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryMSServicePublisherResponseBodyPublishers setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public QueryMSServicePublisherResponseBodyPublishers setHostIp(String hostIp) {
            this.hostIp = hostIp;
            return this;
        }
        public String getHostIp() {
            return this.hostIp;
        }

        public QueryMSServicePublisherResponseBodyPublishers setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryMSServicePublisherResponseBodyPublishers setServiceIp(String serviceIp) {
            this.serviceIp = serviceIp;
            return this;
        }
        public String getServiceIp() {
            return this.serviceIp;
        }

        public QueryMSServicePublisherResponseBodyPublishers setServicePort(Integer servicePort) {
            this.servicePort = servicePort;
            return this;
        }
        public Integer getServicePort() {
            return this.servicePort;
        }

        public QueryMSServicePublisherResponseBodyPublishers setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public QueryMSServicePublisherResponseBodyPublishers setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

}
