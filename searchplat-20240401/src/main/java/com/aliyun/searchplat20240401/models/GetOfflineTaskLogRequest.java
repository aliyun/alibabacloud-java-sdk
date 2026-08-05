// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class GetOfflineTaskLogRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static GetOfflineTaskLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOfflineTaskLogRequest self = new GetOfflineTaskLogRequest();
        return TeaModel.build(map, self);
    }

    public GetOfflineTaskLogRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
