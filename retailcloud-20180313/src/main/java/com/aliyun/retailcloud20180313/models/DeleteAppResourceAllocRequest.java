// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DeleteAppResourceAllocRequest extends TeaModel {
    @NameInMap("AppEnvId")
    public Long appEnvId;

    public static DeleteAppResourceAllocRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppResourceAllocRequest self = new DeleteAppResourceAllocRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppResourceAllocRequest setAppEnvId(Long appEnvId) {
        this.appEnvId = appEnvId;
        return this;
    }
    public Long getAppEnvId() {
        return this.appEnvId;
    }

}
