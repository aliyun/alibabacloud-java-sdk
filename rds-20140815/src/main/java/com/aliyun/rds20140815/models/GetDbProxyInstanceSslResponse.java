// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class GetDbProxyInstanceSslResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DbProxyCertListItems")
    @Validation(required = true)
    public GetDbProxyInstanceSslResponseDbProxyCertListItems dbProxyCertListItems;

    public static GetDbProxyInstanceSslResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDbProxyInstanceSslResponse self = new GetDbProxyInstanceSslResponse();
        return TeaModel.build(map, self);
    }

    public GetDbProxyInstanceSslResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDbProxyInstanceSslResponse setDbProxyCertListItems(GetDbProxyInstanceSslResponseDbProxyCertListItems dbProxyCertListItems) {
        this.dbProxyCertListItems = dbProxyCertListItems;
        return this;
    }
    public GetDbProxyInstanceSslResponseDbProxyCertListItems getDbProxyCertListItems() {
        return this.dbProxyCertListItems;
    }

    public static class GetDbProxyInstanceSslResponseDbProxyCertListItemsDbProxyCertListItems extends TeaModel {
        @NameInMap("DbInstanceName")
        @Validation(required = true)
        public String dbInstanceName;

        @NameInMap("EndpointName")
        @Validation(required = true)
        public String endpointName;

        @NameInMap("EndpointType")
        @Validation(required = true)
        public String endpointType;

        @NameInMap("CertCommonName")
        @Validation(required = true)
        public String certCommonName;

        @NameInMap("SslExpiredTime")
        @Validation(required = true)
        public String sslExpiredTime;

        public static GetDbProxyInstanceSslResponseDbProxyCertListItemsDbProxyCertListItems build(java.util.Map<String, ?> map) throws Exception {
            GetDbProxyInstanceSslResponseDbProxyCertListItemsDbProxyCertListItems self = new GetDbProxyInstanceSslResponseDbProxyCertListItemsDbProxyCertListItems();
            return TeaModel.build(map, self);
        }

        public GetDbProxyInstanceSslResponseDbProxyCertListItemsDbProxyCertListItems setDbInstanceName(String dbInstanceName) {
            this.dbInstanceName = dbInstanceName;
            return this;
        }
        public String getDbInstanceName() {
            return this.dbInstanceName;
        }

        public GetDbProxyInstanceSslResponseDbProxyCertListItemsDbProxyCertListItems setEndpointName(String endpointName) {
            this.endpointName = endpointName;
            return this;
        }
        public String getEndpointName() {
            return this.endpointName;
        }

        public GetDbProxyInstanceSslResponseDbProxyCertListItemsDbProxyCertListItems setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public GetDbProxyInstanceSslResponseDbProxyCertListItemsDbProxyCertListItems setCertCommonName(String certCommonName) {
            this.certCommonName = certCommonName;
            return this;
        }
        public String getCertCommonName() {
            return this.certCommonName;
        }

        public GetDbProxyInstanceSslResponseDbProxyCertListItemsDbProxyCertListItems setSslExpiredTime(String sslExpiredTime) {
            this.sslExpiredTime = sslExpiredTime;
            return this;
        }
        public String getSslExpiredTime() {
            return this.sslExpiredTime;
        }

    }

    public static class GetDbProxyInstanceSslResponseDbProxyCertListItems extends TeaModel {
        @NameInMap("DbProxyCertListItems")
        @Validation(required = true)
        public java.util.List<GetDbProxyInstanceSslResponseDbProxyCertListItemsDbProxyCertListItems> dbProxyCertListItems;

        public static GetDbProxyInstanceSslResponseDbProxyCertListItems build(java.util.Map<String, ?> map) throws Exception {
            GetDbProxyInstanceSslResponseDbProxyCertListItems self = new GetDbProxyInstanceSslResponseDbProxyCertListItems();
            return TeaModel.build(map, self);
        }

        public GetDbProxyInstanceSslResponseDbProxyCertListItems setDbProxyCertListItems(java.util.List<GetDbProxyInstanceSslResponseDbProxyCertListItemsDbProxyCertListItems> dbProxyCertListItems) {
            this.dbProxyCertListItems = dbProxyCertListItems;
            return this;
        }
        public java.util.List<GetDbProxyInstanceSslResponseDbProxyCertListItemsDbProxyCertListItems> getDbProxyCertListItems() {
            return this.dbProxyCertListItems;
        }

    }

}
