// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopQueryLivePortraitModelScopeProjectDetailRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    public static PopQueryLivePortraitModelScopeProjectDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        PopQueryLivePortraitModelScopeProjectDetailRequest self = new PopQueryLivePortraitModelScopeProjectDetailRequest();
        return TeaModel.build(map, self);
    }

    public PopQueryLivePortraitModelScopeProjectDetailRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
