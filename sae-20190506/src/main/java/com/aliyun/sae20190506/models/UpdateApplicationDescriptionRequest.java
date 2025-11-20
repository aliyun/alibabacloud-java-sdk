// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateApplicationDescriptionRequest extends TeaModel {
    /**
     * <p>The new description of the application. The description can be up to 1,024 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>newdesc</p>
     */
    @NameInMap("AppDescription")
    public String appDescription;

    /**
     * <p>The ID of the application that you want to update.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
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
