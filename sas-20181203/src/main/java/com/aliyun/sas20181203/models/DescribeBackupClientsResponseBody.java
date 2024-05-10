// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackupClientsResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the information about the anti-ransomware agent.</p>
     */
    @NameInMap("Clients")
    public java.util.List<DescribeBackupClientsResponseBodyClients> clients;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBackupClientsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupClientsResponseBody self = new DescribeBackupClientsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupClientsResponseBody setClients(java.util.List<DescribeBackupClientsResponseBodyClients> clients) {
        this.clients = clients;
        return this;
    }
    public java.util.List<DescribeBackupClientsResponseBodyClients> getClients() {
        return this.clients;
    }

    public DescribeBackupClientsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeBackupClientsResponseBodyClients extends TeaModel {
        /**
         * <p>The ID of the anti-ransomware agent.</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The status of the anti-ransomware agent.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   **INSTALLING**: The agent is being installed.</p>
         * <p>*   **ONLINE**: The agent is online.</p>
         * <p>*   **UNINSTALLING**: The agent is being uninstalled.</p>
         * <p>*   **NOT_INSTALLED**: The agent is not installed.</p>
         * <p>*   **ACTIVATED**: The agent is enabled.</p>
         * <p>*   **CLIENT_CONNECTION_ERROR**: A connection error occurs on the agent.</p>
         */
        @NameInMap("ClientStatus")
        public String clientStatus;

        /**
         * <p>The version of the anti-ransomware agent.</p>
         */
        @NameInMap("ClientVersion")
        public String clientVersion;

        /**
         * <p>The ID of the ECS instance on which the anti-ransomware agent is installed.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The UUID of the Elastic Compute Service (ECS) instance on which the anti-ransomware agent is installed.</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeBackupClientsResponseBodyClients build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupClientsResponseBodyClients self = new DescribeBackupClientsResponseBodyClients();
            return TeaModel.build(map, self);
        }

        public DescribeBackupClientsResponseBodyClients setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public DescribeBackupClientsResponseBodyClients setClientStatus(String clientStatus) {
            this.clientStatus = clientStatus;
            return this;
        }
        public String getClientStatus() {
            return this.clientStatus;
        }

        public DescribeBackupClientsResponseBodyClients setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

        public DescribeBackupClientsResponseBodyClients setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeBackupClientsResponseBodyClients setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
