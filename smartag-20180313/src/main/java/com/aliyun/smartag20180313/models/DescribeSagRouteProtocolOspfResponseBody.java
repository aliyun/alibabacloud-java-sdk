// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagRouteProtocolOspfResponseBody extends TeaModel {
    /**
     * <p>The ID of the OSPF area.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("AreaId")
    public String areaId;

    /**
     * <p>The type of the OSPF area.</p>
     * <blockquote>
     * <p> Only the NSSA area type is supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>NSSA</p>
     */
    @NameInMap("AreaType")
    public String areaType;

    /**
     * <p>The authentication type. Valid values:</p>
     * <ul>
     * <li><strong>NONE</strong>: Authentication is disabled.</li>
     * <li><strong>CLEARTEXT</strong>: plaintext authentication</li>
     * <li><strong>MD5</strong>: MD5 authentication</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MD5</p>
     */
    @NameInMap("AuthenticationType")
    public String authenticationType;

    /**
     * <p>The timeout period of connections between OSPF peers.</p>
     * <p>Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("DeadTime")
    public Integer deadTime;

    /**
     * <p>The time interval at which Hello packets are sent.</p>
     * <p>Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("HelloTime")
    public Integer helloTime;

    /**
     * <p>The MD5 key value.</p>
     * 
     * <strong>example:</strong>
     * <p>123****</p>
     */
    @NameInMap("Md5Key")
    public String md5Key;

    /**
     * <p>The ID of the MD5 key.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Md5KeyId")
    public Integer md5KeyId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>60F9B653-25B7-4511-A3C7-BCBAF462393E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the router that has OSPF enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>1.XX.XX.1</p>
     */
    @NameInMap("RouterId")
    public String routerId;

    /**
     * <p>The status of the query task.</p>
     */
    @NameInMap("TaskStates")
    public java.util.List<DescribeSagRouteProtocolOspfResponseBodyTaskStates> taskStates;

    public static DescribeSagRouteProtocolOspfResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagRouteProtocolOspfResponseBody self = new DescribeSagRouteProtocolOspfResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagRouteProtocolOspfResponseBody setAreaId(String areaId) {
        this.areaId = areaId;
        return this;
    }
    public String getAreaId() {
        return this.areaId;
    }

    public DescribeSagRouteProtocolOspfResponseBody setAreaType(String areaType) {
        this.areaType = areaType;
        return this;
    }
    public String getAreaType() {
        return this.areaType;
    }

    public DescribeSagRouteProtocolOspfResponseBody setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }
    public String getAuthenticationType() {
        return this.authenticationType;
    }

    public DescribeSagRouteProtocolOspfResponseBody setDeadTime(Integer deadTime) {
        this.deadTime = deadTime;
        return this;
    }
    public Integer getDeadTime() {
        return this.deadTime;
    }

    public DescribeSagRouteProtocolOspfResponseBody setHelloTime(Integer helloTime) {
        this.helloTime = helloTime;
        return this;
    }
    public Integer getHelloTime() {
        return this.helloTime;
    }

    public DescribeSagRouteProtocolOspfResponseBody setMd5Key(String md5Key) {
        this.md5Key = md5Key;
        return this;
    }
    public String getMd5Key() {
        return this.md5Key;
    }

    public DescribeSagRouteProtocolOspfResponseBody setMd5KeyId(Integer md5KeyId) {
        this.md5KeyId = md5KeyId;
        return this;
    }
    public Integer getMd5KeyId() {
        return this.md5KeyId;
    }

    public DescribeSagRouteProtocolOspfResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagRouteProtocolOspfResponseBody setRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }
    public String getRouterId() {
        return this.routerId;
    }

    public DescribeSagRouteProtocolOspfResponseBody setTaskStates(java.util.List<DescribeSagRouteProtocolOspfResponseBodyTaskStates> taskStates) {
        this.taskStates = taskStates;
        return this;
    }
    public java.util.List<DescribeSagRouteProtocolOspfResponseBodyTaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static class DescribeSagRouteProtocolOspfResponseBodyTaskStates extends TeaModel {
        /**
         * <p>The time when the query task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1586843621000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The error code returned. A value of 200 indicates that the query task is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message. A value of Successful indicates that the query task is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The state of the query task. Valid values:</p>
         * <ul>
         * <li><strong>Initialized</strong>: The query task is initialized.</li>
         * <li><strong>Offline</strong>: The SAG device is disconnected from Alibaba Cloud and Alibaba Cloud has not assigned the query task to the SAG device. After the SAG device is connected to Alibaba Cloud, Alibaba Cloud assigns the query task to the SAG device.</li>
         * <li><strong>Succeed</strong>: Alibaba Cloud has assigned the query task to the SAG device.</li>
         * <li><strong>Processing</strong>: Alibaba Cloud is assigning the query task to the SAG device.</li>
         * <li><strong>VersionNotSupport</strong>: The query task is not supported by the current version of the SAG device.</li>
         * <li><strong>BuildRequestError</strong>: The query task is not supported by the controller of the SAG device.</li>
         * <li><strong>HardwareError</strong>: Alibaba Cloud failed to assign the query task to the SAG device because the SAG device is faulty.</li>
         * <li><strong>TaskNotExist</strong>: The query task does not exist.</li>
         * <li><strong>OfflineNotConfiged</strong>: The SAG device is disconnected from Alibaba Cloud and Alibaba Cloud has not assigned the query task to the SAG device. Alibaba Cloud does not assign the query task to the SAG device even after the SAG device is connected to Alibaba Cloud.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeed</p>
         */
        @NameInMap("State")
        public String state;

        public static DescribeSagRouteProtocolOspfResponseBodyTaskStates build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagRouteProtocolOspfResponseBodyTaskStates self = new DescribeSagRouteProtocolOspfResponseBodyTaskStates();
            return TeaModel.build(map, self);
        }

        public DescribeSagRouteProtocolOspfResponseBodyTaskStates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSagRouteProtocolOspfResponseBodyTaskStates setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSagRouteProtocolOspfResponseBodyTaskStates setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSagRouteProtocolOspfResponseBodyTaskStates setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
