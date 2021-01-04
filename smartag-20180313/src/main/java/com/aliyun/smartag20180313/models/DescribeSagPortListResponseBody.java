// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagPortListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Ports")
    public java.util.List<DescribeSagPortListResponseBodyPorts> ports;

    @NameInMap("TaskStates")
    public java.util.List<DescribeSagPortListResponseBodyTaskStates> taskStates;

    public static DescribeSagPortListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagPortListResponseBody self = new DescribeSagPortListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagPortListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagPortListResponseBody setPorts(java.util.List<DescribeSagPortListResponseBodyPorts> ports) {
        this.ports = ports;
        return this;
    }
    public java.util.List<DescribeSagPortListResponseBodyPorts> getPorts() {
        return this.ports;
    }

    public DescribeSagPortListResponseBody setTaskStates(java.util.List<DescribeSagPortListResponseBodyTaskStates> taskStates) {
        this.taskStates = taskStates;
        return this;
    }
    public java.util.List<DescribeSagPortListResponseBodyTaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static class DescribeSagPortListResponseBodyPorts extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("PortName")
        public String portName;

        @NameInMap("Role")
        public String role;

        @NameInMap("Mac")
        public String mac;

        public static DescribeSagPortListResponseBodyPorts build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagPortListResponseBodyPorts self = new DescribeSagPortListResponseBodyPorts();
            return TeaModel.build(map, self);
        }

        public DescribeSagPortListResponseBodyPorts setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSagPortListResponseBodyPorts setPortName(String portName) {
            this.portName = portName;
            return this;
        }
        public String getPortName() {
            return this.portName;
        }

        public DescribeSagPortListResponseBodyPorts setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeSagPortListResponseBodyPorts setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

    }

    public static class DescribeSagPortListResponseBodyTaskStates extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("State")
        public String state;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("CreateTime")
        public String createTime;

        public static DescribeSagPortListResponseBodyTaskStates build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagPortListResponseBodyTaskStates self = new DescribeSagPortListResponseBodyTaskStates();
            return TeaModel.build(map, self);
        }

        public DescribeSagPortListResponseBodyTaskStates setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSagPortListResponseBodyTaskStates setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeSagPortListResponseBodyTaskStates setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSagPortListResponseBodyTaskStates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

}
