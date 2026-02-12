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
     * 
     * <strong>example:</strong>
     * <p>6CC46974-65E8-4C20-AB07-D20D102E****</p>
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
         * 
         * <strong>example:</strong>
         * <p><a href="http://138015630679****.mqrest.cn-chengdu-internal.aliyuncs.com">http://138015630679****.mqrest.cn-chengdu-internal.aliyuncs.com</a></p>
         */
        @NameInMap("HttpInternalEndpoint")
        public String httpInternalEndpoint;

        /**
         * <p>The public HTTP endpoint of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://138015630679****.mqrest.cn-chengdu.aliyuncs.com">http://138015630679****.mqrest.cn-chengdu.aliyuncs.com</a></p>
         */
        @NameInMap("HttpInternetEndpoint")
        public String httpInternetEndpoint;

        /**
         * <p>The public HTTPS endpoint of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://138015630679****.mqrest.cn-chengdu.aliyuncs.com">https://138015630679****.mqrest.cn-chengdu.aliyuncs.com</a></p>
         */
        @NameInMap("HttpInternetSecureEndpoint")
        public String httpInternetSecureEndpoint;

        /**
         * <p>The private TCP endpoint of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://MQ_INST_138015630679****_BAAy1Hac.cn-chengdu.mq-internal.aliyuncs.com:8080">http://MQ_INST_138015630679****_BAAy1Hac.cn-chengdu.mq-internal.aliyuncs.com:8080</a></p>
         */
        @NameInMap("TcpEndpoint")
        public String tcpEndpoint;

        /**
         * <p>The public TCP endpoint of the instance.</p>
         * <ul>
         * <li><p>Only instances that are deployed in the China (Chengdu), China (Qingdao), or China (Shenzhen) region can be accessed by using public TCP endpoints.</p>
         * </li>
         * <li><p>Before you use a public TCP endpoint, make sure that your client SDK meets the following requirements:</p>
         * <ul>
         * <li>TCP client SDK for Java: V2.0.0.Final or later For more information, see <a href="https://help.aliyun.com/document_detail/325569.html">Release notes for the SDK for Java</a>.</li>
         * <li>TCP client SDK for C++: V3.0.0 or later For more information, see <a href="https://help.aliyun.com/document_detail/325570.html">Release notes for the SDK for C++</a>.</li>
         * </ul>
         * </li>
         * <li><p>You are charged for Internet traffic when you use a public TCP endpoint. For more information, see <a href="https://help.aliyun.com/document_detail/325571.html">Internet traffic fee</a>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="http://MQ_INST_138015630679****_BAAy1Hac.mq.cn-chengdu.aliyuncs.com:80">http://MQ_INST_138015630679****_BAAy1Hac.mq.cn-chengdu.aliyuncs.com:80</a></p>
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
        /**
         * <p>The time when the instance was created. The value of this parameter is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1570701259403</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The endpoints used to access ApsaraMQ for RocketMQ over different protocols.</p>
         */
        @NameInMap("Endpoints")
        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfoEndpoints endpoints;

        /**
         * <p>Indicates whether the instance uses a namespace. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The instance uses a separate namespace. The name of each resource must be unique in the instance. The names of resources in different instances can be the same.</li>
         * <li><strong>false</strong>: The instance does not use a separate namespace. The name of each resource must be globally unique within the instance and across all instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IndependentNaming")
        public Boolean independentNaming;

        /**
         * <p>The ID of the instance</p>
         * 
         * <strong>example:</strong>
         * <p>MQ_INST_138015630679****_BAAy1Hac</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the instance.</p>
         * <p>The name must be 3 to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The status of the instance. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The instance is being deployed. This value is valid only for Enterprise Platinum Edition instances.</li>
         * <li><strong>2</strong>: The instance has overdue payments. This value is valid only for Standard Edition instances.</li>
         * <li><strong>5</strong>: The instance is running. This value is valid for Standard Edition instances and Enterprise Platinum Edition instances.</li>
         * <li><strong>7</strong>: The instance is being upgraded and is running. This value is valid only for Enterprise Platinum Edition instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("InstanceStatus")
        public Integer instanceStatus;

        /**
         * <p>The instance type. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Standard Edition instances that use the pay-as-you-go billing method.</li>
         * <li><strong>2</strong>: Enterprise Platinum Edition instances that use the subscription billing method.</li>
         * </ul>
         * <p>For information about the editions and specifications of ApsaraMQ for RocketMQ instances, see <a href="https://help.aliyun.com/document_detail/185261.html">Instance editions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("InstanceType")
        public Integer instanceType;

        /**
         * <p>The maximum messaging transactions per second (TPS). Valid values: 5000, 10000, 20000, 50000, 100000, 200000, 300000, 500000, 800000, and 1000000.</p>
         * <p>You can view the details about messaging TPS on the buy page of ApsaraMQ for RocketMQ.</p>
         * <blockquote>
         * <p>This parameter is available only to the ApsaraMQ for RocketMQ Enterprise Platinum Edition instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("MaxTps")
        public Long maxTps;

        /**
         * <p>The time when the Enterprise Platinum Edition instance expires.</p>
         * 
         * <strong>example:</strong>
         * <p>1603555200000</p>
         */
        @NameInMap("ReleaseTime")
        public Long releaseTime;

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ons-cn-m7r1r5f****</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SupportClassic")
        public Integer supportClassic;

        /**
         * <p>The maximum number of topics that can be created on the instance. Valid values: 25, 50, 100, 300, and 500.</p>
         * <blockquote>
         * <p>This parameter is available only to the ApsaraMQ for RocketMQ Enterprise Platinum Edition instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("TopicCapacity")
        public Integer topicCapacity;

        /**
         * <p>The commodity ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ons-cn-m7r1r5f****</p>
         */
        @NameInMap("spInstanceId")
        public String spInstanceId;

        /**
         * <p>The commodity type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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

        public OnsInstanceBaseInfoResponseBodyInstanceBaseInfo setSupportClassic(Integer supportClassic) {
            this.supportClassic = supportClassic;
            return this;
        }
        public Integer getSupportClassic() {
            return this.supportClassic;
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
