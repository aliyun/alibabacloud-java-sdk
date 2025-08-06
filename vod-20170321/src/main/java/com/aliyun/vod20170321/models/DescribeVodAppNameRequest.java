// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodAppNameRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    public static DescribeVodAppNameRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodAppNameRequest self = new DescribeVodAppNameRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodAppNameRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
