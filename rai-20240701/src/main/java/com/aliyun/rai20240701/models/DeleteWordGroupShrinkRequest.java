// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class DeleteWordGroupShrinkRequest extends TeaModel {
    /**
     * <p>List of keyword strategy IDs.</p>
     */
    @NameInMap("GroupIdList")
    public String groupIdListShrink;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteWordGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWordGroupShrinkRequest self = new DeleteWordGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWordGroupShrinkRequest setGroupIdListShrink(String groupIdListShrink) {
        this.groupIdListShrink = groupIdListShrink;
        return this;
    }
    public String getGroupIdListShrink() {
        return this.groupIdListShrink;
    }

    public DeleteWordGroupShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
