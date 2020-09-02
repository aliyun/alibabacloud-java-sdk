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

    public CreateIPv6TranslatorEntryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateIPv6TranslatorEntryResponse setIpv6TranslatorEntryId(String ipv6TranslatorEntryId) {
        this.ipv6TranslatorEntryId = ipv6TranslatorEntryId;
        return this;
    }
    public String getIpv6TranslatorEntryId() {
        return this.ipv6TranslatorEntryId;
    }

}
