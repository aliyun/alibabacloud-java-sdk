// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20201210.models;

import com.aliyun.tea.*;

public class GetTicketTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CategoryId")
    public Long categoryId;

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

    public static GetTicketTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTicketTemplateRequest self = new GetTicketTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetTicketTemplateRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public GetTicketTemplateRequest setCna(String cna) {
        this.cna = cna;
        return this;
    }
    public String getCna() {
        return this.cna;
    }

    public GetTicketTemplateRequest setDistributionChannel(String distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }
    public String getDistributionChannel() {
        return this.distributionChannel;
    }

    public GetTicketTemplateRequest setReferrer(String referrer) {
        this.referrer = referrer;
        return this;
    }
    public String getReferrer() {
        return this.referrer;
    }

    public GetTicketTemplateRequest setSubDistributionChannel(String subDistributionChannel) {
        this.subDistributionChannel = subDistributionChannel;
        return this;
    }
    public String getSubDistributionChannel() {
        return this.subDistributionChannel;
    }

    public GetTicketTemplateRequest setXGatewayExtendInfo(String XGatewayExtendInfo) {
        this.XGatewayExtendInfo = XGatewayExtendInfo;
        return this;
    }
    public String getXGatewayExtendInfo() {
        return this.XGatewayExtendInfo;
    }

}
