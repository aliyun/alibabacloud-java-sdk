// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackResourcesRequest extends TeaModel {
    /**
     * <p>The region ID of the stack. You can call <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The stack ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
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
