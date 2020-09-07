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

    public DescribeDBProxyEndpointResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBProxyEndpointResponse setDBProxyEndpointId(String DBProxyEndpointId) {
        this.DBProxyEndpointId = DBProxyEndpointId;
        return this;
    }
    public String getDBProxyEndpointId() {
        return this.DBProxyEndpointId;
    }

    public DescribeDBProxyEndpointResponse setDBProxyConnectString(String DBProxyConnectString) {
        this.DBProxyConnectString = DBProxyConnectString;
        return this;
    }
    public String getDBProxyConnectString() {
        return this.DBProxyConnectString;
    }

    public DescribeDBProxyEndpointResponse setDBProxyConnectStringPort(String DBProxyConnectStringPort) {
        this.DBProxyConnectStringPort = DBProxyConnectStringPort;
        return this;
    }
    public String getDBProxyConnectStringPort() {
        return this.DBProxyConnectStringPort;
    }

    public DescribeDBProxyEndpointResponse setDBProxyConnectStringNetType(String DBProxyConnectStringNetType) {
        this.DBProxyConnectStringNetType = DBProxyConnectStringNetType;
        return this;
    }
    public String getDBProxyConnectStringNetType() {
        return this.DBProxyConnectStringNetType;
    }

    public DescribeDBProxyEndpointResponse setDBProxyFeatures(String DBProxyFeatures) {
        this.DBProxyFeatures = DBProxyFeatures;
        return this;
    }
    public String getDBProxyFeatures() {
        return this.DBProxyFeatures;
    }

    public DescribeDBProxyEndpointResponse setReadOnlyInstanceMaxDelayTime(String readOnlyInstanceMaxDelayTime) {
        this.readOnlyInstanceMaxDelayTime = readOnlyInstanceMaxDelayTime;
        return this;
    }
    public String getReadOnlyInstanceMaxDelayTime() {
        return this.readOnlyInstanceMaxDelayTime;
    }

    public DescribeDBProxyEndpointResponse setReadOnlyInstanceDistributionType(String readOnlyInstanceDistributionType) {
        this.readOnlyInstanceDistributionType = readOnlyInstanceDistributionType;
        return this;
    }
    public String getReadOnlyInstanceDistributionType() {
        return this.readOnlyInstanceDistributionType;
    }

    public DescribeDBProxyEndpointResponse setReadOnlyInstanceWeight(String readOnlyInstanceWeight) {
        this.readOnlyInstanceWeight = readOnlyInstanceWeight;
        return this;
    }
    public String getReadOnlyInstanceWeight() {
        return this.readOnlyInstanceWeight;
    }

}
