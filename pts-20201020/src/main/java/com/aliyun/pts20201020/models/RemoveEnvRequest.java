// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class RemoveEnvRequest extends TeaModel {
    // 要删除的环境ID
    @NameInMap("EnvId")
    public String envId;

    public static RemoveEnvRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveEnvRequest self = new RemoveEnvRequest();
        return TeaModel.build(map, self);
    }

    public RemoveEnvRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

}
