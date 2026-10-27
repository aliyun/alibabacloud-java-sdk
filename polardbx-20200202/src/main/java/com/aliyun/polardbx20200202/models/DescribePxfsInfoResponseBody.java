// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribePxfsInfoResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DescribePxfsInfoResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public DescribePxfsInfoResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePxfsInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePxfsInfoResponseBody self = new DescribePxfsInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePxfsInfoResponseBody setAccessDeniedDetail(DescribePxfsInfoResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribePxfsInfoResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribePxfsInfoResponseBody setData(DescribePxfsInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribePxfsInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribePxfsInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePxfsInfoResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The authorization action. Same as described above.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>The display name of the authentication principal.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>The owner ID of the authentication principal.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>The authorization action. Same as described above.</p>
         * 
         * <strong>example:</strong>
         * <p>222</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <p>The encoded diagnostic message.</p>
         * 
         * <strong>example:</strong>
         * <p>AQEAAAAAaKPfwjY0MzMyODRGLUZCQkQtNTA1RS04MUUxLTc5NTkzODk2MUIzMg==</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>The type of missing permission.</p>
         * 
         * <strong>example:</strong>
         * <p>ImplicitDeny</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <p>The policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>PRIORITY</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static DescribePxfsInfoResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribePxfsInfoResponseBodyAccessDeniedDetail self = new DescribePxfsInfoResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribePxfsInfoResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribePxfsInfoResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribePxfsInfoResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribePxfsInfoResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribePxfsInfoResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribePxfsInfoResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribePxfsInfoResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DescribePxfsInfoResponseBodyDataInstanceConnAddrs extends TeaModel {
        /**
         * <p>The connection string.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-files.example.com:12049</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-files.example.com</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The port number.</p>
         * 
         * <strong>example:</strong>
         * <p>12049</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The access protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>NFS</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>Indicates whether TLS is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TlsEnabled")
        public Boolean tlsEnabled;

        /**
         * <p>The transport protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>TLS</p>
         */
        @NameInMap("Transport")
        public String transport;

        /**
         * <p>The connection type.</p>
         * 
         * <strong>example:</strong>
         * <p>Intranet</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The virtual private cloud (VPC) ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxxxxxxx</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-xxxxxxxx</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribePxfsInfoResponseBodyDataInstanceConnAddrs build(java.util.Map<String, ?> map) throws Exception {
            DescribePxfsInfoResponseBodyDataInstanceConnAddrs self = new DescribePxfsInfoResponseBodyDataInstanceConnAddrs();
            return TeaModel.build(map, self);
        }

        public DescribePxfsInfoResponseBodyDataInstanceConnAddrs setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribePxfsInfoResponseBodyDataInstanceConnAddrs setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public DescribePxfsInfoResponseBodyDataInstanceConnAddrs setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribePxfsInfoResponseBodyDataInstanceConnAddrs setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribePxfsInfoResponseBodyDataInstanceConnAddrs setTlsEnabled(Boolean tlsEnabled) {
            this.tlsEnabled = tlsEnabled;
            return this;
        }
        public Boolean getTlsEnabled() {
            return this.tlsEnabled;
        }

        public DescribePxfsInfoResponseBodyDataInstanceConnAddrs setTransport(String transport) {
            this.transport = transport;
            return this;
        }
        public String getTransport() {
            return this.transport;
        }

        public DescribePxfsInfoResponseBodyDataInstanceConnAddrs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribePxfsInfoResponseBodyDataInstanceConnAddrs setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribePxfsInfoResponseBodyDataInstanceConnAddrs setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribePxfsInfoResponseBodyDataInstance extends TeaModel {
        /**
         * <p>The node specification.</p>
         * 
         * <strong>example:</strong>
         * <p>polarx.pxfs.x4.xlarge</p>
         */
        @NameInMap("ClassCode")
        public String classCode;

        /**
         * <p>The list of connection addresses.</p>
         */
        @NameInMap("ConnAddrs")
        public java.util.List<DescribePxfsInfoResponseBodyDataInstanceConnAddrs> connAddrs;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-03T12:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The PolarDB-X instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-xxxxxxxx</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>The associated instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-xxxxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("NodeCount")
        public Integer nodeCount;

        /**
         * <p>The Agent file service instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pxfs-xxxxxxxx</p>
         */
        @NameInMap("PxfsInstanceId")
        public String pxfsInstanceId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The storage size.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("StorageSize")
        public Long storageSize;

        /**
         * <p>The storage type.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The virtual private cloud (VPC) ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxxxxxxx</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-xxxxxxxx</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The current version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribePxfsInfoResponseBodyDataInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribePxfsInfoResponseBodyDataInstance self = new DescribePxfsInfoResponseBodyDataInstance();
            return TeaModel.build(map, self);
        }

        public DescribePxfsInfoResponseBodyDataInstance setClassCode(String classCode) {
            this.classCode = classCode;
            return this;
        }
        public String getClassCode() {
            return this.classCode;
        }

        public DescribePxfsInfoResponseBodyDataInstance setConnAddrs(java.util.List<DescribePxfsInfoResponseBodyDataInstanceConnAddrs> connAddrs) {
            this.connAddrs = connAddrs;
            return this;
        }
        public java.util.List<DescribePxfsInfoResponseBodyDataInstanceConnAddrs> getConnAddrs() {
            return this.connAddrs;
        }

        public DescribePxfsInfoResponseBodyDataInstance setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribePxfsInfoResponseBodyDataInstance setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribePxfsInfoResponseBodyDataInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribePxfsInfoResponseBodyDataInstance setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public DescribePxfsInfoResponseBodyDataInstance setPxfsInstanceId(String pxfsInstanceId) {
            this.pxfsInstanceId = pxfsInstanceId;
            return this;
        }
        public String getPxfsInstanceId() {
            return this.pxfsInstanceId;
        }

        public DescribePxfsInfoResponseBodyDataInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribePxfsInfoResponseBodyDataInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribePxfsInfoResponseBodyDataInstance setStorageSize(Long storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Long getStorageSize() {
            return this.storageSize;
        }

        public DescribePxfsInfoResponseBodyDataInstance setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribePxfsInfoResponseBodyDataInstance setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribePxfsInfoResponseBodyDataInstance setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribePxfsInfoResponseBodyDataInstance setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribePxfsInfoResponseBodyDataInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribePxfsInfoResponseBodyData extends TeaModel {
        /**
         * <p>The instance information.</p>
         */
        @NameInMap("Instance")
        public DescribePxfsInfoResponseBodyDataInstance instance;

        public static DescribePxfsInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePxfsInfoResponseBodyData self = new DescribePxfsInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePxfsInfoResponseBodyData setInstance(DescribePxfsInfoResponseBodyDataInstance instance) {
            this.instance = instance;
            return this;
        }
        public DescribePxfsInfoResponseBodyDataInstance getInstance() {
            return this.instance;
        }

    }

}
