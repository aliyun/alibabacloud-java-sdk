// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteChangeSetRequest extends TeaModel {
    /**
     * <p>The ID of the change set.</p>
     */
    @NameInMap("ChangeSetId")
    public String changeSetId;

    /**
     * <p>The region ID of the change set. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteChangeSetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteChangeSetRequest self = new DeleteChangeSetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteChangeSetRequest setChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
        return this;
    }
    public String getChangeSetId() {
        return this.changeSetId;
    }

    public DeleteChangeSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
