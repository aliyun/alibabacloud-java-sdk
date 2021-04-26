// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class DescribeDevicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Devices")
    public DescribeDevicesResponseBodyDevices devices;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDevicesResponseBody self = new DescribeDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDevicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDevicesResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeDevicesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeDevicesResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeDevicesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeDevicesResponseBody setDevices(DescribeDevicesResponseBodyDevices devices) {
        this.devices = devices;
        return this;
    }
    public DescribeDevicesResponseBodyDevices getDevices() {
        return this.devices;
    }

    public DescribeDevicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDevicesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDevicesResponseBodyDevicesDevice extends TeaModel {
        @NameInMap("IpcId")
        public Long ipcId;

        @NameInMap("IpcName")
        public String ipcName;

        @NameInMap("IpcStatus")
        public String ipcStatus;

        @NameInMap("AgentMac")
        public String agentMac;

        @NameInMap("IpcIp")
        public String ipcIp;

        @NameInMap("AgentReceiveTime")
        public Long agentReceiveTime;

        @NameInMap("IpcReceiveTime")
        public Long ipcReceiveTime;

        @NameInMap("AgentIp")
        public String agentIp;

        @NameInMap("AgentStatus")
        public String agentStatus;

        public static DescribeDevicesResponseBodyDevicesDevice build(java.util.Map<String, ?> map) throws Exception {
            DescribeDevicesResponseBodyDevicesDevice self = new DescribeDevicesResponseBodyDevicesDevice();
            return TeaModel.build(map, self);
        }

        public DescribeDevicesResponseBodyDevicesDevice setIpcId(Long ipcId) {
            this.ipcId = ipcId;
            return this;
        }
        public Long getIpcId() {
            return this.ipcId;
        }

        public DescribeDevicesResponseBodyDevicesDevice setIpcName(String ipcName) {
            this.ipcName = ipcName;
            return this;
        }
        public String getIpcName() {
            return this.ipcName;
        }

        public DescribeDevicesResponseBodyDevicesDevice setIpcStatus(String ipcStatus) {
            this.ipcStatus = ipcStatus;
            return this;
        }
        public String getIpcStatus() {
            return this.ipcStatus;
        }

        public DescribeDevicesResponseBodyDevicesDevice setAgentMac(String agentMac) {
            this.agentMac = agentMac;
            return this;
        }
        public String getAgentMac() {
            return this.agentMac;
        }

        public DescribeDevicesResponseBodyDevicesDevice setIpcIp(String ipcIp) {
            this.ipcIp = ipcIp;
            return this;
        }
        public String getIpcIp() {
            return this.ipcIp;
        }

        public DescribeDevicesResponseBodyDevicesDevice setAgentReceiveTime(Long agentReceiveTime) {
            this.agentReceiveTime = agentReceiveTime;
            return this;
        }
        public Long getAgentReceiveTime() {
            return this.agentReceiveTime;
        }

        public DescribeDevicesResponseBodyDevicesDevice setIpcReceiveTime(Long ipcReceiveTime) {
            this.ipcReceiveTime = ipcReceiveTime;
            return this;
        }
        public Long getIpcReceiveTime() {
            return this.ipcReceiveTime;
        }

        public DescribeDevicesResponseBodyDevicesDevice setAgentIp(String agentIp) {
            this.agentIp = agentIp;
            return this;
        }
        public String getAgentIp() {
            return this.agentIp;
        }

        public DescribeDevicesResponseBodyDevicesDevice setAgentStatus(String agentStatus) {
            this.agentStatus = agentStatus;
            return this;
        }
        public String getAgentStatus() {
            return this.agentStatus;
        }

    }

    public static class DescribeDevicesResponseBodyDevices extends TeaModel {
        @NameInMap("Device")
        public java.util.List<DescribeDevicesResponseBodyDevicesDevice> device;

        public static DescribeDevicesResponseBodyDevices build(java.util.Map<String, ?> map) throws Exception {
            DescribeDevicesResponseBodyDevices self = new DescribeDevicesResponseBodyDevices();
            return TeaModel.build(map, self);
        }

        public DescribeDevicesResponseBodyDevices setDevice(java.util.List<DescribeDevicesResponseBodyDevicesDevice> device) {
            this.device = device;
            return this;
        }
        public java.util.List<DescribeDevicesResponseBodyDevicesDevice> getDevice() {
            return this.device;
        }

    }

}
