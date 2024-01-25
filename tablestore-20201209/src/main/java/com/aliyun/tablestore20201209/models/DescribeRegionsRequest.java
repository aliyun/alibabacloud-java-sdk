// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class DescribeRegionsRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    public static DescribeRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsRequest self = new DescribeRegionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
