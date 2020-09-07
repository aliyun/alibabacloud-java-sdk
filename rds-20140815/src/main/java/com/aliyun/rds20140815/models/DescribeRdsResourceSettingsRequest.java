// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRdsResourceSettingsRequest extends TeaModel {
    @NameInMap("ResourceNiche")
    @Validation(required = true)
    public String resourceNiche;

    public static DescribeRdsResourceSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsResourceSettingsRequest self = new DescribeRdsResourceSettingsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRdsResourceSettingsRequest setResourceNiche(String resourceNiche) {
        this.resourceNiche = resourceNiche;
        return this;
    }
    public String getResourceNiche() {
        return this.resourceNiche;
    }

}
