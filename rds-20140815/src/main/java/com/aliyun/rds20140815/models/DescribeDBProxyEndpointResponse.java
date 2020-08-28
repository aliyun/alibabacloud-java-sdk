// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBProxyEndpointResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBProxyEndpointId")
    @Validation(required = true)
    public String DBProxyEndpointId;

    @NameInMap("DBProxyConnectString")
    @Validation(required = true)
    public String DBProxyConnectString;

    @NameInMap("DBProxyConnectStringPort")
    @Validation(required = true)
    public String DBProxyConnectStringPort;

    @NameInMap("DBProxyConnectStringNetType")
    @Validation(required = true)
    public String DBProxyConnectStringNetType;

    @NameInMap("DBProxyFeatures")
    @Validation(required = true)
    public String DBProxyFeatures;

    @NameInMap("ReadOnlyInstanceMaxDelayTime")
    @Validation(required = true)
    public String readOnlyInstanceMaxDelayTime;

    @NameInMap("ReadOnlyInstanceDistributionType")
    @Validation(required = true)
    public String readOnlyInstanceDistributionType;

    @NameInMap("ReadOnlyInstanceWeight")
    @Validation(required = true)
    public String readOnlyInstanceWeight;

    public static DescribeDBProxyEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBProxyEndpointResponse self = new DescribeDBProxyEndpointResponse();
        return TeaModel.build(map, self);
    }

}
