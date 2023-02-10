// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyUsageNewestRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    public static DescribePropertyUsageNewestRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyUsageNewestRequest self = new DescribePropertyUsageNewestRequest();
        return TeaModel.build(map, self);
    }

    public DescribePropertyUsageNewestRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
