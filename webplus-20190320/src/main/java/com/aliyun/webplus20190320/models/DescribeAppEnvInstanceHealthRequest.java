// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeAppEnvInstanceHealthRequest extends TeaModel {
    @NameInMap("EnvId")
    public String envId;

    public static DescribeAppEnvInstanceHealthRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppEnvInstanceHealthRequest self = new DescribeAppEnvInstanceHealthRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppEnvInstanceHealthRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

}
