// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateIPv6TranslatorResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Ipv6TranslatorId")
    @Validation(required = true)
    public String ipv6TranslatorId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("Spec")
    @Validation(required = true)
    public String spec;

    @NameInMap("OrderId")
    @Validation(required = true)
    public Long orderId;

    public static CreateIPv6TranslatorResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIPv6TranslatorResponse self = new CreateIPv6TranslatorResponse();
        return TeaModel.build(map, self);
    }

}
