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

    public AddIPv6TranslatorAclListEntryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddIPv6TranslatorAclListEntryResponse setAclEntryId(String aclEntryId) {
        this.aclEntryId = aclEntryId;
        return this;
    }
    public String getAclEntryId() {
        return this.aclEntryId;
    }

}
