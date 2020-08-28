// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateIPv6TranslatorEntryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Ipv6TranslatorEntryId")
    @Validation(required = true)
    public String ipv6TranslatorEntryId;

    public static CreateIPv6TranslatorEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIPv6TranslatorEntryResponse self = new CreateIPv6TranslatorEntryResponse();
        return TeaModel.build(map, self);
    }

}
