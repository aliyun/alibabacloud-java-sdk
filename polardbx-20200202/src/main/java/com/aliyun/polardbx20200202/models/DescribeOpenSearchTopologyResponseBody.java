// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeOpenSearchTopologyResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public DescribeOpenSearchTopologyResponseBodyAccessDeniedDetail accessDeniedDetail;

    @NameInMap("Data")
    public DescribeOpenSearchTopologyResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>9B2F3840-5C98-475C-B269-2D5C3A31797C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOpenSearchTopologyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenSearchTopologyResponseBody self = new DescribeOpenSearchTopologyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOpenSearchTopologyResponseBody setAccessDeniedDetail(DescribeOpenSearchTopologyResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribeOpenSearchTopologyResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeOpenSearchTopologyResponseBody setData(DescribeOpenSearchTopologyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeOpenSearchTopologyResponseBodyData getData() {
        return this.data;
    }

    public DescribeOpenSearchTopologyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOpenSearchTopologyResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <strong>example:</strong>
         * <p>222</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <strong>example:</strong>
         * <p>AQEAAAAAaKPfwjY0MzMyODRGLUZCQkQtNTA1RS04MUUxLTc5NTkzODk2MUIzMg==</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <strong>example:</strong>
         * <p>ImplicitDeny</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <strong>example:</strong>
         * <p>PRIORITY</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static DescribeOpenSearchTopologyResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpenSearchTopologyResponseBodyAccessDeniedDetail self = new DescribeOpenSearchTopologyResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribeOpenSearchTopologyResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribeOpenSearchTopologyResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribeOpenSearchTopologyResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribeOpenSearchTopologyResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribeOpenSearchTopologyResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribeOpenSearchTopologyResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribeOpenSearchTopologyResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DescribeOpenSearchTopologyResponseBodyDataNodes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>t1222576965886205</p>
         */
        @NameInMap("AvailabilityZone")
        public String availabilityZone;

        /**
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <strong>example:</strong>
         * <p><a href="https://secnet-defense-vastip.oss-cn-hangzhou.aliyuncs.com">https://secnet-defense-vastip.oss-cn-hangzhou.aliyuncs.com</a></p>
         */
        @NameInMap("Host")
        public String host;

        @NameInMap("IsLeader")
        public Boolean isLeader;

        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("MemoryGB")
        public Integer memoryGB;

        /**
         * <strong>example:</strong>
         * <p>pxc-c-jf0pivh2dt</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <strong>example:</strong>
         * <p>polarx_cn</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeOpenSearchTopologyResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpenSearchTopologyResponseBodyDataNodes self = new DescribeOpenSearchTopologyResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public DescribeOpenSearchTopologyResponseBodyDataNodes setAvailabilityZone(String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public String getAvailabilityZone() {
            return this.availabilityZone;
        }

        public DescribeOpenSearchTopologyResponseBodyDataNodes setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeOpenSearchTopologyResponseBodyDataNodes setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeOpenSearchTopologyResponseBodyDataNodes setIsLeader(Boolean isLeader) {
            this.isLeader = isLeader;
            return this;
        }
        public Boolean getIsLeader() {
            return this.isLeader;
        }

        public DescribeOpenSearchTopologyResponseBodyDataNodes setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

        public DescribeOpenSearchTopologyResponseBodyDataNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeOpenSearchTopologyResponseBodyDataNodes setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeOpenSearchTopologyResponseBodyDataNodes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeOpenSearchTopologyResponseBodyDataStorage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReplicaCount")
        public Integer replicaCount;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("StorageTotalGB")
        public Integer storageTotalGB;

        /**
         * <strong>example:</strong>
         * <p>cloud_auto</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        public static DescribeOpenSearchTopologyResponseBodyDataStorage build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpenSearchTopologyResponseBodyDataStorage self = new DescribeOpenSearchTopologyResponseBodyDataStorage();
            return TeaModel.build(map, self);
        }

        public DescribeOpenSearchTopologyResponseBodyDataStorage setReplicaCount(Integer replicaCount) {
            this.replicaCount = replicaCount;
            return this;
        }
        public Integer getReplicaCount() {
            return this.replicaCount;
        }

        public DescribeOpenSearchTopologyResponseBodyDataStorage setStorageTotalGB(Integer storageTotalGB) {
            this.storageTotalGB = storageTotalGB;
            return this;
        }
        public Integer getStorageTotalGB() {
            return this.storageTotalGB;
        }

        public DescribeOpenSearchTopologyResponseBodyDataStorage setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

    }

    public static class DescribeOpenSearchTopologyResponseBodyData extends TeaModel {
        @NameInMap("Nodes")
        public java.util.List<DescribeOpenSearchTopologyResponseBodyDataNodes> nodes;

        @NameInMap("Storage")
        public DescribeOpenSearchTopologyResponseBodyDataStorage storage;

        public static DescribeOpenSearchTopologyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpenSearchTopologyResponseBodyData self = new DescribeOpenSearchTopologyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeOpenSearchTopologyResponseBodyData setNodes(java.util.List<DescribeOpenSearchTopologyResponseBodyDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<DescribeOpenSearchTopologyResponseBodyDataNodes> getNodes() {
            return this.nodes;
        }

        public DescribeOpenSearchTopologyResponseBodyData setStorage(DescribeOpenSearchTopologyResponseBodyDataStorage storage) {
            this.storage = storage;
            return this;
        }
        public DescribeOpenSearchTopologyResponseBodyDataStorage getStorage() {
            return this.storage;
        }

    }

}
