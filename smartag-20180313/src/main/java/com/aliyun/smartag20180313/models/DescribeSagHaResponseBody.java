// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagHaResponseBody extends TeaModel {
    @NameInMap("Mode")
    public String mode;

    @NameInMap("Ports")
    public java.util.List<DescribeSagHaResponseBodyPorts> ports;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskStates")
    public java.util.List<DescribeSagHaResponseBodyTaskStates> taskStates;

    public static DescribeSagHaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagHaResponseBody self = new DescribeSagHaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagHaResponseBody setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public DescribeSagHaResponseBody setPorts(java.util.List<DescribeSagHaResponseBodyPorts> ports) {
        this.ports = ports;
        return this;
    }
    public java.util.List<DescribeSagHaResponseBodyPorts> getPorts() {
        return this.ports;
    }

    public DescribeSagHaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagHaResponseBody setTaskStates(java.util.List<DescribeSagHaResponseBodyTaskStates> taskStates) {
        this.taskStates = taskStates;
        return this;
    }
    public java.util.List<DescribeSagHaResponseBodyTaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static class DescribeSagHaResponseBodyPorts extends TeaModel {
        @NameInMap("PortName")
        public String portName;

        @NameInMap("VirtualIp")
        public String virtualIp;

        public static DescribeSagHaResponseBodyPorts build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagHaResponseBodyPorts self = new DescribeSagHaResponseBodyPorts();
            return TeaModel.build(map, self);
        }

        public DescribeSagHaResponseBodyPorts setPortName(String portName) {
            this.portName = portName;
            return this;
        }
        public String getPortName() {
            return this.portName;
        }

        public DescribeSagHaResponseBodyPorts setVirtualIp(String virtualIp) {
            this.virtualIp = virtualIp;
            return this;
        }
        public String getVirtualIp() {
            return this.virtualIp;
        }

    }

    public static class DescribeSagHaResponseBodyTaskStates extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("State")
        public String state;

        public static DescribeSagHaResponseBodyTaskStates build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagHaResponseBodyTaskStates self = new DescribeSagHaResponseBodyTaskStates();
            return TeaModel.build(map, self);
        }

        public DescribeSagHaResponseBodyTaskStates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSagHaResponseBodyTaskStates setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSagHaResponseBodyTaskStates setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSagHaResponseBodyTaskStates setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
