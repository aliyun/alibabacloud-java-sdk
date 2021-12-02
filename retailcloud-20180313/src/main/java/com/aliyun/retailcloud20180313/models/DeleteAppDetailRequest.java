// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DeleteAppDetailRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("Force")
    public Boolean force;

    public static DeleteAppDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppDetailRequest self = new DeleteAppDetailRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppDetailRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public DeleteAppDetailRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
