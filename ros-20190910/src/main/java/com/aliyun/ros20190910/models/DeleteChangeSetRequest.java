// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteChangeSetRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ChangeSetId")
    @Validation(required = true)
    public String changeSetId;

    public static DeleteChangeSetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteChangeSetRequest self = new DeleteChangeSetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteChangeSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteChangeSetRequest setChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
        return this;
    }
    public String getChangeSetId() {
        return this.changeSetId;
    }

}
