// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAgentInstallStatusResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the installation results for the servers.</p>
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
         * <p>The message returned.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The result code returned. Valid values:</p>
         * <br>
         * <p>*   **-1**: The agent is not installed.</p>
         * <p>*   **0**: The agent is installed.</p>
         * <p>*   **1**: The directory of the agent failed to be created.</p>
         * <p>*   **2**: The installation package failed to be downloaded.</p>
         * <p>*   **3**: The installation file does not exist.</p>
         * <p>*   **4**: The verification information about the installation file does not exist.</p>
         * <p>*   **5**: The installation file failed to pass the verification.</p>
         * <p>*   **6**: The installation file failed to be executed.</p>
         * <p>*   **7**: The agent failed to be installed because the required permissions are not granted.</p>
         * <p>*   **8**: No process of the agent was detected.</p>
         * <p>*   **100**: The agent failed to be installed because an unknown error occurred.</p>
         * <p>*   **1001**: The agent failed to be installed because the automatic installation of the agent is not supported in the region.</p>
         * <p>*   **1002**: The agent failed to be installed because the agent cannot be installed on servers outside the cloud. You can install the agent only on supported servers.</p>
         * <p>*   **1003**: The agent failed to be installed because the operating system type of the server is not supported.</p>
         * <p>*   **1004**: An internal error occurred. Try again later.</p>
         * <p>*   **1005**: The Elastic Compute Service (ECS) instance is not running. Start the ECS instance and try again.</p>
         * <p>*   **1006**: The automatic installation of the agent is not supported on an ECS instance that resides in the classic network.</p>
         * <p>*   **1007**: The process of the installation command is manually stopped.</p>
         * <p>*   **1008**: The agent failed to be installed because Cloud Assistant is not installed.</p>
         * <p>*   **1009**: The execution of the installation command timed out. Try again later.</p>
         * <p>*   **1010**: The agent on the server is already online. You do not need to install the agent.</p>
         */
        @NameInMap("ResuleCode")
        public String resuleCode;

        /**
         * <p>The installation result. Valid value:</p>
         * <br>
         * <p>*   **-1**: not installed</p>
         * <p>*   **0**: being installed</p>
         * <p>*   **1**: installed</p>
         * <p>*   **2**: installation failed</p>
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
