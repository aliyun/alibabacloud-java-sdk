// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeEnvResourceRequest extends TeaModel {
    @NameInMap("EnvId")
    public String envId;

    public static DescribeEnvResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnvResourceRequest self = new DescribeEnvResourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEnvResourceRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

}
