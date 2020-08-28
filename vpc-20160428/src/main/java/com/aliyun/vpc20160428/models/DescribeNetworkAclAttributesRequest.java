// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeNetworkAclAttributesRequest extends TeaModel {
    @NameInMap("NetworkAclId")
    @Validation(required = true)
    public String networkAclId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static DescribeNetworkAclAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkAclAttributesRequest self = new DescribeNetworkAclAttributesRequest();
        return TeaModel.build(map, self);
    }

}
