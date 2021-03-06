// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class GetDbProxyInstanceSslResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DbProxyCertListItems")
    public GetDbProxyInstanceSslResponseBodyDbProxyCertListItems dbProxyCertListItems;

    public static GetDbProxyInstanceSslResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDbProxyInstanceSslResponseBody self = new GetDbProxyInstanceSslResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDbProxyInstanceSslResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDbProxyInstanceSslResponseBody setDbProxyCertListItems(GetDbProxyInstanceSslResponseBodyDbProxyCertListItems dbProxyCertListItems) {
        this.dbProxyCertListItems = dbProxyCertListItems;
        return this;
    }
    public GetDbProxyInstanceSslResponseBodyDbProxyCertListItems getDbProxyCertListItems() {
        return this.dbProxyCertListItems;
    }

    public static class GetDbProxyInstanceSslResponseBodyDbProxyCertListItemsDbProxyCertListItems extends TeaModel {
        @NameInMap("DbInstanceName")
        public String dbInstanceName;

        @NameInMap("EndpointName")
        public String endpointName;

        @NameInMap("EndpointType")
        public String endpointType;

        @NameInMap("SslExpiredTime")
        public String sslExpiredTime;

        @NameInMap("CertCommonName")
        public String certCommonName;

        public static GetDbProxyInstanceSslResponseBodyDbProxyCertListItemsDbProxyCertListItems build(java.util.Map<String, ?> map) throws Exception {
            GetDbProxyInstanceSslResponseBodyDbProxyCertListItemsDbProxyCertListItems self = new GetDbProxyInstanceSslResponseBodyDbProxyCertListItemsDbProxyCertListItems();
            return TeaModel.build(map, self);
        }

        public GetDbProxyInstanceSslResponseBodyDbProxyCertListItemsDbProxyCertListItems setDbInstanceName(String dbInstanceName) {
            this.dbInstanceName = dbInstanceName;
            return this;
        }
        public String getDbInstanceName() {
            return this.dbInstanceName;
        }

        public GetDbProxyInstanceSslResponseBodyDbProxyCertListItemsDbProxyCertListItems setEndpointName(String endpointName) {
            this.endpointName = endpointName;
            return this;
        }
        public String getEndpointName() {
            return this.endpointName;
        }

        public GetDbProxyInstanceSslResponseBodyDbProxyCertListItemsDbProxyCertListItems setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public GetDbProxyInstanceSslResponseBodyDbProxyCertListItemsDbProxyCertListItems setSslExpiredTime(String sslExpiredTime) {
            this.sslExpiredTime = sslExpiredTime;
            return this;
        }
        public String getSslExpiredTime() {
            return this.sslExpiredTime;
        }

        public GetDbProxyInstanceSslResponseBodyDbProxyCertListItemsDbProxyCertListItems setCertCommonName(String certCommonName) {
            this.certCommonName = certCommonName;
            return this;
        }
        public String getCertCommonName() {
            return this.certCommonName;
        }

    }

    public static class GetDbProxyInstanceSslResponseBodyDbProxyCertListItems extends TeaModel {
        @NameInMap("DbProxyCertListItems")
        public java.util.List<GetDbProxyInstanceSslResponseBodyDbProxyCertListItemsDbProxyCertListItems> dbProxyCertListItems;

        public static GetDbProxyInstanceSslResponseBodyDbProxyCertListItems build(java.util.Map<String, ?> map) throws Exception {
            GetDbProxyInstanceSslResponseBodyDbProxyCertListItems self = new GetDbProxyInstanceSslResponseBodyDbProxyCertListItems();
            return TeaModel.build(map, self);
        }

        public GetDbProxyInstanceSslResponseBodyDbProxyCertListItems setDbProxyCertListItems(java.util.List<GetDbProxyInstanceSslResponseBodyDbProxyCertListItemsDbProxyCertListItems> dbProxyCertListItems) {
            this.dbProxyCertListItems = dbProxyCertListItems;
            return this;
        }
        public java.util.List<GetDbProxyInstanceSslResponseBodyDbProxyCertListItemsDbProxyCertListItems> getDbProxyCertListItems() {
            return this.dbProxyCertListItems;
        }

    }

}
