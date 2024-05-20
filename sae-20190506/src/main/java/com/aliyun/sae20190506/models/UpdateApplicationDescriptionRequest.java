// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateApplicationDescriptionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppDescription")
    public String appDescription;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static UpdateApplicationDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationDescriptionRequest self = new UpdateApplicationDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationDescriptionRequest setAppDescription(String appDescription) {
        this.appDescription = appDescription;
        return this;
    }
    public String getAppDescription() {
        return this.appDescription;
    }

    public UpdateApplicationDescriptionRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
