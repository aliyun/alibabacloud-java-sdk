// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MarketListResult extends TeaModel {
    @NameInMap("markets")
    public java.util.List<MarketInfo> markets;

    public static MarketListResult build(java.util.Map<String, ?> map) throws Exception {
        MarketListResult self = new MarketListResult();
        return TeaModel.build(map, self);
    }

    public MarketListResult setMarkets(java.util.List<MarketInfo> markets) {
        this.markets = markets;
        return this;
    }
    public java.util.List<MarketInfo> getMarkets() {
        return this.markets;
    }

}
