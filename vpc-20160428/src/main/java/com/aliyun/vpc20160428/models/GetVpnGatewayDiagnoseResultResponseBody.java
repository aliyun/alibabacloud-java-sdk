// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetVpnGatewayDiagnoseResultResponseBody extends TeaModel {
    /**
     * <p>The time when the diagnostic started.</p>
     * <p>The time follows the ISO8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-12-15T05:28:57Z</p>
     */
    @NameInMap("BeginTime")
    public String beginTime;

    /**
     * <p>The ID of the diagnostic.</p>
     * 
     * <strong>example:</strong>
     * <p>vpndgn-uf6sgneym02lxyuv4****</p>
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
     * <p>The time follows the ISO8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-12-15T05:29:08Z</p>
     */
    @NameInMap("FinishTime")
    public String finishTime;

    /**
     * <p>The number of diagnostic items that have been diagnosed.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("FinishedCount")
    public Integer finishedCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>312C4D5A-6563-5FC6-8C6E-A43A5A316FEB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource that is diagnosed.</p>
     * 
     * <strong>example:</strong>
     * <p>vco-uf6huqsu63azl7mdp****</p>
     */
    @NameInMap("ResourceInstanceId")
    public String resourceInstanceId;

    /**
     * <p>The type of the resource.</p>
     * <p>The value is set to <strong>IPsec</strong>, which indicates an IPsec-VPN connection.</p>
     * 
     * <strong>example:</strong>
     * <p>IPsec</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The total number of diagnostic items.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The ID of the VPN gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>vpn-uf6fzwp0ck3frwtbk****</p>
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
         * <ul>
         * <li><strong>RouteEntryConflict</strong>: route conflicts.</li>
         * <li><strong>VpnRouteQuota</strong>: the quota of destination-based routes for the VPN gateway.</li>
         * <li><strong>VpnIPsecQuota</strong>: the quota of IPsec-VPN connections for the VPN gateway.</li>
         * <li><strong>VpnPbrRouteQuota</strong>: the quota of policy-based routes for the VPN gateway.</li>
         * <li><strong>VcoConfigConsistency</strong>: the consistency of the IPsec-VPN connection.</li>
         * <li><strong>VcoUserInternetIpConnectivity</strong>: Internet connectivity of the customer gateway.</li>
         * <li><strong>VcoPrivateConnectivity</strong>: private network connectivity.</li>
         * </ul>
         * <p>For more information about the diagnostic items, see <a href="https://help.aliyun.com/document_detail/190330.html">Background information about quick diagnostics</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>RouteEntryConflict</p>
         */
        @NameInMap("DiagnoseName")
        public String diagnoseName;

        /**
         * <p>The diagnostic result.</p>
         * <p>The system returns different results for each diagnostic item.</p>
         * <ul>
         * <li><p><strong>RouteEntryConflict</strong>: information about route conflicts.</p>
         * </li>
         * <li><p><strong>VpnRouteQuota</strong>:</p>
         * <ul>
         * <li><strong>quotaName</strong>: the quota ID of destination-based routes.</li>
         * <li><strong>quantity</strong>: the quota of destination-based routes for the VPN gateway.</li>
         * <li><strong>used</strong>: the number of destination-based routes created for the VPN gateway.</li>
         * </ul>
         * </li>
         * <li><p><strong>VpnIPsecQuota</strong>:</p>
         * <ul>
         * <li><strong>quotaName</strong>: the quota ID of IPsec-VPN connections.</li>
         * <li><strong>quantity</strong>: the quota of IPsec-VPN connections for the VPN gateway.</li>
         * <li><strong>used</strong>: the number of IPsec-VPN connections created for the VPN gateway.</li>
         * </ul>
         * </li>
         * <li><p><strong>VpnPbrRouteQuota</strong>:</p>
         * <ul>
         * <li><strong>quotaName</strong>: the quota ID of policy-based routes.</li>
         * <li><strong>quantity</strong>: the quota of policy-based routes for the VPN gateway.</li>
         * <li><strong>used</strong>: the number of policy-based routes created for the VPN gateway.</li>
         * </ul>
         * </li>
         * <li><p><strong>VcoConfigConsistency</strong>:</p>
         * <ul>
         * <li><strong>vcoLackConf</strong>: The system cannot obtain the configuration of the peer of the IPsec-VPN connection.</li>
         * <li><strong>vcoRunningConf</strong>: the configurations that have been added to the peer of the IPsec-VPN connection.</li>
         * <li><strong>vcoDiffConf</strong>: the configurations that are inconsistent between the local end and the peer.</li>
         * <li><strong>vcoConf</strong>: the configurations that have been added to the local end.</li>
         * </ul>
         * </li>
         * <li><p><strong>VcoUserInternetIpConnectivity</strong>:</p>
         * <ul>
         * <li><strong>targetIp</strong>: the public IP address of the customer gateway.</li>
         * <li><strong>rtt</strong>: the latency when the system accesses the public IP address of the customer gateway. Unit: milliseconds.</li>
         * <li><strong>lossRate</strong>: the packet loss when the system accesses the public IP address of the customer gateway.</li>
         * </ul>
         * </li>
         * <li><p><strong>VcoPrivateConnectivity</strong>:</p>
         * <ul>
         * <li><strong>targetIp</strong>: the source IP address.</li>
         * <li><strong>srcIp</strong>: the destination IP address.</li>
         * <li><strong>rtt</strong>: the latency when the source IP address accesses the destination IP address. Unit: milliseconds.</li>
         * <li><strong>lossRate</strong>: the packet loss when the source IP address accesses the destination IP address.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;targetIp\&quot;:\&quot;192.168.0.1\&quot;,\&quot;srcIp\&quot;:\&quot;192.168.1.1\&quot;,\&quot;rtt\&quot;:-1.0,\&quot;lossRate\&quot;:100.0}</p>
         */
        @NameInMap("DiagnoseResultDescription")
        public String diagnoseResultDescription;

        /**
         * <p>The diagnostic result level.</p>
         * <ul>
         * <li><strong>normal</strong></li>
         * <li><strong>warning</strong></li>
         * <li><strong>error</strong></li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/190330.html">Background information about quick diagnostics</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
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
