// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterParametersRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    public static DescribeDBClusterParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterParametersRequest self = new DescribeDBClusterParametersRequest();
        return TeaModel.build(map, self);
    }

}
