// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagRouteProtocolOspfResponseBody extends TeaModel {
    @NameInMap("AreaId")
    public String areaId;

    @NameInMap("AreaType")
    public String areaType;

    @NameInMap("AuthenticationType")
    public String authenticationType;

    @NameInMap("DeadTime")
    public Integer deadTime;

    @NameInMap("HelloTime")
    public Integer helloTime;

    @NameInMap("Md5Key")
    public String md5Key;

    @NameInMap("Md5KeyId")
    public Integer md5KeyId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RouterId")
    public String routerId;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

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
