// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetWebshellTokenRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>017f39b8-dfa4-4e16-a84b-1dcee4b1****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hello-podsdfsdfsdfsdf</p>
     */
    @NameInMap("PodName")
    public String podName;

    public static GetWebshellTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWebshellTokenRequest self = new GetWebshellTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetWebshellTokenRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetWebshellTokenRequest setPodName(String podName) {
        this.podName = podName;
        return this;
    }
    public String getPodName() {
        return this.podName;
    }

}
