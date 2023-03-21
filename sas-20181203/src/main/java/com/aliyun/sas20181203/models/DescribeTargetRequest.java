// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeTargetRequest extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("Type")
    public String type;

    public static DescribeTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTargetRequest self = new DescribeTargetRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTargetRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public DescribeTargetRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
