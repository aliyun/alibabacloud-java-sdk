// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteCloudAppRequest extends TeaModel {
    /**
     * <p>The cloud application ID, which corresponds to a unique application package.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cap-b06b26edfhytbn b94a75ae1a79efc90eb</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static DeleteCloudAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudAppRequest self = new DeleteCloudAppRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCloudAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
