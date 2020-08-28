// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeBgpPeersRequest extends TeaModel {
    @NameInMap("RouterId")
    public String routerId;

    @NameInMap("BgpPeerId")
    public String bgpPeerId;

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

    public static DescribeBgpPeersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBgpPeersRequest self = new DescribeBgpPeersRequest();
        return TeaModel.build(map, self);
    }

}
