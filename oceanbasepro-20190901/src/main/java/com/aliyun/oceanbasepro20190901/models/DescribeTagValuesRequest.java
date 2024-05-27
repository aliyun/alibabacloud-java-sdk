// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTagValuesRequest extends TeaModel {
    /**
     * <p>The type of the resource.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static DescribeTagValuesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagValuesRequest self = new DescribeTagValuesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTagValuesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
