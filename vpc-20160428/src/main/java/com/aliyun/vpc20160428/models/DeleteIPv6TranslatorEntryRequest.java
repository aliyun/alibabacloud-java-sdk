// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteIPv6TranslatorEntryRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Ipv6TranslatorEntryId")
    public String ipv6TranslatorEntryId;

    @NameInMap("Ipv6TranslatorId")
    public String ipv6TranslatorId;

    public static DeleteIPv6TranslatorEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIPv6TranslatorEntryRequest self = new DeleteIPv6TranslatorEntryRequest();
        return TeaModel.build(map, self);
    }

}
