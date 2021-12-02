// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeEciConfigRequest extends TeaModel {
    // appEnvId
    @NameInMap("AppEnvId")
    public Long appEnvId;

    public static DescribeEciConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEciConfigRequest self = new DescribeEciConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEciConfigRequest setAppEnvId(Long appEnvId) {
        this.appEnvId = appEnvId;
        return this;
    }
    public Long getAppEnvId() {
        return this.appEnvId;
    }

}
