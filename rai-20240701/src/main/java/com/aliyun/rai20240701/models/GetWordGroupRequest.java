// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class GetWordGroupRequest extends TeaModel {
    /**
     * <p>Keyword group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetWordGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWordGroupRequest self = new GetWordGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetWordGroupRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public GetWordGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
