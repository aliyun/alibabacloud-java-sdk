// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeAppEnvironmentDetailRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("EnvId")
    public Long envId;

    public static DescribeAppEnvironmentDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppEnvironmentDetailRequest self = new DescribeAppEnvironmentDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppEnvironmentDetailRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public DescribeAppEnvironmentDetailRequest setEnvId(Long envId) {
        this.envId = envId;
        return this;
    }
    public Long getEnvId() {
        return this.envId;
    }

}
