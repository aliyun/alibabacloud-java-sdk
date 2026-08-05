// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class DeleteOfflineTaskRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static DeleteOfflineTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOfflineTaskRequest self = new DeleteOfflineTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOfflineTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
