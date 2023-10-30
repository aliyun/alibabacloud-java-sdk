// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetInstanceADAuthServerRequest extends TeaModel {
    /**
     * <p>The field that is used to indicate the email address of a user on the AD server.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Indicates whether passwords are required. Valid values:</p>
     * <br>
     * <p>*   **true**: required</p>
     * <p>*   **false**: not required</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetInstanceADAuthServerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceADAuthServerRequest self = new GetInstanceADAuthServerRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceADAuthServerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceADAuthServerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
