// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DisableArmsRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7171a6ca-d1cd-4928-8642-7d5cfe69a26c</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static DisableArmsRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableArmsRequest self = new DisableArmsRequest();
        return TeaModel.build(map, self);
    }

    public DisableArmsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
