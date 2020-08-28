// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIPv6TranslatorAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Ipv6TranslatorId")
    @Validation(required = true)
    public String ipv6TranslatorId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    public static ModifyIPv6TranslatorAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIPv6TranslatorAttributeRequest self = new ModifyIPv6TranslatorAttributeRequest();
        return TeaModel.build(map, self);
    }

}
