// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateIPv6TranslatorAclListRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("AclName")
    @Validation(required = true)
    public String aclName;

    public static CreateIPv6TranslatorAclListRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIPv6TranslatorAclListRequest self = new CreateIPv6TranslatorAclListRequest();
        return TeaModel.build(map, self);
    }

}
