// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyCommonBandwidthPackagePayTypeRequest extends TeaModel {
    @NameInMap("BandwidthPackageId")
    @Validation(required = true)
    public String bandwidthPackageId;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("Bandwidth")
    public String bandwidth;

    @NameInMap("KbpsBandwidth")
    public String kbpsBandwidth;

    @NameInMap("ResourceBid")
    public String resourceBid;

    @NameInMap("ResourceUid")
    public Long resourceUid;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static ModifyCommonBandwidthPackagePayTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCommonBandwidthPackagePayTypeRequest self = new ModifyCommonBandwidthPackagePayTypeRequest();
        return TeaModel.build(map, self);
    }

}
