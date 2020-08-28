// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVSwitchesRequest extends TeaModel {
    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VSwitchName")
    public String vSwitchName;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("IsDefault")
    public Boolean isDefault;

    @NameInMap("RouteTableId")
    public String routeTableId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("VSwitchOwnerId")
    public Long vSwitchOwnerId;

    public static DescribeVSwitchesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVSwitchesRequest self = new DescribeVSwitchesRequest();
        return TeaModel.build(map, self);
    }

}
