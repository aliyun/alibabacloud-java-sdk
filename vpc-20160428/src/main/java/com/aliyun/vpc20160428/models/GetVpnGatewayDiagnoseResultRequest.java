// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetVpnGatewayDiagnoseResultRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DiagnoseId")
    public String diagnoseId;

    @NameInMap("RegionId")
    public String regionId;

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
