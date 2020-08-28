// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterSSLResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Items")
    @Validation(required = true)
    public java.util.List<DescribeDBClusterSSLResponseItems> items;

    public static DescribeDBClusterSSLResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterSSLResponse self = new DescribeDBClusterSSLResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDBClusterSSLResponseItems extends TeaModel {
        @NameInMap("DBEndpointId")
        @Validation(required = true)
        public String DBEndpointId;

        @NameInMap("SSLEnabled")
        @Validation(required = true)
        public String SSLEnabled;

        @NameInMap("SSLConnectionString")
        @Validation(required = true)
        public String SSLConnectionString;

        @NameInMap("SSLExpireTime")
        @Validation(required = true)
        public String SSLExpireTime;

        public static DescribeDBClusterSSLResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterSSLResponseItems self = new DescribeDBClusterSSLResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
