// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpnGatewayAttributeResponseBody extends TeaModel {
    /**
     * <p>Indicates whether BGP routes are automatically advertised to the VPC. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("AutoPropagate")
    public Boolean autoPropagate;

    /**
     * <p>The payment status of the VPN gateway. Valid values:</p>
     * <br>
     * <p>*   **Normal**</p>
     * <p>*   **FinancialLocked**</p>
     */
    @NameInMap("BusinessStatus")
    public String businessStatus;

    /**
     * <p>The time when the VPN gateway was created. Unit: milliseconds.</p>
     * <br>
     * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The description of the VPN gateway.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The second IP address assigned by the system to create an IPsec-VPN connection.</p>
     * <br>
     * <p>This parameter is returned only when the VPN gateway supports the dual-tunnel mode.</p>
     */
    @NameInMap("DisasterRecoveryInternetIp")
    public String disasterRecoveryInternetIp;

    /**
     * <p>The ID of the second vSwitch associated with the VPN gateway.</p>
     * <br>
     * <p>This parameter is returned only when the VPN gateway supports the dual-tunnel mode.</p>
     */
    @NameInMap("DisasterRecoveryVSwitchId")
    public String disasterRecoveryVSwitchId;

    /**
     * <p>Indicates whether BGP is enabled for the VPN gateway. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("EnableBgp")
    public Boolean enableBgp;

    /**
     * <p>The time when the VPN gateway expires. Unit: milliseconds.</p>
     * <br>
     * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>*   If the VPN gateway supports IPsec-VPN connections in single-tunnel mode, the address is the IP address of the VPN gateway and can be used to create an IPsec-VPN connection or an SSL-VPN connection.</p>
     * <br>
     * <p>*   If the VPN gateway supports IPsec-VPN connections in dual-tunnel mode, the address is the first IP address used to create an IPsec-VPN connection. The address cannot be used to create an SSL-VPN connection.</p>
     * <br>
     * <p>    If the VPN gateway supports IPsec-VPN connections in dual-tunnel mode, the system assigns two IP addresses to the VPN gateway to create two encrypted tunnels.</p>
     */
    @NameInMap("InternetIp")
    public String internetIp;

    /**
     * <p>The IP address of the VPN gateway.</p>
     * <br>
     * <p>This parameter is returned only when the VPN gateway is a private VPN gateway and supports only the single-tunnel mode.</p>
     */
    @NameInMap("IntranetIp")
    public String intranetIp;

    /**
     * <p>The name of the VPN gateway.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>VPN网关实例所属的资源组ID。</p>
     * <br>
     * <p>您可以调用[ListResourceGroups](https://help.aliyun.com/document_detail/158855.html)接口查询资源组信息。</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The maximum bandwidth of the VPN gateway. Unit: Mbit/s.</p>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <p>The IP address of the SSL-VPN connection.</p>
     * <br>
     * <p>This parameter is returned only when the VPN gateway is a public VPN gateway and supports only the single-tunnel mode. In addition, the VPN gateway must have the SSL-VPN feature enabled.</p>
     */
    @NameInMap("SslVpnInternetIp")
    public String sslVpnInternetIp;

    /**
     * <p>The status of the VPN gateway. Valid values:</p>
     * <br>
     * <p>*   **init**</p>
     * <p>*   **provisioning**</p>
     * <p>*   **active**</p>
     * <p>*   **updating**</p>
     * <p>*   **deleting**</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the vSwitch associated with the VPN gateway.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC to which the VPN gateway belongs.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The ID of the VPN gateway.</p>
     */
    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    public static ModifyVpnGatewayAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpnGatewayAttributeResponseBody self = new ModifyVpnGatewayAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVpnGatewayAttributeResponseBody setAutoPropagate(Boolean autoPropagate) {
        this.autoPropagate = autoPropagate;
        return this;
    }
    public Boolean getAutoPropagate() {
        return this.autoPropagate;
    }

    public ModifyVpnGatewayAttributeResponseBody setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
        return this;
    }
    public String getBusinessStatus() {
        return this.businessStatus;
    }

    public ModifyVpnGatewayAttributeResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ModifyVpnGatewayAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyVpnGatewayAttributeResponseBody setDisasterRecoveryInternetIp(String disasterRecoveryInternetIp) {
        this.disasterRecoveryInternetIp = disasterRecoveryInternetIp;
        return this;
    }
    public String getDisasterRecoveryInternetIp() {
        return this.disasterRecoveryInternetIp;
    }

    public ModifyVpnGatewayAttributeResponseBody setDisasterRecoveryVSwitchId(String disasterRecoveryVSwitchId) {
        this.disasterRecoveryVSwitchId = disasterRecoveryVSwitchId;
        return this;
    }
    public String getDisasterRecoveryVSwitchId() {
        return this.disasterRecoveryVSwitchId;
    }

    public ModifyVpnGatewayAttributeResponseBody setEnableBgp(Boolean enableBgp) {
        this.enableBgp = enableBgp;
        return this;
    }
    public Boolean getEnableBgp() {
        return this.enableBgp;
    }

    public ModifyVpnGatewayAttributeResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ModifyVpnGatewayAttributeResponseBody setInternetIp(String internetIp) {
        this.internetIp = internetIp;
        return this;
    }
    public String getInternetIp() {
        return this.internetIp;
    }

    public ModifyVpnGatewayAttributeResponseBody setIntranetIp(String intranetIp) {
        this.intranetIp = intranetIp;
        return this;
    }
    public String getIntranetIp() {
        return this.intranetIp;
    }

    public ModifyVpnGatewayAttributeResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyVpnGatewayAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyVpnGatewayAttributeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyVpnGatewayAttributeResponseBody setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public ModifyVpnGatewayAttributeResponseBody setSslVpnInternetIp(String sslVpnInternetIp) {
        this.sslVpnInternetIp = sslVpnInternetIp;
        return this;
    }
    public String getSslVpnInternetIp() {
        return this.sslVpnInternetIp;
    }

    public ModifyVpnGatewayAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ModifyVpnGatewayAttributeResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public ModifyVpnGatewayAttributeResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public ModifyVpnGatewayAttributeResponseBody setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

}
