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
     * 
     * <strong>example:</strong>
     * <p>A4EB8B1C-1DEC-5E18-BCD0-D1BBB3936FA7</p>
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
         * 
         * <strong>example:</strong>
         * <p>Installed</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The installation status. Valid value:</p>
         * <ul>
         * <li><strong>-1</strong>: The agent is not installed.</li>
         * <li><strong>0</strong>: The agent is installed.</li>
         * <li><strong>1</strong>: Failed to create a directory in the client.</li>
         * <li><strong>2</strong>: Failed to download the installation package.</li>
         * <li><strong>3</strong>: The installation file does not exist.</li>
         * <li><strong>4</strong>: The verification information of the installation file does not exist.</li>
         * <li><strong>5</strong>: Failed to verify the installation file.</li>
         * <li><strong>6</strong>: Failed to execute the installation file.</li>
         * <li><strong>7</strong>: You do not have the required permissions. The installation failed.</li>
         * <li><strong>8</strong>: No client process is detected.</li>
         * <li><strong>100</strong>: The installation failed due to an unknown error.</li>
         * <li><strong>1001</strong>: The installation failed. One-click installation is not supported in this region.</li>
         * <li><strong>1002</strong>: The installation failed. Servers that are not provided by Alibaba Cloud are not supported. Install the agent by executing a script on the server.</li>
         * <li><strong>1003</strong>: The installation failed. The operating system is not supported.</li>
         * <li><strong>1004</strong>: An internal error occurred. Try again later.</li>
         * <li><strong>1005</strong>: The Elastic Compute Service (ECS) instance is not started. Start the ECS instance and try again.</li>
         * <li><strong>1006</strong>: One-click installation is not supported for ECS instances of the classic network type.</li>
         * <li><strong>1007</strong>: The running command is manually stopped.</li>
         * <li><strong>1008</strong>: Cloud Assistant is not installed. You cannot install the client.</li>
         * <li><strong>1009</strong>: The command execution timed out. Try again later.</li>
         * <li><strong>1010</strong>: The machine is already online. You do not need to install a client.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResuleCode")
        public String resuleCode;

        /**
         * <p>The installation result. Valid value:</p>
         * <ul>
         * <li><strong>-1</strong>: The agent is not installed.</li>
         * <li><strong>0</strong>: The agent is being installed.</li>
         * <li><strong>1</strong>: The agent is installed.</li>
         * <li><strong>2</strong>: The installation failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Result")
        public Integer result;

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>d123f6ae-9749-4338-8c7f-3c2c1ead****</p>
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
