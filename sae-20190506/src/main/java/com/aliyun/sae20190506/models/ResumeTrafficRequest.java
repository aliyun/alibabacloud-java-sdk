// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ResumeTrafficRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>017f39b8-dfa4-4e16-a84b-1dcee4b1****</p>
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

    public static ResumeTrafficRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeTrafficRequest self = new ResumeTrafficRequest();
        return TeaModel.build(map, self);
    }

    public ResumeTrafficRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ResumeTrafficRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

}
