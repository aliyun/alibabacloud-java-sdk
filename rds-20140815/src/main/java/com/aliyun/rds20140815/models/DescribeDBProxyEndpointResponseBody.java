// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBProxyEndpointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBProxyEndpointId")
    public String DBProxyEndpointId;

    @NameInMap("DBProxyConnectString")
    public String DBProxyConnectString;

    @NameInMap("DBProxyConnectStringPort")
    public String DBProxyConnectStringPort;

    @NameInMap("DBProxyConnectStringNetType")
    public String DBProxyConnectStringNetType;

    @NameInMap("DBProxyFeatures")
    public String DBProxyFeatures;

    @NameInMap("ReadOnlyInstanceMaxDelayTime")
    public String readOnlyInstanceMaxDelayTime;

    @NameInMap("ReadOnlyInstanceDistributionType")
    public String readOnlyInstanceDistributionType;

    @NameInMap("ReadOnlyInstanceWeight")
    public String readOnlyInstanceWeight;

    public static DescribeDBProxyEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBProxyEndpointResponseBody self = new DescribeDBProxyEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBProxyEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBProxyEndpointResponseBody setDBProxyEndpointId(String DBProxyEndpointId) {
        this.DBProxyEndpointId = DBProxyEndpointId;
        return this;
    }
    public String getDBProxyEndpointId() {
        return this.DBProxyEndpointId;
    }

    public DescribeDBProxyEndpointResponseBody setDBProxyConnectString(String DBProxyConnectString) {
        this.DBProxyConnectString = DBProxyConnectString;
        return this;
    }
    public String getDBProxyConnectString() {
        return this.DBProxyConnectString;
    }

    public DescribeDBProxyEndpointResponseBody setDBProxyConnectStringPort(String DBProxyConnectStringPort) {
        this.DBProxyConnectStringPort = DBProxyConnectStringPort;
        return this;
    }
    public String getDBProxyConnectStringPort() {
        return this.DBProxyConnectStringPort;
    }

    public DescribeDBProxyEndpointResponseBody setDBProxyConnectStringNetType(String DBProxyConnectStringNetType) {
        this.DBProxyConnectStringNetType = DBProxyConnectStringNetType;
        return this;
    }
    public String getDBProxyConnectStringNetType() {
        return this.DBProxyConnectStringNetType;
    }

    public DescribeDBProxyEndpointResponseBody setDBProxyFeatures(String DBProxyFeatures) {
        this.DBProxyFeatures = DBProxyFeatures;
        return this;
    }
    public String getDBProxyFeatures() {
        return this.DBProxyFeatures;
    }

    public DescribeDBProxyEndpointResponseBody setReadOnlyInstanceMaxDelayTime(String readOnlyInstanceMaxDelayTime) {
        this.readOnlyInstanceMaxDelayTime = readOnlyInstanceMaxDelayTime;
        return this;
    }
    public String getReadOnlyInstanceMaxDelayTime() {
        return this.readOnlyInstanceMaxDelayTime;
    }

    public DescribeDBProxyEndpointResponseBody setReadOnlyInstanceDistributionType(String readOnlyInstanceDistributionType) {
        this.readOnlyInstanceDistributionType = readOnlyInstanceDistributionType;
        return this;
    }
    public String getReadOnlyInstanceDistributionType() {
        return this.readOnlyInstanceDistributionType;
    }

    public DescribeDBProxyEndpointResponseBody setReadOnlyInstanceWeight(String readOnlyInstanceWeight) {
        this.readOnlyInstanceWeight = readOnlyInstanceWeight;
        return this;
    }
    public String getReadOnlyInstanceWeight() {
        return this.readOnlyInstanceWeight;
    }

}
