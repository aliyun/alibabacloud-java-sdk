// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class RemoveIPv6TranslatorAclListEntryRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("AclId")
    @Validation(required = true)
    public String aclId;

    @NameInMap("AclEntryId")
    @Validation(required = true)
    public String aclEntryId;

    public static RemoveIPv6TranslatorAclListEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveIPv6TranslatorAclListEntryRequest self = new RemoveIPv6TranslatorAclListEntryRequest();
        return TeaModel.build(map, self);
    }

}
