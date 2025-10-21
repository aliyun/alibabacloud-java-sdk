// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class DeleteWordGroupRequest extends TeaModel {
    /**
     * <p>List of keyword strategy IDs.</p>
     */
    @NameInMap("GroupIdList")
    public java.util.List<Long> groupIdList;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteWordGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWordGroupRequest self = new DeleteWordGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWordGroupRequest setGroupIdList(java.util.List<Long> groupIdList) {
        this.groupIdList = groupIdList;
        return this;
    }
    public java.util.List<Long> getGroupIdList() {
        return this.groupIdList;
    }

    public DeleteWordGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
