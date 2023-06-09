// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class PrepayOrderInfo extends TeaModel {
    @NameInMap("autoRenew")
    public Boolean autoRenew;

    @NameInMap("duration")
    public Integer duration;

    @NameInMap("pricingCycle")
    public String pricingCycle;

    public static PrepayOrderInfo build(java.util.Map<String, ?> map) throws Exception {
        PrepayOrderInfo self = new PrepayOrderInfo();
        return TeaModel.build(map, self);
    }

    public PrepayOrderInfo setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public PrepayOrderInfo setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public PrepayOrderInfo setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

}
