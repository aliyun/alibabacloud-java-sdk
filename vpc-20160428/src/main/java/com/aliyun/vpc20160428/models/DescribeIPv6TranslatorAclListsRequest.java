// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIPv6TranslatorAclListsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("AclId")
    public String aclId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("AclName")
    public String aclName;

    public static DescribeIPv6TranslatorAclListsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIPv6TranslatorAclListsRequest self = new DescribeIPv6TranslatorAclListsRequest();
        return TeaModel.build(map, self);
    }

}
