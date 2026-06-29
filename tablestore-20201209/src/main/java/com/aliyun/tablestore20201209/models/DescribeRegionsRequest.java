// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class DescribeRegionsRequest extends TeaModel {
    /**
     * <p>A parameter to ensure idempotence.</p>
     * <blockquote>
     * <p>This parameter ensures that each request is processed only once. Generate a unique value on the client for each request. The value can be up to 64 ASCII characters long and must not contain non-ASCII characters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCzxxxxxxxxxx</p>
     */
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
