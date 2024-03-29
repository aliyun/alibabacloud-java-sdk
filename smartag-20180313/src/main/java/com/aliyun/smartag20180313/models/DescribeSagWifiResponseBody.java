// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagWifiResponseBody extends TeaModel {
    @NameInMap("AuthenticationType")
    public String authenticationType;

    @NameInMap("Bandwidth")
    public String bandwidth;

    @NameInMap("Channel")
    public String channel;

    @NameInMap("EncryptAlgorithm")
    public String encryptAlgorithm;

    @NameInMap("IsAuth")
    public String isAuth;

    @NameInMap("IsBroadcast")
    public String isBroadcast;

    @NameInMap("IsEnable")
    public String isEnable;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Ssid")
    public String ssid;

    @NameInMap("TaskStates")
    public java.util.List<DescribeSagWifiResponseBodyTaskStates> taskStates;

    public static DescribeSagWifiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagWifiResponseBody self = new DescribeSagWifiResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagWifiResponseBody setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }
    public String getAuthenticationType() {
        return this.authenticationType;
    }

    public DescribeSagWifiResponseBody setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public String getBandwidth() {
        return this.bandwidth;
    }

    public DescribeSagWifiResponseBody setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public DescribeSagWifiResponseBody setEncryptAlgorithm(String encryptAlgorithm) {
        this.encryptAlgorithm = encryptAlgorithm;
        return this;
    }
    public String getEncryptAlgorithm() {
        return this.encryptAlgorithm;
    }

    public DescribeSagWifiResponseBody setIsAuth(String isAuth) {
        this.isAuth = isAuth;
        return this;
    }
    public String getIsAuth() {
        return this.isAuth;
    }

    public DescribeSagWifiResponseBody setIsBroadcast(String isBroadcast) {
        this.isBroadcast = isBroadcast;
        return this;
    }
    public String getIsBroadcast() {
        return this.isBroadcast;
    }

    public DescribeSagWifiResponseBody setIsEnable(String isEnable) {
        this.isEnable = isEnable;
        return this;
    }
    public String getIsEnable() {
        return this.isEnable;
    }

    public DescribeSagWifiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagWifiResponseBody setSsid(String ssid) {
        this.ssid = ssid;
        return this;
    }
    public String getSsid() {
        return this.ssid;
    }

    public DescribeSagWifiResponseBody setTaskStates(java.util.List<DescribeSagWifiResponseBodyTaskStates> taskStates) {
        this.taskStates = taskStates;
        return this;
    }
    public java.util.List<DescribeSagWifiResponseBodyTaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static class DescribeSagWifiResponseBodyTaskStates extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("State")
        public String state;

        public static DescribeSagWifiResponseBodyTaskStates build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagWifiResponseBodyTaskStates self = new DescribeSagWifiResponseBodyTaskStates();
            return TeaModel.build(map, self);
        }

        public DescribeSagWifiResponseBodyTaskStates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSagWifiResponseBodyTaskStates setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSagWifiResponseBodyTaskStates setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSagWifiResponseBodyTaskStates setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
