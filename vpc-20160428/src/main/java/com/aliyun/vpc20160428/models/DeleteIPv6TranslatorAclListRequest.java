// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteIPv6TranslatorAclListRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("AclId")
    @Validation(required = true)
    public String aclId;

    public static DeleteIPv6TranslatorAclListRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIPv6TranslatorAclListRequest self = new DeleteIPv6TranslatorAclListRequest();
        return TeaModel.build(map, self);
    }

}
