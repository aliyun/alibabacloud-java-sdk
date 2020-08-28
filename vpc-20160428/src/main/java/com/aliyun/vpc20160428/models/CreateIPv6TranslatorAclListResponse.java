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

}
