// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeBgpNetworksRequest extends TeaModel {
    @NameInMap("RouterId")
    public String routerId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeBgpNetworksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBgpNetworksRequest self = new DescribeBgpNetworksRequest();
        return TeaModel.build(map, self);
    }

}
