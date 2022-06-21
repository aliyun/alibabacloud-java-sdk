// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetOpportunityMarketRequest extends TeaModel {
    @NameInMap("CateIds")
    public String cateIds;

    @NameInMap("TimeDisplay")
    public Long timeDisplay;

    public static GetOpportunityMarketRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOpportunityMarketRequest self = new GetOpportunityMarketRequest();
        return TeaModel.build(map, self);
    }

    public GetOpportunityMarketRequest setCateIds(String cateIds) {
        this.cateIds = cateIds;
        return this;
    }
    public String getCateIds() {
        return this.cateIds;
    }

    public GetOpportunityMarketRequest setTimeDisplay(Long timeDisplay) {
        this.timeDisplay = timeDisplay;
        return this;
    }
    public Long getTimeDisplay() {
        return this.timeDisplay;
    }

}
