// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsInstanceBaseInfoResponseBody extends TeaModel {
    @NameInMap("InstanceBaseInfo")
    public OnsInstanceBaseInfoResponseBodyInstanceBaseInfo instanceBaseInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static OnsInstanceBaseInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsInstanceBaseInfoResponseBody self = new OnsInstanceBaseInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsInstanceBaseInfoResponseBody setInstanceBaseInfo(OnsInstanceBaseInfoResponseBodyInstanceBaseInfo instanceBaseInfo) {
        this.instanceBaseInfo = instanceBaseInfo;
        return this;
    }
    public OnsInstanceBaseInfoResponseBodyInstanceBaseInfo getInstanceBaseInfo() {
        return this.instanceBaseInfo;
    }

    public OnsInstanceBaseInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class OnsInstanceBaseInfoResponseBodyInstanceBaseInfoEndpoints extends TeaModel {
        @NameInMap("TcpEndpoint")
        public String tcpEndpoint;

        @NameInMap("HttpInternetEndpoint")
        public String httpInternetEndpoint;

        @NameInMap("HttpInternalEndpoint")
        public String httpInternalEndpoint;

        @NameInMap("HttpInternetSecureEndpoint")
        public String httpInternetSecureEndpoint;

        public static OnsInstanceBaseInfoResponseBodyInstanceBaseInfoEndpoints build(java.util.Map<String, ?> map) throws Exception {
            OnsInstanceBaseInfoResponseBodyInstanceBaseInfoEndpoints self = new OnsInstanceBaseInfoResponseBodyInstanceBaseInfoEndpoints();
            return TeaModel.build(map, self);
        }

        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfoEndpoints setTcpEndpoint(String tcpEndpoint) {
            this.tcpEndpoint = tcpEndpoint;
            return this;
        }
        public String getTcpEndpoint() {
            return this.tcpEndpoint;
        }

        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfoEndpoints setHttpInternetEndpoint(String httpInternetEndpoint) {
            this.httpInternetEndpoint = httpInternetEndpoint;
            return this;
        }
        public String getHttpInternetEndpoint() {
            return this.httpInternetEndpoint;
        }

        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfoEndpoints setHttpInternalEndpoint(String httpInternalEndpoint) {
            this.httpInternalEndpoint = httpInternalEndpoint;
            return this;
        }
        public String getHttpInternalEndpoint() {
            return this.httpInternalEndpoint;
        }

        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfoEndpoints setHttpInternetSecureEndpoint(String httpInternetSecureEndpoint) {
            this.httpInternetSecureEndpoint = httpInternetSecureEndpoint;
            return this;
        }
        public String getHttpInternetSecureEndpoint() {
            return this.httpInternetSecureEndpoint;
        }

    }

    public static class OnsInstanceBaseInfoResponseBodyInstanceBaseInfo extends TeaModel {
        @NameInMap("Endpoints")
        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfoEndpoints endpoints;

        @NameInMap("IndependentNaming")
        public Boolean independentNaming;

        @NameInMap("MaxTps")
        public Long maxTps;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("ReleaseTime")
        public Long releaseTime;

        @NameInMap("TopicCapacity")
        public Integer topicCapacity;

        @NameInMap("InstanceStatus")
        public Integer instanceStatus;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public Integer instanceType;

        public static OnsInstanceBaseInfoResponseBodyInstanceBaseInfo build(java.util.Map<String, ?> map) throws Exception {
            OnsInstanceBaseInfoResponseBodyInstanceBaseInfo self = new OnsInstanceBaseInfoResponseBodyInstanceBaseInfo();
            return TeaModel.build(map, self);
        }

        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfo setEndpoints(OnsInstanceBaseInfoResponseBodyInstanceBaseInfoEndpoints endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfoEndpoints getEndpoints() {
            return this.endpoints;
        }

        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfo setIndependentNaming(Boolean independentNaming) {
            this.independentNaming = independentNaming;
            return this;
        }
        public Boolean getIndependentNaming() {
            return this.independentNaming;
        }

        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfo setMaxTps(Long maxTps) {
            this.maxTps = maxTps;
            return this;
        }
        public Long getMaxTps() {
            return this.maxTps;
        }

        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfo setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfo setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfo setReleaseTime(Long releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfo setTopicCapacity(Integer topicCapacity) {
            this.topicCapacity = topicCapacity;
            return this;
        }
        public Integer getTopicCapacity() {
            return this.topicCapacity;
        }

        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfo setInstanceStatus(Integer instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public Integer getInstanceStatus() {
            return this.instanceStatus;
        }

        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfo setInstanceType(Integer instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Integer getInstanceType() {
            return this.instanceType;
        }

    }

}
