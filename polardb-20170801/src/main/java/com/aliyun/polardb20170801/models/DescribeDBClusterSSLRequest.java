// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterSSLRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    public static DescribeDBClusterSSLRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterSSLRequest self = new DescribeDBClusterSSLRequest();
        return TeaModel.build(map, self);
    }

}
