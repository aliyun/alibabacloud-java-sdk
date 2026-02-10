// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20201210.models;

import com.aliyun.tea.*;

public class IsFirstBbsTicketRequest extends TeaModel {
    @NameInMap("Cna")
    public String cna;

    @NameInMap("DistributionChannel")
    public String distributionChannel;

    @NameInMap("Referrer")
    public String referrer;

    @NameInMap("SubDistributionChannel")
    public String subDistributionChannel;

    @NameInMap("XGatewayExtendInfo")
    public String XGatewayExtendInfo;

    public static IsFirstBbsTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        IsFirstBbsTicketRequest self = new IsFirstBbsTicketRequest();
        return TeaModel.build(map, self);
    }

    public IsFirstBbsTicketRequest setCna(String cna) {
        this.cna = cna;
        return this;
    }
    public String getCna() {
        return this.cna;
    }

    public IsFirstBbsTicketRequest setDistributionChannel(String distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }
    public String getDistributionChannel() {
        return this.distributionChannel;
    }

    public IsFirstBbsTicketRequest setReferrer(String referrer) {
        this.referrer = referrer;
        return this;
    }
    public String getReferrer() {
        return this.referrer;
    }

    public IsFirstBbsTicketRequest setSubDistributionChannel(String subDistributionChannel) {
        this.subDistributionChannel = subDistributionChannel;
        return this;
    }
    public String getSubDistributionChannel() {
        return this.subDistributionChannel;
    }

    public IsFirstBbsTicketRequest setXGatewayExtendInfo(String XGatewayExtendInfo) {
        this.XGatewayExtendInfo = XGatewayExtendInfo;
        return this;
    }
    public String getXGatewayExtendInfo() {
        return this.XGatewayExtendInfo;
    }

}
