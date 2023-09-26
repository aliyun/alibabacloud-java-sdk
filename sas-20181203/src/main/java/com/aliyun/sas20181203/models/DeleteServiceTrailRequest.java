// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteServiceTrailRequest extends TeaModel {
    /**
     * <p>The region in which your Security Center service is deployed. Valid values:</p>
     * <br>
     * <p>*   **cn-hangzhou**: center.</p>
     * <p>*   **ap-southeast-1**: Singapore.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteServiceTrailRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceTrailRequest self = new DeleteServiceTrailRequest();
        return TeaModel.build(map, self);
    }

    public DeleteServiceTrailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
