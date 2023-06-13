// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListInstancePlansModificationRequest extends TeaModel {
    /**
     * <p>The ID of the simple application server.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the simple application server. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListInstancePlansModificationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancePlansModificationRequest self = new ListInstancePlansModificationRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancePlansModificationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInstancePlansModificationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
