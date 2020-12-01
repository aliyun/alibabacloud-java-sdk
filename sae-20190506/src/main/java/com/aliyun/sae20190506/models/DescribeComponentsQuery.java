// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeComponentsQuery extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("Type")
    @Validation(required = true)
    public String type;

    public static DescribeComponentsQuery build(java.util.Map<String, ?> map) throws Exception {
        DescribeComponentsQuery self = new DescribeComponentsQuery();
        return TeaModel.build(map, self);
    }

    public DescribeComponentsQuery setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeComponentsQuery setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
