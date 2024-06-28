// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetVpnGatewayDiagnoseResultRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <p>**</p>
     * <p><strong>Description</strong> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the diagnostic operation.</p>
     * <p>When you call the <a href="https://help.aliyun.com/document_detail/469751.html">DiagnoseVpnGateway</a> operation, the system returns a corresponding ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpndgn-uf6kuxbe3iv028k3s****</p>
     */
    @NameInMap("DiagnoseId")
    public String diagnoseId;

    /**
     * <p>The region ID of the VPN gateway.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the VPN gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>vpn-uf6fzwp0ck3frwtbk****</p>
     */
    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    public static GetVpnGatewayDiagnoseResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVpnGatewayDiagnoseResultRequest self = new GetVpnGatewayDiagnoseResultRequest();
        return TeaModel.build(map, self);
    }

    public GetVpnGatewayDiagnoseResultRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetVpnGatewayDiagnoseResultRequest setDiagnoseId(String diagnoseId) {
        this.diagnoseId = diagnoseId;
        return this;
    }
    public String getDiagnoseId() {
        return this.diagnoseId;
    }

    public GetVpnGatewayDiagnoseResultRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetVpnGatewayDiagnoseResultRequest setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

}
