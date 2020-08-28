// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListTagValuesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ResourceType")
    @Validation(required = true)
    public String resourceType;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Key")
    @Validation(required = true)
    public String key;

    public static ListTagValuesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagValuesRequest self = new ListTagValuesRequest();
        return TeaModel.build(map, self);
    }

}
