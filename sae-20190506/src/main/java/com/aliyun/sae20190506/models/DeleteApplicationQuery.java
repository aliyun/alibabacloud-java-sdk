// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeleteApplicationQuery extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    public static DeleteApplicationQuery build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationQuery self = new DeleteApplicationQuery();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationQuery setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
