// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AddIPv6TranslatorAclListEntryRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("AclId")
    @Validation(required = true)
    public String aclId;

    @NameInMap("AclEntryIp")
    @Validation(required = true)
    public String aclEntryIp;

    @NameInMap("AclEntryComment")
    public String aclEntryComment;

    public static AddIPv6TranslatorAclListEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        AddIPv6TranslatorAclListEntryRequest self = new AddIPv6TranslatorAclListEntryRequest();
        return TeaModel.build(map, self);
    }

}
