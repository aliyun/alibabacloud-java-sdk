// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIPv6TranslatorBandwidthRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Ipv6TranslatorId")
    @Validation(required = true)
    public String ipv6TranslatorId;

    @NameInMap("Bandwidth")
    @Validation(required = true)
    public Integer bandwidth;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    public static ModifyIPv6TranslatorBandwidthRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIPv6TranslatorBandwidthRequest self = new ModifyIPv6TranslatorBandwidthRequest();
        return TeaModel.build(map, self);
    }

}
