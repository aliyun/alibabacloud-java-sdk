// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class SuspendJobRequest extends TeaModel {
    /**
     * <p>The ID of the job template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ee1a7a07-abcb-4652-a1d3-2d57f415****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Specifies whether to suspend the job template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Suspend")
    public Boolean suspend;

    public static SuspendJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SuspendJobRequest self = new SuspendJobRequest();
        return TeaModel.build(map, self);
    }

    public SuspendJobRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SuspendJobRequest setSuspend(Boolean suspend) {
        this.suspend = suspend;
        return this;
    }
    public Boolean getSuspend() {
        return this.suspend;
    }

}
