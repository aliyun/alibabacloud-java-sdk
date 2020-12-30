// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class StartAppEnvRequest extends TeaModel {
    @NameInMap("EnvId")
    public String envId;

    public static StartAppEnvRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAppEnvRequest self = new StartAppEnvRequest();
        return TeaModel.build(map, self);
    }

    public StartAppEnvRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

}
