// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAccessWhitelistRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    public static DescribeDBClusterAccessWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterAccessWhitelistRequest self = new DescribeDBClusterAccessWhitelistRequest();
        return TeaModel.build(map, self);
    }

}
