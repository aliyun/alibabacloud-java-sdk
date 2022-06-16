// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeAppEnvDeployBaselineRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("EnvId")
    public Long envId;

    public static DescribeAppEnvDeployBaselineRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppEnvDeployBaselineRequest self = new DescribeAppEnvDeployBaselineRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppEnvDeployBaselineRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public DescribeAppEnvDeployBaselineRequest setEnvId(Long envId) {
        this.envId = envId;
        return this;
    }
    public Long getEnvId() {
        return this.envId;
    }

}
