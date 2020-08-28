// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UnTagResourcesRequest extends TeaModel {
    @NameInMap("ResourceType")
    @Validation(required = true)
    public String resourceType;

    @NameInMap("ResourceId")
    @Validation(required = true)
    public java.util.List<String> resourceId;

    @NameInMap("TagKey")
    public java.util.List<String> tagKey;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("All")
    public Boolean all;

    public static UnTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UnTagResourcesRequest self = new UnTagResourcesRequest();
        return TeaModel.build(map, self);
    }

}
