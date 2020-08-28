// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBProxyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBProxyServiceStatus")
    @Validation(required = true)
    public String DBProxyServiceStatus;

    @NameInMap("DBProxyInstanceType")
    @Validation(required = true)
    public String DBProxyInstanceType;

    @NameInMap("DBProxyInstanceNum")
    @Validation(required = true)
    public Integer DBProxyInstanceNum;

    @NameInMap("DBProxyInstanceStatus")
    @Validation(required = true)
    public String DBProxyInstanceStatus;

    @NameInMap("DBProxyInstanceCurrentMinorVersion")
    @Validation(required = true)
    public String DBProxyInstanceCurrentMinorVersion;

    @NameInMap("DBProxyInstanceLatestMinorVersion")
    @Validation(required = true)
    public String DBProxyInstanceLatestMinorVersion;

    @NameInMap("DBProxyInstanceName")
    @Validation(required = true)
    public String DBProxyInstanceName;

    @NameInMap("DBProxyConnectStringItems")
    @Validation(required = true)
    public DescribeDBProxyResponseDBProxyConnectStringItems DBProxyConnectStringItems;

    public static DescribeDBProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBProxyResponse self = new DescribeDBProxyResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDBProxyResponseDBProxyConnectStringItemsDBProxyConnectStringItems extends TeaModel {
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

        @NameInMap("DBProxyVpcInstanceId")
        @Validation(required = true)
        public String DBProxyVpcInstanceId;

        @NameInMap("DBProxyEndpointName")
        @Validation(required = true)
        public String DBProxyEndpointName;

        @NameInMap("DBProxyConnectStringNetWorkType")
        @Validation(required = true)
        public String DBProxyConnectStringNetWorkType;

        public static DescribeDBProxyResponseDBProxyConnectStringItemsDBProxyConnectStringItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBProxyResponseDBProxyConnectStringItemsDBProxyConnectStringItems self = new DescribeDBProxyResponseDBProxyConnectStringItemsDBProxyConnectStringItems();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBProxyResponseDBProxyConnectStringItems extends TeaModel {
        @NameInMap("DBProxyConnectStringItems")
        @Validation(required = true)
        public java.util.List<DescribeDBProxyResponseDBProxyConnectStringItemsDBProxyConnectStringItems> DBProxyConnectStringItems;

        public static DescribeDBProxyResponseDBProxyConnectStringItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBProxyResponseDBProxyConnectStringItems self = new DescribeDBProxyResponseDBProxyConnectStringItems();
            return TeaModel.build(map, self);
        }

    }

}
