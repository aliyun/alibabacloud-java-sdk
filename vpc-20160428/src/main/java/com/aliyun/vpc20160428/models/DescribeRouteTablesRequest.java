// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeRouteTablesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VRouterId")
    public String VRouterId;

    @NameInMap("RouteTableId")
    public String routeTableId;

    @NameInMap("RouterType")
    public String routerType;

    @NameInMap("RouterId")
    public String routerId;

    @NameInMap("Type")
    public String type;

    @NameInMap("RouteTableName")
    public String routeTableName;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeRouteTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouteTablesRequest self = new DescribeRouteTablesRequest();
        return TeaModel.build(map, self);
    }

}
