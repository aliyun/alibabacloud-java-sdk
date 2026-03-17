// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagHaResponseBody extends TeaModel {
    /**
     * <p>The HA mode. Valid values:</p>
     * <ul>
     * <li><strong>NONE</strong>: HA is disabled.</li>
     * <li><strong>STATIC</strong>: static HA is enabled.</li>
     * <li><strong>DYNAMIC</strong>: dynamic HA is enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NONE</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The information about the port.</p>
     */
    @NameInMap("Ports")
    public java.util.List<DescribeSagHaResponseBodyPorts> ports;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>273D62FD-E346-4959-AA18-D79B9276FEFB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the query task.</p>
     */
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
        /**
         * <p>The name of the port.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("PortName")
        public String portName;

        /**
         * <p>The virtual IP address of the SAG device.</p>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.1</p>
         */
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
        /**
         * <p>The time when the query task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1586836343000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The error code returned for a query task. The 200 error code indicates that the query task is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned for a query task. The Successful error message indicates that the query task is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The status of the query task. Valid values:</p>
         * <ul>
         * <li><strong>Initialized</strong>: The query task has been initialized.</li>
         * <li><strong>Offline</strong>: The query task is not dispatched because the SAG device is disconnected from Alibaba Cloud. The task will be dispatched after the SAG device is connected to Alibaba Cloud.</li>
         * <li><strong>Succeed</strong>: The query task has been dispatched.</li>
         * <li><strong>Processing</strong>: The query task is being dispatched.</li>
         * <li><strong>VersionNotSupport</strong>: The current version of the SAG device does not support query tasks.</li>
         * <li><strong>BuildRequestError</strong>: The SAG control system does not support query tasks.</li>
         * <li><strong>HardwareError</strong>: The query task failed to be dispatched due to device errors.</li>
         * <li><strong>TaskNotExist</strong>: The query task does not exist.</li>
         * <li><strong>OfflineNotConfiged</strong>: The query task is not dispatched because the SAG device is disconnected from Alibaba Cloud. The task will not be dispatched after the device is connected to Alibaba Cloud.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeed</p>
         */
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
