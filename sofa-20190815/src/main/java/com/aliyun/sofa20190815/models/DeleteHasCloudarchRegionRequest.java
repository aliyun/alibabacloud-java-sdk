// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasCloudarchRegionRequest extends TeaModel {
    @NameInMap("TheRegionId")
    public String theRegionId;

    public static DeleteHasCloudarchRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasCloudarchRegionRequest self = new DeleteHasCloudarchRegionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHasCloudarchRegionRequest setTheRegionId(String theRegionId) {
        this.theRegionId = theRegionId;
        return this;
    }
    public String getTheRegionId() {
        return this.theRegionId;
    }

}
