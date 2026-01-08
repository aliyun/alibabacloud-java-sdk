// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class SuspendTrafficRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d700e680-aa4d-4ec1-afc2-6566b5ff****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c-668727a8-17d86664-41e5bb******,c-668727a8-17d86664-7e4958******</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    public static SuspendTrafficRequest build(java.util.Map<String, ?> map) throws Exception {
        SuspendTrafficRequest self = new SuspendTrafficRequest();
        return TeaModel.build(map, self);
    }

    public SuspendTrafficRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SuspendTrafficRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

}
