// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIPv6TranslatorBandwidthResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("OrderId")
    @Validation(required = true)
    public String orderId;

    public static ModifyIPv6TranslatorBandwidthResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyIPv6TranslatorBandwidthResponse self = new ModifyIPv6TranslatorBandwidthResponse();
        return TeaModel.build(map, self);
    }

}
