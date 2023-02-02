// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsInstanceBaseInfoResponseBody extends TeaModel {
    /**
     * <p>The information about the instance.</p>
     */
    @NameInMap("InstanceBaseInfo")
    public OnsInstanceBaseInfoResponseBodyInstanceBaseInfo instanceBaseInfo;

    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     */
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
        /**
         * <p>The private HTTP endpoint of the instance.</p>
         */
        @NameInMap("HttpInternalEndpoint")
        public String httpInternalEndpoint;

        /**
         * <p>The public HTTP endpoint of the instance.</p>
         */
        @NameInMap("HttpInternetEndpoint")
        public String httpInternetEndpoint;

        /**
         * <p>The public HTTPS endpoint of the instance.</p>
         */
        @NameInMap("HttpInternetSecureEndpoint")
        public String httpInternetSecureEndpoint;

        /**
         * <p>The private TCP endpoint of the instance.</p>
         */
        @NameInMap("TcpEndpoint")
        public String tcpEndpoint;

        /**
         * <p>The public TCP endpoint of the instance.</p>
         * <br>
         * <p>*   Only instances that are deployed in the China (Chengdu), China (Qingdao), or China (Shenzhen) region can be accessed by using public TCP endpoints.</p>
         * <br>
         * <p>*   Before you use a public TCP endpoint, make sure that your client SDK meets the following requirements:</p>
         * <br>
         * <p>    *   TCP client SDK for Java: V2.0.0.Final or later For more information, see [Release notes for the SDK for Java](~~325569~~).</p>
         * <p>    *   TCP client SDK for C++: V3.0.0 or later For more information, see [Release notes for the SDK for C++](~~325570~~).</p>
         * <br>
         * <p>*   You must pay the data transfer cost when you use a public TCP endpoint. For more information, see [Internet traffic fee](~~325571~~).</p>
         */
        @NameInMap("TcpInternetEndpoint")
        public String tcpInternetEndpoint;

        public static OnsInstanceBaseInfoResponseBodyInstanceBaseInfoEndpoints build(java.util.Map<String, ?> map) throws Exception {
            OnsInstanceBaseInfoResponseBodyInstanceBaseInfoEndpoints self = new OnsInstanceBaseInfoResponseBodyInstanceBaseInfoEndpoints();
            return TeaModel.build(map, self);
        }

        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfoEndpoints setHttpInternalEndpoint(String httpInternalEndpoint) {
            this.httpInternalEndpoint = httpInternalEndpoint;
            return this;
        }
        public String getHttpInternalEndpoint() {
            return this.httpInternalEndpoint;
        }

        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfoEndpoints setHttpInternetEndpoint(String httpInternetEndpoint) {
            this.httpInternetEndpoint = httpInternetEndpoint;
            return this;
        }
        public String getHttpInternetEndpoint() {
            return this.httpInternetEndpoint;
        }

        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfoEndpoints setHttpInternetSecureEndpoint(String httpInternetSecureEndpoint) {
            this.httpInternetSecureEndpoint = httpInternetSecureEndpoint;
            return this;
        }
        public String getHttpInternetSecureEndpoint() {
            return this.httpInternetSecureEndpoint;
        }

        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfoEndpoints setTcpEndpoint(String tcpEndpoint) {
            this.tcpEndpoint = tcpEndpoint;
            return this;
        }
        public String getTcpEndpoint() {
            return this.tcpEndpoint;
        }

        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfoEndpoints setTcpInternetEndpoint(String tcpInternetEndpoint) {
            this.tcpInternetEndpoint = tcpInternetEndpoint;
            return this;
        }
        public String getTcpInternetEndpoint() {
            return this.tcpInternetEndpoint;
        }

    }

    public static class OnsInstanceBaseInfoResponseBodyInstanceBaseInfo extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The endpoints that correspond to different protocols.</p>
         */
        @NameInMap("Endpoints")
        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfoEndpoints endpoints;

        /**
         * <p>Indicates whether the instance uses a namespace. Valid values:</p>
         * <br>
         * <p>*   **true**: The instance uses a separate namespace. The name of each resource must be unique in the instance. The names of resources in different instances can be the same.</p>
         * <p>*   **false**: The instance does not use a separate namespace. The name of each resource must be globally unique within and across all instances.</p>
         */
        @NameInMap("IndependentNaming")
        public Boolean independentNaming;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the instance.</p>
         * <br>
         * <p>The name must be 3 to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (\_).</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The status of the instance. Valid values:</p>
         * <br>
         * <p>*   **0**: The instance is being deployed. This value is valid only for Enterprise Platinum Edition instances.</p>
         * <p>*   **2**: The instance has overdue payments. This value is valid only for Standard Edition instances.</p>
         * <p>*   **5**: The instance is running. This value is valid for Standard Edition instances and Enterprise Platinum Edition instances.</p>
         * <p>*   **7**: The instance is being upgraded and is running. This value is valid only for Enterprise Platinum Edition instances.</p>
         */
        @NameInMap("InstanceStatus")
        public Integer instanceStatus;

        /**
         * <p>The instance type. Valid values:</p>
         * <br>
         * <p>*   **1**: The instance is a Standard Edition instance that uses the pay-as-you-go billing method.</p>
         * <p>*   **2**: The instance is an Enterprise Platinum Edition instance that uses the subscription billing method.</p>
         * <br>
         * <p>For information about the editions and specifications of Message Queue for Apache RocketMQ instances, see [Instance editions](~~185261~~).</p>
         */
        @NameInMap("InstanceType")
        public Integer instanceType;

        /**
         * <p>The maximum transactions per second (TPS) for sending and receiving messages. Valid values: 5000, 10000, 20000, 50000, 100000, 200000, 300000, 500000, 800000, and 1000000.</p>
         * <br>
         * <p>For more information, see the description on the buy page.</p>
         * <br>
         * <p>>  This parameter is available only for Message Queue for Apache RocketMQ instances of the Enterprise Platinum Edition.</p>
         */
        @NameInMap("MaxTps")
        public Long maxTps;

        /**
         * <p>The point in time when the Enterprise Platinum Edition instance expires.</p>
         */
        @NameInMap("ReleaseTime")
        public Long releaseTime;

        /**
         * <p>The description of the instance.</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The maximum number of topics that can be created on the instance. Valid values: 25, 50, 100, 300, and 500.</p>
         * <br>
         * <p>>  This parameter is available only for Message Queue for Apache RocketMQ instances of the Enterprise Platinum Edition.</p>
         */
        @NameInMap("TopicCapacity")
        public Integer topicCapacity;

        @NameInMap("spInstanceId")
        public String spInstanceId;

        @NameInMap("spInstanceType")
        public Integer spInstanceType;

        public static OnsInstanceBaseInfoResponseBodyInstanceBaseInfo build(java.util.Map<String, ?> map) throws Exception {
            OnsInstanceBaseInfoResponseBodyInstanceBaseInfo self = new OnsInstanceBaseInfoResponseBodyInstanceBaseInfo();
            return TeaModel.build(map, self);
        }

        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
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

        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfo setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfo setInstanceStatus(Integer instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public Integer getInstanceStatus() {
            return this.instanceStatus;
        }

        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfo setInstanceType(Integer instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Integer getInstanceType() {
            return this.instanceType;
        }

        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfo setMaxTps(Long maxTps) {
            this.maxTps = maxTps;
            return this;
        }
        public Long getMaxTps() {
            return this.maxTps;
        }

        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfo setReleaseTime(Long releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfo setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfo setTopicCapacity(Integer topicCapacity) {
            this.topicCapacity = topicCapacity;
            return this;
        }
        public Integer getTopicCapacity() {
            return this.topicCapacity;
        }

        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfo setSpInstanceId(String spInstanceId) {
            this.spInstanceId = spInstanceId;
            return this;
        }
        public String getSpInstanceId() {
            return this.spInstanceId;
        }

        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfo setSpInstanceType(Integer spInstanceType) {
            this.spInstanceType = spInstanceType;
            return this;
        }
        public Integer getSpInstanceType() {
            return this.spInstanceType;
        }

    }

}
