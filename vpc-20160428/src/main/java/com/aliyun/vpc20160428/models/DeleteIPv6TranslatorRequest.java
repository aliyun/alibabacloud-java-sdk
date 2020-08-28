// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteIPv6TranslatorRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Ipv6TranslatorId")
    @Validation(required = true)
    public String ipv6TranslatorId;

    public static DeleteIPv6TranslatorRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIPv6TranslatorRequest self = new DeleteIPv6TranslatorRequest();
        return TeaModel.build(map, self);
    }

}
