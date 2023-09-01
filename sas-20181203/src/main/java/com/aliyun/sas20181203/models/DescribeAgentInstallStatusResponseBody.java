// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAgentInstallStatusResponseBody extends TeaModel {
    /**
     * <p>The status of servers.</p>
     */
    @NameInMap("AegisClientInvokeStatusResponseList")
    public java.util.List<DescribeAgentInstallStatusResponseBodyAegisClientInvokeStatusResponseList> aegisClientInvokeStatusResponseList;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAgentInstallStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgentInstallStatusResponseBody self = new DescribeAgentInstallStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAgentInstallStatusResponseBody setAegisClientInvokeStatusResponseList(java.util.List<DescribeAgentInstallStatusResponseBodyAegisClientInvokeStatusResponseList> aegisClientInvokeStatusResponseList) {
        this.aegisClientInvokeStatusResponseList = aegisClientInvokeStatusResponseList;
        return this;
    }
    public java.util.List<DescribeAgentInstallStatusResponseBodyAegisClientInvokeStatusResponseList> getAegisClientInvokeStatusResponseList() {
        return this.aegisClientInvokeStatusResponseList;
    }

    public DescribeAgentInstallStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAgentInstallStatusResponseBodyAegisClientInvokeStatusResponseList extends TeaModel {
        /**
         * <p>The returned message.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The installation status. Valid value:</p>
         * <br>
         * <p>*   **-1**: The agent is not installed.</p>
         * <p>*   **0**: The agent is installed.</p>
         * <p>*   **1**: Failed to create a directory in the client.</p>
         * <p>*   **2**: Failed to download the installation package.</p>
         * <p>*   **3**: The installation file does not exist.</p>
         * <p>*   **4**: The verification information of the installation file does not exist.</p>
         * <p>*   **5**: Failed to verify the installation file.</p>
         * <p>*   **6**: Failed to execute the installation file.</p>
         * <p>*   **7**: You do not have the required permissions. The installation failed.</p>
         * <p>*   **8**: No client process is detected.</p>
         * <p>*   **100**: The installation failed due to an unknown error.</p>
         * <p>*   **1001**: The installation failed. One-click installation is not supported in this region.</p>
         * <p>*   **1002**: The installation failed. Servers that are not provided by Alibaba Cloud are not supported. Install the agent by executing a script on the server.</p>
         * <p>*   **1003**: The installation failed. The operating system is not supported.</p>
         * <p>*   **1004**: An internal error occurred. Try again later.</p>
         * <p>*   **1005**: The Elastic Compute Service (ECS) instance is not started. Start the ECS instance and try again.</p>
         * <p>*   **1006**: One-click installation is not supported for ECS instances of the classic network type.</p>
         * <p>*   **1007**: The running command is manually stopped.</p>
         * <p>*   **1008**: Cloud Assistant is not installed. You cannot install the client.</p>
         * <p>*   **1009**: The command execution timed out. Try again later.</p>
         * <p>*   **1010**: The machine is already online. You do not need to install a client.</p>
         */
        @NameInMap("ResuleCode")
        public String resuleCode;

        /**
         * <p>The installation result. Valid value:</p>
         * <br>
         * <p>*   **-1**: The agent is not installed.</p>
         * <p>*   **0**: The agent is being installed.</p>
         * <p>*   **1**: The agent is installed.</p>
         * <p>*   **2**: The installation failed.</p>
         */
        @NameInMap("Result")
        public Integer result;

        /**
         * <p>The UUID of the server.</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeAgentInstallStatusResponseBodyAegisClientInvokeStatusResponseList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAgentInstallStatusResponseBodyAegisClientInvokeStatusResponseList self = new DescribeAgentInstallStatusResponseBodyAegisClientInvokeStatusResponseList();
            return TeaModel.build(map, self);
        }

        public DescribeAgentInstallStatusResponseBodyAegisClientInvokeStatusResponseList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeAgentInstallStatusResponseBodyAegisClientInvokeStatusResponseList setResuleCode(String resuleCode) {
            this.resuleCode = resuleCode;
            return this;
        }
        public String getResuleCode() {
            return this.resuleCode;
        }

        public DescribeAgentInstallStatusResponseBodyAegisClientInvokeStatusResponseList setResult(Integer result) {
            this.result = result;
            return this;
        }
        public Integer getResult() {
            return this.result;
        }

        public DescribeAgentInstallStatusResponseBodyAegisClientInvokeStatusResponseList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
