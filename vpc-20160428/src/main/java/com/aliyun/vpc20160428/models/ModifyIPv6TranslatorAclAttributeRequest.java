// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIPv6TranslatorAclAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("AclId")
    @Validation(required = true)
    public String aclId;

    @NameInMap("AclName")
    @Validation(required = true)
    public String aclName;

    public static ModifyIPv6TranslatorAclAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIPv6TranslatorAclAttributeRequest self = new ModifyIPv6TranslatorAclAttributeRequest();
        return TeaModel.build(map, self);
    }

}
