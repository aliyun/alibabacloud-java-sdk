// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyIPv6TranslatorAclListEntryRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("AclId")
    @Validation(required = true)
    public String aclId;

    @NameInMap("AclEntryId")
    @Validation(required = true)
    public String aclEntryId;

    @NameInMap("AclEntryComment")
    @Validation(required = true)
    public String aclEntryComment;

    public static ModifyIPv6TranslatorAclListEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIPv6TranslatorAclListEntryRequest self = new ModifyIPv6TranslatorAclListEntryRequest();
        return TeaModel.build(map, self);
    }

}
