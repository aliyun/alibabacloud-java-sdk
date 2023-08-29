// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trusted_server20200613.models;

import com.aliyun.tea.*;

public class DescribeBootRequest extends TeaModel {
    @NameInMap("PropertyUuid")
    public String propertyUuid;

    public static DescribeBootRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBootRequest self = new DescribeBootRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBootRequest setPropertyUuid(String propertyUuid) {
        this.propertyUuid = propertyUuid;
        return this;
    }
    public String getPropertyUuid() {
        return this.propertyUuid;
    }

}
