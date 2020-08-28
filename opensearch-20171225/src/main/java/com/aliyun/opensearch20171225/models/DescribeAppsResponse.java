// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppsResponseBody body;

    public static DescribeAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppsResponse self = new DescribeAppsResponse();
        return TeaModel.build(map, self);
    }

}
