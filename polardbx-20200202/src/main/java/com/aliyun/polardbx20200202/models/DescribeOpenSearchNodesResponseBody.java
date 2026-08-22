// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeOpenSearchNodesResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DescribeOpenSearchNodesResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The data struct.</p>
     */
    @NameInMap("Data")
    public DescribeOpenSearchNodesResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>AE4F6C34-065F-45AA-B5DC-4B8D816F6305</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOpenSearchNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenSearchNodesResponseBody self = new DescribeOpenSearchNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOpenSearchNodesResponseBody setAccessDeniedDetail(DescribeOpenSearchNodesResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribeOpenSearchNodesResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeOpenSearchNodesResponseBody setData(DescribeOpenSearchNodesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeOpenSearchNodesResponseBodyData getData() {
        return this.data;
    }

    public DescribeOpenSearchNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOpenSearchNodesResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The authentication action.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>The identity used for authentication in the request.</p>
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
         * <p>The type of the authentication principal.</p>
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
         * <p>The type of the permission denial.</p>
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

        public static DescribeOpenSearchNodesResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpenSearchNodesResponseBodyAccessDeniedDetail self = new DescribeOpenSearchNodesResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribeOpenSearchNodesResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribeOpenSearchNodesResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribeOpenSearchNodesResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribeOpenSearchNodesResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribeOpenSearchNodesResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribeOpenSearchNodesResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribeOpenSearchNodesResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DescribeOpenSearchNodesResponseBodyDataResult extends TeaModel {
        /**
         * <p>The number of CPU cores of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CpuCores")
        public Integer cpuCores;

        /**
         * <p>The CPU usage (%).</p>
         * 
         * <strong>example:</strong>
         * <p>35.6</p>
         */
        @NameInMap("CpuPercent")
        public String cpuPercent;

        /**
         * <p>The total disk capacity of the node, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("DiskSizeGB")
        public Integer diskSizeGB;

        /**
         * <p>The disk space usage of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>42.5</p>
         */
        @NameInMap("DiskUsedPercent")
        public String diskUsedPercent;

        /**
         * <p>The total number of unresolved baseline check items.</p>
         * 
         * <strong>example:</strong>
         * <p>GREEN</p>
         */
        @NameInMap("Health")
        public String health;

        /**
         * <p>The JVM heap memory usage of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>38.2</p>
         */
        @NameInMap("HeapPercent")
        public String heapPercent;

        /**
         * <p>The IP address and port of the session host that initiated the session.</p>
         * 
         * <strong>example:</strong>
         * <p>100.115.107.0/24</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The name of the host on which the node instance runs. You can log on to the host and run the <code>hostname</code> command to view the hostname.</p>
         * 
         * <strong>example:</strong>
         * <p>hb2h-ali-oceanbase-public-online-013</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The average system load of the node over the last 1 minute.</p>
         * 
         * <strong>example:</strong>
         * <p>1.25</p>
         */
        @NameInMap("LoadOneM")
        public String loadOneM;

        /**
         * <p>The amount of memory used.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("MemoryGB")
        public Integer memoryGB;

        /**
         * <p>The node type to query. Valid values:</p>
         * <ul>
         * <li>all: queries both dn and gms nodes.</li>
         * <li>gms: queries only gms nodes.</li>
         * <li>dn: queries only dn nodes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dn</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The port.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-i</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeOpenSearchNodesResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpenSearchNodesResponseBodyDataResult self = new DescribeOpenSearchNodesResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public DescribeOpenSearchNodesResponseBodyDataResult setCpuCores(Integer cpuCores) {
            this.cpuCores = cpuCores;
            return this;
        }
        public Integer getCpuCores() {
            return this.cpuCores;
        }

        public DescribeOpenSearchNodesResponseBodyDataResult setCpuPercent(String cpuPercent) {
            this.cpuPercent = cpuPercent;
            return this;
        }
        public String getCpuPercent() {
            return this.cpuPercent;
        }

        public DescribeOpenSearchNodesResponseBodyDataResult setDiskSizeGB(Integer diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
            return this;
        }
        public Integer getDiskSizeGB() {
            return this.diskSizeGB;
        }

        public DescribeOpenSearchNodesResponseBodyDataResult setDiskUsedPercent(String diskUsedPercent) {
            this.diskUsedPercent = diskUsedPercent;
            return this;
        }
        public String getDiskUsedPercent() {
            return this.diskUsedPercent;
        }

        public DescribeOpenSearchNodesResponseBodyDataResult setHealth(String health) {
            this.health = health;
            return this;
        }
        public String getHealth() {
            return this.health;
        }

        public DescribeOpenSearchNodesResponseBodyDataResult setHeapPercent(String heapPercent) {
            this.heapPercent = heapPercent;
            return this;
        }
        public String getHeapPercent() {
            return this.heapPercent;
        }

        public DescribeOpenSearchNodesResponseBodyDataResult setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeOpenSearchNodesResponseBodyDataResult setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeOpenSearchNodesResponseBodyDataResult setLoadOneM(String loadOneM) {
            this.loadOneM = loadOneM;
            return this;
        }
        public String getLoadOneM() {
            return this.loadOneM;
        }

        public DescribeOpenSearchNodesResponseBodyDataResult setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

        public DescribeOpenSearchNodesResponseBodyDataResult setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public DescribeOpenSearchNodesResponseBodyDataResult setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeOpenSearchNodesResponseBodyDataResult setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeOpenSearchNodesResponseBodyData extends TeaModel {
        /**
         * <p>The query result object.</p>
         */
        @NameInMap("Result")
        public java.util.List<DescribeOpenSearchNodesResponseBodyDataResult> result;

        public static DescribeOpenSearchNodesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpenSearchNodesResponseBodyData self = new DescribeOpenSearchNodesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeOpenSearchNodesResponseBodyData setResult(java.util.List<DescribeOpenSearchNodesResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<DescribeOpenSearchNodesResponseBodyDataResult> getResult() {
            return this.result;
        }

    }

}
