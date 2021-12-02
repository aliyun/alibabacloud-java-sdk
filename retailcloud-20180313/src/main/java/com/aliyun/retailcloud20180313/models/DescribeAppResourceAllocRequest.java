// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeAppResourceAllocRequest extends TeaModel {
    @NameInMap("AppEnvId")
    public Long appEnvId;

    public static DescribeAppResourceAllocRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppResourceAllocRequest self = new DescribeAppResourceAllocRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppResourceAllocRequest setAppEnvId(Long appEnvId) {
        this.appEnvId = appEnvId;
        return this;
    }
    public Long getAppEnvId() {
        return this.appEnvId;
    }

}
