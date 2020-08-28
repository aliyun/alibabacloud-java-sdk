// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIPv6TranslatorAclListAttributesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("AclId")
    @Validation(required = true)
    public String aclId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeIPv6TranslatorAclListAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIPv6TranslatorAclListAttributesRequest self = new DescribeIPv6TranslatorAclListAttributesRequest();
        return TeaModel.build(map, self);
    }

}
