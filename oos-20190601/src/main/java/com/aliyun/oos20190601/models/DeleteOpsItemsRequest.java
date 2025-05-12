// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteOpsItemsRequest extends TeaModel {
    /**
     * <p>The IDs of O\&amp;M items.</p>
     */
    @NameInMap("OpsItemIds")
    public java.util.List<String> opsItemIds;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteOpsItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOpsItemsRequest self = new DeleteOpsItemsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOpsItemsRequest setOpsItemIds(java.util.List<String> opsItemIds) {
        this.opsItemIds = opsItemIds;
        return this;
    }
    public java.util.List<String> getOpsItemIds() {
        return this.opsItemIds;
    }

    public DeleteOpsItemsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
