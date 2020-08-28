// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpcsRequest extends TeaModel {
    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("VpcName")
    public String vpcName;

    @NameInMap("IsDefault")
    public Boolean isDefault;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("VpcOwnerId")
    public Long vpcOwnerId;

    @NameInMap("DhcpOptionsSetId")
    public String dhcpOptionsSetId;

    public static DescribeVpcsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcsRequest self = new DescribeVpcsRequest();
        return TeaModel.build(map, self);
    }

}
