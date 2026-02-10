// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20201210.models;

import com.aliyun.tea.*;

public class SuggestCategoryRequest extends TeaModel {
    @NameInMap("Cna")
    public String cna;

    @NameInMap("Content")
    public String content;

    @NameInMap("DistributionChannel")
    public String distributionChannel;

    @NameInMap("Referrer")
    public String referrer;

    @NameInMap("SubDistributionChannel")
    public String subDistributionChannel;

    @NameInMap("TicketId")
    public String ticketId;

    @NameInMap("TopN")
    public Integer topN;

    @NameInMap("UseHotSuggestCatchAll")
    public Boolean useHotSuggestCatchAll;

    @NameInMap("XGatewayExtendInfo")
    public String XGatewayExtendInfo;

    public static SuggestCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        SuggestCategoryRequest self = new SuggestCategoryRequest();
        return TeaModel.build(map, self);
    }

    public SuggestCategoryRequest setCna(String cna) {
        this.cna = cna;
        return this;
    }
    public String getCna() {
        return this.cna;
    }

    public SuggestCategoryRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SuggestCategoryRequest setDistributionChannel(String distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }
    public String getDistributionChannel() {
        return this.distributionChannel;
    }

    public SuggestCategoryRequest setReferrer(String referrer) {
        this.referrer = referrer;
        return this;
    }
    public String getReferrer() {
        return this.referrer;
    }

    public SuggestCategoryRequest setSubDistributionChannel(String subDistributionChannel) {
        this.subDistributionChannel = subDistributionChannel;
        return this;
    }
    public String getSubDistributionChannel() {
        return this.subDistributionChannel;
    }

    public SuggestCategoryRequest setTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public String getTicketId() {
        return this.ticketId;
    }

    public SuggestCategoryRequest setTopN(Integer topN) {
        this.topN = topN;
        return this;
    }
    public Integer getTopN() {
        return this.topN;
    }

    public SuggestCategoryRequest setUseHotSuggestCatchAll(Boolean useHotSuggestCatchAll) {
        this.useHotSuggestCatchAll = useHotSuggestCatchAll;
        return this;
    }
    public Boolean getUseHotSuggestCatchAll() {
        return this.useHotSuggestCatchAll;
    }

    public SuggestCategoryRequest setXGatewayExtendInfo(String XGatewayExtendInfo) {
        this.XGatewayExtendInfo = XGatewayExtendInfo;
        return this;
    }
    public String getXGatewayExtendInfo() {
        return this.XGatewayExtendInfo;
    }

}
