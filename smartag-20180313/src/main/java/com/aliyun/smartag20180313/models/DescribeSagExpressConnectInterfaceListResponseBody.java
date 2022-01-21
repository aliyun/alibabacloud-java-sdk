// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagExpressConnectInterfaceListResponseBody extends TeaModel {
    @NameInMap("Interfaces")
    public java.util.List<DescribeSagExpressConnectInterfaceListResponseBodyInterfaces> interfaces;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskStates")
    public java.util.List<DescribeSagExpressConnectInterfaceListResponseBodyTaskStates> taskStates;

    public static DescribeSagExpressConnectInterfaceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagExpressConnectInterfaceListResponseBody self = new DescribeSagExpressConnectInterfaceListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagExpressConnectInterfaceListResponseBody setInterfaces(java.util.List<DescribeSagExpressConnectInterfaceListResponseBodyInterfaces> interfaces) {
        this.interfaces = interfaces;
        return this;
    }
    public java.util.List<DescribeSagExpressConnectInterfaceListResponseBodyInterfaces> getInterfaces() {
        return this.interfaces;
    }

    public DescribeSagExpressConnectInterfaceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagExpressConnectInterfaceListResponseBody setTaskStates(java.util.List<DescribeSagExpressConnectInterfaceListResponseBodyTaskStates> taskStates) {
        this.taskStates = taskStates;
        return this;
    }
    public java.util.List<DescribeSagExpressConnectInterfaceListResponseBodyTaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static class DescribeSagExpressConnectInterfaceListResponseBodyInterfaces extends TeaModel {
        @NameInMap("IP")
        public String IP;

        @NameInMap("Mask")
        public String mask;

        @NameInMap("Vlan")
        public String vlan;

        public static DescribeSagExpressConnectInterfaceListResponseBodyInterfaces build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagExpressConnectInterfaceListResponseBodyInterfaces self = new DescribeSagExpressConnectInterfaceListResponseBodyInterfaces();
            return TeaModel.build(map, self);
        }

        public DescribeSagExpressConnectInterfaceListResponseBodyInterfaces setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeSagExpressConnectInterfaceListResponseBodyInterfaces setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public DescribeSagExpressConnectInterfaceListResponseBodyInterfaces setVlan(String vlan) {
            this.vlan = vlan;
            return this;
        }
        public String getVlan() {
            return this.vlan;
        }

    }

    public static class DescribeSagExpressConnectInterfaceListResponseBodyTaskStates extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("State")
        public String state;

        public static DescribeSagExpressConnectInterfaceListResponseBodyTaskStates build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagExpressConnectInterfaceListResponseBodyTaskStates self = new DescribeSagExpressConnectInterfaceListResponseBodyTaskStates();
            return TeaModel.build(map, self);
        }

        public DescribeSagExpressConnectInterfaceListResponseBodyTaskStates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSagExpressConnectInterfaceListResponseBodyTaskStates setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSagExpressConnectInterfaceListResponseBodyTaskStates setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSagExpressConnectInterfaceListResponseBodyTaskStates setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
