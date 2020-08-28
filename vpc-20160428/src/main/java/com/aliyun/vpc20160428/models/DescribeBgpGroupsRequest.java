// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeBgpGroupsRequest extends TeaModel {
    @NameInMap("RouterId")
    public String routerId;

    @NameInMap("BgpGroupId")
    public String bgpGroupId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("IsDefault")
    public Boolean isDefault;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeBgpGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBgpGroupsRequest self = new DescribeBgpGroupsRequest();
        return TeaModel.build(map, self);
    }

}
