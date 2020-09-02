// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateIPv6TranslatorAclListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AclId")
    @Validation(required = true)
    public String aclId;

    public static CreateIPv6TranslatorAclListResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIPv6TranslatorAclListResponse self = new CreateIPv6TranslatorAclListResponse();
        return TeaModel.build(map, self);
    }

    public CreateIPv6TranslatorAclListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateIPv6TranslatorAclListResponse setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

}
