// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AddIPv6TranslatorAclListEntryResponseBody extends TeaModel {
    @NameInMap("AclEntryId")
    public String aclEntryId;

    @NameInMap("RequestId")
    public String requestId;

    public static AddIPv6TranslatorAclListEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddIPv6TranslatorAclListEntryResponseBody self = new AddIPv6TranslatorAclListEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public AddIPv6TranslatorAclListEntryResponseBody setAclEntryId(String aclEntryId) {
        this.aclEntryId = aclEntryId;
        return this;
    }
    public String getAclEntryId() {
        return this.aclEntryId;
    }

    public AddIPv6TranslatorAclListEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
