// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagWanListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskStates")
    public java.util.List<DescribeSagWanListResponseBodyTaskStates> taskStates;

    @NameInMap("Wans")
    public java.util.List<DescribeSagWanListResponseBodyWans> wans;

    public static DescribeSagWanListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagWanListResponseBody self = new DescribeSagWanListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagWanListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagWanListResponseBody setTaskStates(java.util.List<DescribeSagWanListResponseBodyTaskStates> taskStates) {
        this.taskStates = taskStates;
        return this;
    }
    public java.util.List<DescribeSagWanListResponseBodyTaskStates> getTaskStates() {
        return this.taskStates;
    }

    public DescribeSagWanListResponseBody setWans(java.util.List<DescribeSagWanListResponseBodyWans> wans) {
        this.wans = wans;
        return this;
    }
    public java.util.List<DescribeSagWanListResponseBodyWans> getWans() {
        return this.wans;
    }

    public static class DescribeSagWanListResponseBodyTaskStates extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("State")
        public String state;

        public static DescribeSagWanListResponseBodyTaskStates build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagWanListResponseBodyTaskStates self = new DescribeSagWanListResponseBodyTaskStates();
            return TeaModel.build(map, self);
        }

        public DescribeSagWanListResponseBodyTaskStates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSagWanListResponseBodyTaskStates setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSagWanListResponseBodyTaskStates setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSagWanListResponseBodyTaskStates setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class DescribeSagWanListResponseBodyWans extends TeaModel {
        @NameInMap("BandWidth")
        public Integer bandWidth;

        @NameInMap("Gateway")
        public String gateway;

        @NameInMap("IP")
        public String IP;

        @NameInMap("IPType")
        public String IPType;

        @NameInMap("ISP")
        public String ISP;

        @NameInMap("Mask")
        public String mask;

        @NameInMap("PortName")
        public String portName;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("TrafficState")
        public String trafficState;

        @NameInMap("Username")
        public String username;

        @NameInMap("Weight")
        public Integer weight;

        public static DescribeSagWanListResponseBodyWans build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagWanListResponseBodyWans self = new DescribeSagWanListResponseBodyWans();
            return TeaModel.build(map, self);
        }

        public DescribeSagWanListResponseBodyWans setBandWidth(Integer bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public Integer getBandWidth() {
            return this.bandWidth;
        }

        public DescribeSagWanListResponseBodyWans setGateway(String gateway) {
            this.gateway = gateway;
            return this;
        }
        public String getGateway() {
            return this.gateway;
        }

        public DescribeSagWanListResponseBodyWans setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeSagWanListResponseBodyWans setIPType(String IPType) {
            this.IPType = IPType;
            return this;
        }
        public String getIPType() {
            return this.IPType;
        }

        public DescribeSagWanListResponseBodyWans setISP(String ISP) {
            this.ISP = ISP;
            return this;
        }
        public String getISP() {
            return this.ISP;
        }

        public DescribeSagWanListResponseBodyWans setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public DescribeSagWanListResponseBodyWans setPortName(String portName) {
            this.portName = portName;
            return this;
        }
        public String getPortName() {
            return this.portName;
        }

        public DescribeSagWanListResponseBodyWans setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public DescribeSagWanListResponseBodyWans setTrafficState(String trafficState) {
            this.trafficState = trafficState;
            return this;
        }
        public String getTrafficState() {
            return this.trafficState;
        }

        public DescribeSagWanListResponseBodyWans setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public DescribeSagWanListResponseBodyWans setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}
