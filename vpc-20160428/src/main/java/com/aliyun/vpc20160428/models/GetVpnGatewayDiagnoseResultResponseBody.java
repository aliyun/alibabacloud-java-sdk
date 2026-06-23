// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetVpnGatewayDiagnoseResultResponseBody extends TeaModel {
    /**
     * <p>The time when the diagnostic started.</p>
     * <p>The time is displayed in UTC in the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-12-15T05:28:57Z</p>
     */
    @NameInMap("BeginTime")
    public String beginTime;

    /**
     * <p>The diagnostic ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpndgn-uf6sgneym02lxyuv4****</p>
     */
    @NameInMap("DiagnoseId")
    public String diagnoseId;

    /**
     * <p>The list of diagnostic items.</p>
     */
    @NameInMap("DiagnoseResult")
    public java.util.List<GetVpnGatewayDiagnoseResultResponseBodyDiagnoseResult> diagnoseResult;

    /**
     * <p>The time when the diagnostic ended.</p>
     * <p>The time is displayed in UTC in the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-12-15T05:29:08Z</p>
     */
    @NameInMap("FinishTime")
    public String finishTime;

    /**
     * <p>The number of diagnostic items that have been completed.</p>
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
     * <p>The ID of the diagnosed resource.</p>
     * 
     * <strong>example:</strong>
     * <p>vco-uf6huqsu63azl7mdp****</p>
     */
    @NameInMap("ResourceInstanceId")
    public String resourceInstanceId;

    /**
     * <p>The type of the diagnosed resource.</p>
     * <p>Valid values: <strong>IPsec</strong>, which indicates an IPsec-VPN connection.</p>
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
     * <p>The VPN gateway instance ID.</p>
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
         * <li><strong>RouteEntryConflict</strong>: route conflict.</li>
         * <li><strong>VpnRouteQuota</strong>: VPN gateway destination route quota.</li>
         * <li><strong>VpnIPsecQuota</strong>: VPN gateway IPsec-VPN connection quota.</li>
         * <li><strong>VpnPbrRouteQuota</strong>: VPN gateway policy-based route quota.</li>
         * <li><strong>VcoConfigConsistency</strong>: IPsec configuration consistency.</li>
         * <li><strong>VcoUserInternetIpConnectivity</strong>: public connectivity of the customer gateway.</li>
         * <li><strong>VcoPrivateConnectivity</strong>: private network connectivity.</li>
         * </ul>
         * <p>For more information about each diagnostic item, see <a href="https://help.aliyun.com/document_detail/190330.html">One-click diagnostics background information</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>RouteEntryConflict</p>
         */
        @NameInMap("DiagnoseName")
        public String diagnoseName;

        /**
         * <p>The diagnostic result of the diagnostic item.</p>
         * <p>The operation returns different information for each diagnostic item:</p>
         * <ul>
         * <li><strong>RouteEntryConflict</strong>: The system returns information about the route conflict.</li>
         * <li><strong>VpnRouteQuota</strong>:<ul>
         * <li><strong>quotaName</strong>: the ID of the destination route quota.</li>
         * <li><strong>quantity</strong>: the number of destination routes that the current VPN gateway instance supports.</li>
         * <li><strong>used</strong>: the number of destination routes that have been created for the current VPN gateway instance.</li>
         * </ul>
         * </li>
         * <li><strong>VpnIPsecQuota</strong>:<ul>
         * <li><strong>quotaName</strong>: the ID of the IPsec-VPN connection quota.</li>
         * <li><strong>quantity</strong>: the number of IPsec-VPN connections that the current VPN gateway instance supports.</li>
         * <li><strong>used</strong>: the number of IPsec-VPN connections that have been created for the current VPN gateway instance.</li>
         * </ul>
         * </li>
         * <li><strong>VpnPbrRouteQuota</strong>:<ul>
         * <li><strong>quotaName</strong>: the ID of the policy-based route quota.</li>
         * <li><strong>quantity</strong>: the number of policy-based routes that the current VPN gateway instance supports.</li>
         * <li><strong>used</strong>: the number of policy-based routes that have been created for the current VPN gateway instance.</li>
         * </ul>
         * </li>
         * <li><strong>VcoConfigConsistency</strong>:<ul>
         * <li><strong>vcoLackConf</strong>: the system cannot obtain the configuration of the peer end of the IPsec-VPN connection.</li>
         * <li><strong>vcoRunningConf</strong>: the configuration that has been added to the peer end of the IPsec-VPN connection.</li>
         * <li><strong>vcoDiffConf</strong>: the list of configurations that are inconsistent between the local end and the peer end of the IPsec-VPN connection.</li>
         * <li><strong>vcoConf</strong>: the configuration that has been added to the local end of the IPsec-VPN connection.</li>
         * </ul>
         * </li>
         * <li><strong>VcoUserInternetIpConnectivity</strong>:<ul>
         * <li><strong>targetIp</strong>: the public IP address of the customer gateway.</li>
         * <li><strong>rtt</strong>: the latency when the system accesses the public IP address of the customer gateway. Unit: ms.</li>
         * <li><strong>lossRate</strong>: the packet loss rate when the system accesses the public IP address of the customer gateway.</li>
         * </ul>
         * </li>
         * <li><strong>VcoPrivateConnectivity</strong>:<ul>
         * <li><strong>targetIp</strong>: the source IP address.</li>
         * <li><strong>srcIp</strong>: the destination IP address.</li>
         * <li><strong>rtt</strong>: the latency when the source IP address accesses the destination IP address. Unit: ms.</li>
         * <li><strong>lossRate</strong>: the packet loss rate when the source IP address accesses the destination IP address.</li>
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
         * <p>The diagnostic result level of the diagnostic item.</p>
         * <ul>
         * <li><strong>normal</strong>: Normal.</li>
         * <li><strong>warning</strong>: Warning.</li>
         * <li><strong>error</strong>: Error.</li>
         * </ul>
         * <p>For more information about the diagnostic result levels of each diagnostic item, see <a href="https://help.aliyun.com/document_detail/190330.html">One-click diagnostics background information</a>.</p>
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
