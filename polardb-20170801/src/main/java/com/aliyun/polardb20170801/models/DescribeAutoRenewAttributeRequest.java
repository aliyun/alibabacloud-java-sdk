// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAutoRenewAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DBClusterIds")
    public String DBClusterIds;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeAutoRenewAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoRenewAttributeRequest self = new DescribeAutoRenewAttributeRequest();
        return TeaModel.build(map, self);
    }

}
