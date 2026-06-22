// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackupClientsResponseBody extends TeaModel {
    /**
     * <p>The anti-ransomware client information.</p>
     */
    @NameInMap("Clients")
    public java.util.List<DescribeBackupClientsResponseBodyClients> clients;

    /**
     * <p>The request ID. Alibaba Cloud generates a unique identifier for each API request. You can use the request ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>E3ED094C-9EB7-4239-962B-D0FB3D5F23C7</p>
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
         * <p>The anti-ransomware client ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c-000az2f537r73dyh****</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The status of the anti-ransomware client.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><strong>INSTALLING</strong>: The client is being installed.</p>
         * </li>
         * <li><p><strong>ONLINE</strong>: The client is online.</p>
         * </li>
         * <li><p><strong>UNINSTALLING</strong>: The client is being uninstalled.</p>
         * </li>
         * <li><p><strong>NOT_INSTALLED</strong>: The client is not installed.</p>
         * </li>
         * <li><p><strong>ACTIVATED</strong>: The client is activated.</p>
         * </li>
         * <li><p><strong>CLIENT_CONNECTION_ERROR</strong>: A client connection error occurred.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        @NameInMap("ClientStatus")
        public String clientStatus;

        /**
         * <p>The version number of the anti-ransomware client.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0.0</p>
         */
        @NameInMap("ClientVersion")
        public String clientVersion;

        /**
         * <p>The instance ID of the ECS instance that has the anti-ransomware client installed.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp15hyph4aci99dv****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The UUID of the ECS instance that has the anti-ransomware client installed.</p>
         * 
         * <strong>example:</strong>
         * <p>22f6550d-f294-449b-b6e6-90638fd1****</p>
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
