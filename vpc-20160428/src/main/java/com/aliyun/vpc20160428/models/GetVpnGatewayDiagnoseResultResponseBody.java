// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetVpnGatewayDiagnoseResultResponseBody extends TeaModel {
    /**
     * <p>The time when the diagnostic started.</p>
     * <br>
     * <p>The time follows the ISO8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time is displayed in UTC.</p>
     */
    @NameInMap("BeginTime")
    public String beginTime;

    /**
     * <p>The ID of the diagnostic.</p>
     */
    @NameInMap("DiagnoseId")
    public String diagnoseId;

    /**
     * <p>The information about the diagnostic items.</p>
     */
    @NameInMap("DiagnoseResult")
    public java.util.List<GetVpnGatewayDiagnoseResultResponseBodyDiagnoseResult> diagnoseResult;

    /**
     * <p>The timestamp when the system finishes diagnosing the item.</p>
     * <br>
     * <p>The time follows the ISO8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time is displayed in UTC.</p>
     */
    @NameInMap("FinishTime")
    public String finishTime;

    /**
     * <p>The number of diagnostic items that have been diagnosed.</p>
     */
    @NameInMap("FinishedCount")
    public Integer finishedCount;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource that is diagnosed.</p>
     */
    @NameInMap("ResourceInstanceId")
    public String resourceInstanceId;

    /**
     * <p>The type of the resource.</p>
     * <br>
     * <p>The value is set to **IPsec**, which indicates an IPsec-VPN connection.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The total number of diagnostic items.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The ID of the VPN gateway.</p>
     */
    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    public static GetVpnGatewayDiagnoseResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVpnGatewayDiagnoseResultResponseBody self = new GetVpnGatewayDiagnoseResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVpnGatewayDiagnoseResultResponseBody setBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public String getBeginTime() {
        return this.beginTime;
    }

    public GetVpnGatewayDiagnoseResultResponseBody setDiagnoseId(String diagnoseId) {
        this.diagnoseId = diagnoseId;
        return this;
    }
    public String getDiagnoseId() {
        return this.diagnoseId;
    }

    public GetVpnGatewayDiagnoseResultResponseBody setDiagnoseResult(java.util.List<GetVpnGatewayDiagnoseResultResponseBodyDiagnoseResult> diagnoseResult) {
        this.diagnoseResult = diagnoseResult;
        return this;
    }
    public java.util.List<GetVpnGatewayDiagnoseResultResponseBodyDiagnoseResult> getDiagnoseResult() {
        return this.diagnoseResult;
    }

    public GetVpnGatewayDiagnoseResultResponseBody setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public String getFinishTime() {
        return this.finishTime;
    }

    public GetVpnGatewayDiagnoseResultResponseBody setFinishedCount(Integer finishedCount) {
        this.finishedCount = finishedCount;
        return this;
    }
    public Integer getFinishedCount() {
        return this.finishedCount;
    }

    public GetVpnGatewayDiagnoseResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVpnGatewayDiagnoseResultResponseBody setResourceInstanceId(String resourceInstanceId) {
        this.resourceInstanceId = resourceInstanceId;
        return this;
    }
    public String getResourceInstanceId() {
        return this.resourceInstanceId;
    }

    public GetVpnGatewayDiagnoseResultResponseBody setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetVpnGatewayDiagnoseResultResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public GetVpnGatewayDiagnoseResultResponseBody setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public static class GetVpnGatewayDiagnoseResultResponseBodyDiagnoseResult extends TeaModel {
        /**
         * <p>The diagnostic item.</p>
         * <br>
         * <p>*   **RouteEntryConflict**: route conflicts.</p>
         * <p>*   **VpnRouteQuota**: the quota of destination-based routes for the VPN gateway.</p>
         * <p>*   **VpnIPsecQuota**: the quota of IPsec-VPN connections for the VPN gateway.</p>
         * <p>*   **VpnPbrRouteQuota**: the quota of policy-based routes for the VPN gateway.</p>
         * <p>*   **VcoConfigConsistency**: the consistency of the IPsec-VPN connection.</p>
         * <p>*   **VcoUserInternetIpConnectivity**: Internet connectivity of the customer gateway.</p>
         * <p>*   **VcoPrivateConnectivity**: private network connectivity.</p>
         * <br>
         * <p>For more information about the diagnostic items, see [Background information about quick diagnostics](~~190330~~).</p>
         */
        @NameInMap("DiagnoseName")
        public String diagnoseName;

        /**
         * <p>The diagnostic result.</p>
         * <br>
         * <p>The system returns different results for each diagnostic item.</p>
         * <br>
         * <p>*   **RouteEntryConflict**: information about route conflicts.</p>
         * <br>
         * <p>*   **VpnRouteQuota**:</p>
         * <br>
         * <p>    *   **quotaName**: the quota ID of destination-based routes.</p>
         * <p>    *   **quantity**: the quota of destination-based routes for the VPN gateway.</p>
         * <p>    *   **used**: the number of destination-based routes created for the VPN gateway.</p>
         * <br>
         * <p>*   **VpnIPsecQuota**:</p>
         * <br>
         * <p>    *   **quotaName**: the quota ID of IPsec-VPN connections.</p>
         * <p>    *   **quantity**: the quota of IPsec-VPN connections for the VPN gateway.</p>
         * <p>    *   **used**: the number of IPsec-VPN connections created for the VPN gateway.</p>
         * <br>
         * <p>*   **VpnPbrRouteQuota**:</p>
         * <br>
         * <p>    *   **quotaName**: the quota ID of policy-based routes.</p>
         * <p>    *   **quantity**: the quota of policy-based routes for the VPN gateway.</p>
         * <p>    *   **used**: the number of policy-based routes created for the VPN gateway.</p>
         * <br>
         * <p>*   **VcoConfigConsistency**:</p>
         * <br>
         * <p>    *   **vcoLackConf**: The system cannot obtain the configuration of the peer of the IPsec-VPN connection.</p>
         * <p>    *   **vcoRunningConf**: the configurations that have been added to the peer of the IPsec-VPN connection.</p>
         * <p>    *   **vcoDiffConf**: the configurations that are inconsistent between the local end and the peer.</p>
         * <p>    *   **vcoConf**: the configurations that have been added to the local end.</p>
         * <br>
         * <p>*   **VcoUserInternetIpConnectivity**:</p>
         * <br>
         * <p>    *   **targetIp**: the public IP address of the customer gateway.</p>
         * <p>    *   **rtt**: the latency when the system accesses the public IP address of the customer gateway. Unit: milliseconds.</p>
         * <p>    *   **lossRate**: the packet loss when the system accesses the public IP address of the customer gateway.</p>
         * <br>
         * <p>*   **VcoPrivateConnectivity**:</p>
         * <br>
         * <p>    *   **targetIp**: the source IP address.</p>
         * <p>    *   **srcIp**: the destination IP address.</p>
         * <p>    *   **rtt**: the latency when the source IP address accesses the destination IP address. Unit: milliseconds.</p>
         * <p>    *   **lossRate**: the packet loss when the source IP address accesses the destination IP address.</p>
         */
        @NameInMap("DiagnoseResultDescription")
        public String diagnoseResultDescription;

        /**
         * <p>The diagnostic result level.</p>
         * <br>
         * <p>*   **normal**</p>
         * <p>*   **warning**</p>
         * <p>*   **error**</p>
         * <br>
         * <p>For more information, see [Background information about quick diagnostics](~~190330~~).</p>
         */
        @NameInMap("DiagnoseResultLevel")
        public String diagnoseResultLevel;

        public static GetVpnGatewayDiagnoseResultResponseBodyDiagnoseResult build(java.util.Map<String, ?> map) throws Exception {
            GetVpnGatewayDiagnoseResultResponseBodyDiagnoseResult self = new GetVpnGatewayDiagnoseResultResponseBodyDiagnoseResult();
            return TeaModel.build(map, self);
        }

        public GetVpnGatewayDiagnoseResultResponseBodyDiagnoseResult setDiagnoseName(String diagnoseName) {
            this.diagnoseName = diagnoseName;
            return this;
        }
        public String getDiagnoseName() {
            return this.diagnoseName;
        }

        public GetVpnGatewayDiagnoseResultResponseBodyDiagnoseResult setDiagnoseResultDescription(String diagnoseResultDescription) {
            this.diagnoseResultDescription = diagnoseResultDescription;
            return this;
        }
        public String getDiagnoseResultDescription() {
            return this.diagnoseResultDescription;
        }

        public GetVpnGatewayDiagnoseResultResponseBodyDiagnoseResult setDiagnoseResultLevel(String diagnoseResultLevel) {
            this.diagnoseResultLevel = diagnoseResultLevel;
            return this;
        }
        public String getDiagnoseResultLevel() {
            return this.diagnoseResultLevel;
        }

    }

}
