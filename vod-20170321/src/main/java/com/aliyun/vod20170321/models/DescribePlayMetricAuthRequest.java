// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribePlayMetricAuthRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    public static DescribePlayMetricAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayMetricAuthRequest self = new DescribePlayMetricAuthRequest();
        return TeaModel.build(map, self);
    }

    public DescribePlayMetricAuthRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
