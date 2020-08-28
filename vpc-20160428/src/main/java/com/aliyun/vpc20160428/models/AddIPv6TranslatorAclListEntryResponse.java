// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AddIPv6TranslatorAclListEntryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AclEntryId")
    @Validation(required = true)
    public String aclEntryId;

    public static AddIPv6TranslatorAclListEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        AddIPv6TranslatorAclListEntryResponse self = new AddIPv6TranslatorAclListEntryResponse();
        return TeaModel.build(map, self);
    }

}
