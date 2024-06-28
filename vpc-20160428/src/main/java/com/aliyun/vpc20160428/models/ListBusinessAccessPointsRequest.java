// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListBusinessAccessPointsRequest extends TeaModel {
    /**
     * <p>The region ID of the Express Connect circuit.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListBusinessAccessPointsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBusinessAccessPointsRequest self = new ListBusinessAccessPointsRequest();
        return TeaModel.build(map, self);
    }

    public ListBusinessAccessPointsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
