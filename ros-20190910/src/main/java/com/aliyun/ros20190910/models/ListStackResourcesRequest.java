// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackResourcesRequest extends TeaModel {
    /**
     * <p>Details about resources.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("StackId")
    public String stackId;

    public static ListStackResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStackResourcesRequest self = new ListStackResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListStackResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListStackResourcesRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

}
