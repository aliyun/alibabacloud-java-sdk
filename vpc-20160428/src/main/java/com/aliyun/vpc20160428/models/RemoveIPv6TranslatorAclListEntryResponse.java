// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class RemoveIPv6TranslatorAclListEntryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static RemoveIPv6TranslatorAclListEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveIPv6TranslatorAclListEntryResponse self = new RemoveIPv6TranslatorAclListEntryResponse();
        return TeaModel.build(map, self);
    }

    public RemoveIPv6TranslatorAclListEntryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
