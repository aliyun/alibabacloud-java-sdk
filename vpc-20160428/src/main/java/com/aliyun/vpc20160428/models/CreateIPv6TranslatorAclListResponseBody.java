// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateIPv6TranslatorAclListResponseBody extends TeaModel {
    /**
     * <p>The ACL ID.</p>
     */
    @NameInMap("AclId")
    public String aclId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateIPv6TranslatorAclListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIPv6TranslatorAclListResponseBody self = new CreateIPv6TranslatorAclListResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIPv6TranslatorAclListResponseBody setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public CreateIPv6TranslatorAclListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
