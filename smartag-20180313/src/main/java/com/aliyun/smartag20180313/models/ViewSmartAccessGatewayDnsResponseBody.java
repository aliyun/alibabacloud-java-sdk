// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ViewSmartAccessGatewayDnsResponseBody extends TeaModel {
    /**
     * <p>The IP address of the primary DNS server.</p>
     * 
     * <strong>example:</strong>
     * <p>114.114.XXX.XXX</p>
     */
    @NameInMap("MasterDns")
    public String masterDns;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>571AC2E7-8119-58E9-8BFA-1D580CBD1E56</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The IP address of the secondary DNS server.</p>
     * 
     * <strong>example:</strong>
     * <p>8.8.XX.XX</p>
     */
    @NameInMap("SlaveDns")
    public String slaveDns;

    /**
     * <p>The status of the query task.</p>
     */
    @NameInMap("TaskStates")
    public java.util.List<ViewSmartAccessGatewayDnsResponseBodyTaskStates> taskStates;

    public static ViewSmartAccessGatewayDnsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ViewSmartAccessGatewayDnsResponseBody self = new ViewSmartAccessGatewayDnsResponseBody();
        return TeaModel.build(map, self);
    }

    public ViewSmartAccessGatewayDnsResponseBody setMasterDns(String masterDns) {
        this.masterDns = masterDns;
        return this;
    }
    public String getMasterDns() {
        return this.masterDns;
    }

    public ViewSmartAccessGatewayDnsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ViewSmartAccessGatewayDnsResponseBody setSlaveDns(String slaveDns) {
        this.slaveDns = slaveDns;
        return this;
    }
    public String getSlaveDns() {
        return this.slaveDns;
    }

    public ViewSmartAccessGatewayDnsResponseBody setTaskStates(java.util.List<ViewSmartAccessGatewayDnsResponseBodyTaskStates> taskStates) {
        this.taskStates = taskStates;
        return this;
    }
    public java.util.List<ViewSmartAccessGatewayDnsResponseBodyTaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static class ViewSmartAccessGatewayDnsResponseBodyTaskStates extends TeaModel {
        /**
         * <p>The time when the query task was created.</p>
         * <p>The time is a UNIX timestamp that indicates the number of seconds elapsed since 00:00:00 UTC on January 1, 1970.</p>
         * 
         * <strong>example:</strong>
         * <p>1586857309000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The error code. A value of 200 indicates that the query task is successful.</p>
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
         * <p>The status of the asynchronous task. Valid values:</p>
         * <ul>
         * <li><strong>Initialized</strong>: The query task is initialized.</li>
         * <li><strong>Offline</strong>: The Smart Access Gateway device is offline and the query task is not delivered. The task will be delivered after the device goes online.</li>
         * <li><strong>Succeed</strong>: The query task is delivered successfully.</li>
         * <li><strong>Processing</strong>: The query task is being delivered.</li>
         * <li><strong>VersionNotSupport</strong>: The current version of the Smart Access Gateway device does not support this operation.</li>
         * <li><strong>BuildRequestError</strong>: The management and control system does not support this operation.</li>
         * <li><strong>HardwareError</strong>: The query task fails to be delivered due to device errors.</li>
         * <li><strong>TaskNotExist</strong>: The query task does not exist.</li>
         * <li><strong>OfflineNotConfiged</strong>: The Smart Access Gateway device is offline and the query task is not delivered. The task will not be delivered after the device goes online.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeed</p>
         */
        @NameInMap("State")
        public String state;

        public static ViewSmartAccessGatewayDnsResponseBodyTaskStates build(java.util.Map<String, ?> map) throws Exception {
            ViewSmartAccessGatewayDnsResponseBodyTaskStates self = new ViewSmartAccessGatewayDnsResponseBodyTaskStates();
            return TeaModel.build(map, self);
        }

        public ViewSmartAccessGatewayDnsResponseBodyTaskStates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ViewSmartAccessGatewayDnsResponseBodyTaskStates setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ViewSmartAccessGatewayDnsResponseBodyTaskStates setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ViewSmartAccessGatewayDnsResponseBodyTaskStates setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
