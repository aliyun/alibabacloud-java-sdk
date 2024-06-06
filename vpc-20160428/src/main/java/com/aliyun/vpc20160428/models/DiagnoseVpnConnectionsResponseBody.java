// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DiagnoseVpnConnectionsResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The diagnostic information.</p>
     */
    @NameInMap("VpnConnections")
    public java.util.List<DiagnoseVpnConnectionsResponseBodyVpnConnections> vpnConnections;

    public static DiagnoseVpnConnectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DiagnoseVpnConnectionsResponseBody self = new DiagnoseVpnConnectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DiagnoseVpnConnectionsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DiagnoseVpnConnectionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DiagnoseVpnConnectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DiagnoseVpnConnectionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DiagnoseVpnConnectionsResponseBody setVpnConnections(java.util.List<DiagnoseVpnConnectionsResponseBodyVpnConnections> vpnConnections) {
        this.vpnConnections = vpnConnections;
        return this;
    }
    public java.util.List<DiagnoseVpnConnectionsResponseBodyVpnConnections> getVpnConnections() {
        return this.vpnConnections;
    }

    public static class DiagnoseVpnConnectionsResponseBodyVpnConnections extends TeaModel {
        /**
         * <p>The cause of the error.</p>
         */
        @NameInMap("FailedReason")
        public String failedReason;

        /**
         * <p>The error code.</p>
         */
        @NameInMap("FailedReasonCode")
        public String failedReasonCode;

        /**
         * <p>The timestamp when the current error occurred on the IPsec-VPN connection. Unit: millisecond.</p>
         * <br>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("FailedTime")
        public Long failedTime;

        /**
         * <p>If the values of the parameters configured for the IPsec-VPN connection and the peer gateway device do not match, this parameter indicates the value of the parameters configured for the IPsec-VPN connection.</p>
         */
        @NameInMap("MismatchLocalParam")
        public String mismatchLocalParam;

        /**
         * <p>If the parameter values configured for the IPsec-VPN connection and the peer gateway device do not match, this parameter indicates the value of the parameter configured for the peer gateway device.</p>
         */
        @NameInMap("MismatchRemoteParam")
        public String mismatchRemoteParam;

        /**
         * <p>The error level. Valid values:</p>
         * <br>
         * <p>*   **Critical**</p>
         * <p>*   **Warn**</p>
         * <p>*   **Normal**</p>
         */
        @NameInMap("Severity")
        public String severity;

        /**
         * <p>The log information about the error.</p>
         */
        @NameInMap("SourceLog")
        public String sourceLog;

        /**
         * <p>The tunnel ID.</p>
         */
        @NameInMap("TunnelId")
        public String tunnelId;

        /**
         * <p>The ID of the IPsec-VPN connection.</p>
         */
        @NameInMap("VpnConnectionId")
        public String vpnConnectionId;

        public static DiagnoseVpnConnectionsResponseBodyVpnConnections build(java.util.Map<String, ?> map) throws Exception {
            DiagnoseVpnConnectionsResponseBodyVpnConnections self = new DiagnoseVpnConnectionsResponseBodyVpnConnections();
            return TeaModel.build(map, self);
        }

        public DiagnoseVpnConnectionsResponseBodyVpnConnections setFailedReason(String failedReason) {
            this.failedReason = failedReason;
            return this;
        }
        public String getFailedReason() {
            return this.failedReason;
        }

        public DiagnoseVpnConnectionsResponseBodyVpnConnections setFailedReasonCode(String failedReasonCode) {
            this.failedReasonCode = failedReasonCode;
            return this;
        }
        public String getFailedReasonCode() {
            return this.failedReasonCode;
        }

        public DiagnoseVpnConnectionsResponseBodyVpnConnections setFailedTime(Long failedTime) {
            this.failedTime = failedTime;
            return this;
        }
        public Long getFailedTime() {
            return this.failedTime;
        }

        public DiagnoseVpnConnectionsResponseBodyVpnConnections setMismatchLocalParam(String mismatchLocalParam) {
            this.mismatchLocalParam = mismatchLocalParam;
            return this;
        }
        public String getMismatchLocalParam() {
            return this.mismatchLocalParam;
        }

        public DiagnoseVpnConnectionsResponseBodyVpnConnections setMismatchRemoteParam(String mismatchRemoteParam) {
            this.mismatchRemoteParam = mismatchRemoteParam;
            return this;
        }
        public String getMismatchRemoteParam() {
            return this.mismatchRemoteParam;
        }

        public DiagnoseVpnConnectionsResponseBodyVpnConnections setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public DiagnoseVpnConnectionsResponseBodyVpnConnections setSourceLog(String sourceLog) {
            this.sourceLog = sourceLog;
            return this;
        }
        public String getSourceLog() {
            return this.sourceLog;
        }

        public DiagnoseVpnConnectionsResponseBodyVpnConnections setTunnelId(String tunnelId) {
            this.tunnelId = tunnelId;
            return this;
        }
        public String getTunnelId() {
            return this.tunnelId;
        }

        public DiagnoseVpnConnectionsResponseBodyVpnConnections setVpnConnectionId(String vpnConnectionId) {
            this.vpnConnectionId = vpnConnectionId;
            return this;
        }
        public String getVpnConnectionId() {
            return this.vpnConnectionId;
        }

    }

}
