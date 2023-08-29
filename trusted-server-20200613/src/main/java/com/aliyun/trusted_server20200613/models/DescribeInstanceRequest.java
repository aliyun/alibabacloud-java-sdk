// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trusted_server20200613.models;

import com.aliyun.tea.*;

public class DescribeInstanceRequest extends TeaModel {
    @NameInMap("PropertyUuid")
    public String propertyUuid;

    public static DescribeInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceRequest self = new DescribeInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceRequest setPropertyUuid(String propertyUuid) {
        this.propertyUuid = propertyUuid;
        return this;
    }
    public String getPropertyUuid() {
        return this.propertyUuid;
    }

}
