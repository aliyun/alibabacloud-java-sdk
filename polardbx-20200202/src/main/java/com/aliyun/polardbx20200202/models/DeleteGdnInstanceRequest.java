// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DeleteGdnInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gdn-yq****dorhkzttoi</p>
     */
    @NameInMap("GdnInstanceName")
    public String gdnInstanceName;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteGdnInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGdnInstanceRequest self = new DeleteGdnInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGdnInstanceRequest setGdnInstanceName(String gdnInstanceName) {
        this.gdnInstanceName = gdnInstanceName;
        return this;
    }
    public String getGdnInstanceName() {
        return this.gdnInstanceName;
    }

    public DeleteGdnInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
