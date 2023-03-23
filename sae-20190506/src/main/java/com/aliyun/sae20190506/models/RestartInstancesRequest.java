// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RestartInstancesRequest extends TeaModel {
    /**
     * <p>1daa7236-3844-4f36-b39a-605b0cc0\*\*\*\*</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>mysae-1daa7236-3844-4f36-b39a-605b0cc0caa6-\*\*\*\*\*</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    public static RestartInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartInstancesRequest self = new RestartInstancesRequest();
        return TeaModel.build(map, self);
    }

    public RestartInstancesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RestartInstancesRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

}
