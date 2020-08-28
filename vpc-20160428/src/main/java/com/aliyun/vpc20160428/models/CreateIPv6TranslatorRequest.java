// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateIPv6TranslatorRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Name")
    public String name;

    @NameInMap("Spec")
    public String spec;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("Bandwidth")
    public Integer bandwidth;

    public static CreateIPv6TranslatorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIPv6TranslatorRequest self = new CreateIPv6TranslatorRequest();
        return TeaModel.build(map, self);
    }

}
