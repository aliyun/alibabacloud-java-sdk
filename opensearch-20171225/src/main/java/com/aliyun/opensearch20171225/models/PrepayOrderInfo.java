// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class PrepayOrderInfo extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-renewal for the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("autoRenew")
    public Boolean autoRenew;

    /**
     * <p>The subscription duration.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("duration")
    public Integer duration;

    /**
     * <p>The billing cycle. Valid values:</p>
     * <ul>
     * <li>Year</li>
     * <li>Month</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
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
