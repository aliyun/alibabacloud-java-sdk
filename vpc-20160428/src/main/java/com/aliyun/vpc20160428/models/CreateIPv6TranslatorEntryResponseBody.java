// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateIPv6TranslatorEntryResponseBody extends TeaModel {
    /**
     * <p>The ID of the IPv6 Translation Service instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ipv6transentry-xxxxxxxx</p>
     */
    @NameInMap("Ipv6TranslatorEntryId")
    public String ipv6TranslatorEntryId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DCE5D25-FFC9-492A-8371-12A4E0EE2E05</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateIPv6TranslatorEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIPv6TranslatorEntryResponseBody self = new CreateIPv6TranslatorEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIPv6TranslatorEntryResponseBody setIpv6TranslatorEntryId(String ipv6TranslatorEntryId) {
        this.ipv6TranslatorEntryId = ipv6TranslatorEntryId;
        return this;
    }
    public String getIpv6TranslatorEntryId() {
        return this.ipv6TranslatorEntryId;
    }

    public CreateIPv6TranslatorEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
