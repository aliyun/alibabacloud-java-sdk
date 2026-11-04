// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagRouteProtocolBgpResponseBody extends TeaModel {
    /**
     * <p>The hold time. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("HoldTime")
    public Integer holdTime;

    /**
     * <p>The keepalive interval. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("KeepAlive")
    public Integer keepAlive;

    /**
     * <p>The autonomous system (AS) number of the Smart Access Gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>65536</p>
     */
    @NameInMap("LocalAs")
    public Integer localAs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2F39E4FE-B45C-47FF-9921-95780486F52D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The BGP router ID.</p>
     * 
     * <strong>example:</strong>
     * <p>192.XX.XX.1</p>
     */
    @NameInMap("RouterId")
    public String routerId;

    /**
     * <p>The status of the query task.</p>
     */
    @NameInMap("TaskStates")
    public java.util.List<DescribeSagRouteProtocolBgpResponseBodyTaskStates> taskStates;

    public static DescribeSagRouteProtocolBgpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagRouteProtocolBgpResponseBody self = new DescribeSagRouteProtocolBgpResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagRouteProtocolBgpResponseBody setHoldTime(Integer holdTime) {
        this.holdTime = holdTime;
        return this;
    }
    public Integer getHoldTime() {
        return this.holdTime;
    }

    public DescribeSagRouteProtocolBgpResponseBody setKeepAlive(Integer keepAlive) {
        this.keepAlive = keepAlive;
        return this;
    }
    public Integer getKeepAlive() {
        return this.keepAlive;
    }

    public DescribeSagRouteProtocolBgpResponseBody setLocalAs(Integer localAs) {
        this.localAs = localAs;
        return this;
    }
    public Integer getLocalAs() {
        return this.localAs;
    }

    public DescribeSagRouteProtocolBgpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagRouteProtocolBgpResponseBody setRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }
    public String getRouterId() {
        return this.routerId;
    }

    public DescribeSagRouteProtocolBgpResponseBody setTaskStates(java.util.List<DescribeSagRouteProtocolBgpResponseBodyTaskStates> taskStates) {
        this.taskStates = taskStates;
        return this;
    }
    public java.util.List<DescribeSagRouteProtocolBgpResponseBodyTaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static class DescribeSagRouteProtocolBgpResponseBodyTaskStates extends TeaModel {
        /**
         * <p>The timestamp when the query task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1586765938000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The error code. 200 indicates that the query task succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message. Successful indicates that the query task succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The status of the asynchronous task. Valid values:</p>
         * <ul>
         * <li><strong>Initialized</strong>: The query task is initialized.</li>
         * <li><strong>Offline</strong>: The Smart Access Gateway device is offline and the query task is not delivered. The task will be delivered after the device comes online.</li>
         * <li><strong>Succeed</strong>: The query task succeeded.</li>
         * <li><strong>Processing</strong>: The query task is being delivered.</li>
         * <li><strong>VersionNotSupport</strong>: The current version of the Smart Access Gateway device does not support this feature.</li>
         * <li><strong>BuildRequestError</strong>: The management and control system does not support the operation.</li>
         * <li><strong>HardwareError</strong>: The query task failed to be delivered due to a device error.</li>
         * <li><strong>TaskNotExist</strong>: The query task does not exist.</li>
         * <li><strong>OfflineNotConfiged</strong>: The Smart Access Gateway device is offline and the query task is not delivered. The task will not be delivered after the device comes online.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeed</p>
         */
        @NameInMap("State")
        public String state;

        public static DescribeSagRouteProtocolBgpResponseBodyTaskStates build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagRouteProtocolBgpResponseBodyTaskStates self = new DescribeSagRouteProtocolBgpResponseBodyTaskStates();
            return TeaModel.build(map, self);
        }

        public DescribeSagRouteProtocolBgpResponseBodyTaskStates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSagRouteProtocolBgpResponseBodyTaskStates setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSagRouteProtocolBgpResponseBodyTaskStates setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSagRouteProtocolBgpResponseBodyTaskStates setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
