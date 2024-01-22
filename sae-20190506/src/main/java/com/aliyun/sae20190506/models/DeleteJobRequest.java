// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteJobRequest extends TeaModel {
    /**
     * <p>The ID of the job template that you want to delete.</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static DeleteJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobRequest self = new DeleteJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteJobRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
