// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of instances.</p>
     */
    @NameInMap("Instances")
    public java.util.List<ListInstancesResponseBodyInstances> instances;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>operation success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>294F5B26-FADF-41D0-BE68-14ABE4EB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static ListInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponseBody self = new ListInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstancesResponseBody setInstances(java.util.List<ListInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<ListInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public ListInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ListInstancesResponseBodyInstancesMqttTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ListInstancesResponseBodyInstancesMqttTags build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesMqttTags self = new ListInstancesResponseBodyInstancesMqttTags();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesMqttTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListInstancesResponseBodyInstancesMqttTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListInstancesResponseBodyInstances extends TeaModel {
        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1739345768000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The expiration time of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1741795200000</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mqtt-cn-xxxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>mqtt-cn-xxxxxxx</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The instance status.</p>
         * <ul>
         * <li><p>0: Preparing</p>
         * </li>
         * <li><p>5: In Service</p>
         * </li>
         * <li><p>7: Upgrading</p>
         * </li>
         * <li><p>15: Frozen</p>
         * </li>
         * <li><p>10: Released</p>
         * </li>
         * <li><p>1: Not Activated</p>
         * </li>
         * <li><p>2: Overdue</p>
         * </li>
         * <li><p>3: Expired</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("InstanceStatus")
        public Integer instanceStatus;

        /**
         * <p>The instance type:</p>
         * <ul>
         * <li><p>0: Basic Edition</p>
         * </li>
         * <li><p>1: Platinum Edition</p>
         * </li>
         * <li><p>2: Pay-as-you-go</p>
         * </li>
         * <li><p>3: Subscription Lightweight</p>
         * </li>
         * <li><p>4: Professional Edition</p>
         * </li>
         * <li><p>5: Serverless Edition</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("InstanceType")
        public Integer instanceType;

        /**
         * <p>The Milvus version.</p>
         * 
         * <strong>example:</strong>
         * <p>V3.3.0</p>
         */
        @NameInMap("KernelVersion")
        public String kernelVersion;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("MqttTags")
        public java.util.List<ListInstancesResponseBodyInstancesMqttTags> mqttTags;

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>245949616640095</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The instance type of the Professional Edition instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mqtt.p2.1xlarge</p>
         */
        @NameInMap("Specific")
        public String specific;

        public static ListInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstances self = new ListInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstances setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListInstancesResponseBodyInstances setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public ListInstancesResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesResponseBodyInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListInstancesResponseBodyInstances setInstanceStatus(Integer instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public Integer getInstanceStatus() {
            return this.instanceStatus;
        }

        public ListInstancesResponseBodyInstances setInstanceType(Integer instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Integer getInstanceType() {
            return this.instanceType;
        }

        public ListInstancesResponseBodyInstances setKernelVersion(String kernelVersion) {
            this.kernelVersion = kernelVersion;
            return this;
        }
        public String getKernelVersion() {
            return this.kernelVersion;
        }

        public ListInstancesResponseBodyInstances setMqttTags(java.util.List<ListInstancesResponseBodyInstancesMqttTags> mqttTags) {
            this.mqttTags = mqttTags;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyInstancesMqttTags> getMqttTags() {
            return this.mqttTags;
        }

        public ListInstancesResponseBodyInstances setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public ListInstancesResponseBodyInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListInstancesResponseBodyInstances setSpecific(String specific) {
            this.specific = specific;
            return this;
        }
        public String getSpecific() {
            return this.specific;
        }

    }

}
