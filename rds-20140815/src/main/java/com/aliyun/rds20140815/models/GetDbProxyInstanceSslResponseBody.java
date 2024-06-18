// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class GetDbProxyInstanceSslResponseBody extends TeaModel {
    /**
     * <p>An array that consists of SSL encryption settings.</p>
     */
    @NameInMap("DbProxyCertListItems")
    public GetDbProxyInstanceSslResponseBodyDbProxyCertListItems dbProxyCertListItems;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D330E60C-8AAA-4D63-8F64-5B78F4692F98</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDbProxyInstanceSslResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDbProxyInstanceSslResponseBody self = new GetDbProxyInstanceSslResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDbProxyInstanceSslResponseBody setDbProxyCertListItems(GetDbProxyInstanceSslResponseBodyDbProxyCertListItems dbProxyCertListItems) {
        this.dbProxyCertListItems = dbProxyCertListItems;
        return this;
    }
    public GetDbProxyInstanceSslResponseBodyDbProxyCertListItems getDbProxyCertListItems() {
        return this.dbProxyCertListItems;
    }

    public GetDbProxyInstanceSslResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDbProxyInstanceSslResponseBodyDbProxyCertListItemsDbProxyCertListItems extends TeaModel {
        /**
         * <p>The dedicated proxy endpoint for which SSL encryption is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>test1234.rwlb.rds.aliyuncs.com</p>
         */
        @NameInMap("CertCommonName")
        public String certCommonName;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-t4n3axxxxx</p>
         */
        @NameInMap("DbInstanceName")
        public String dbInstanceName;

        /**
         * <p>The ID of the dedicated proxy endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>buxxxxxxx</p>
         */
        @NameInMap("EndpointName")
        public String endpointName;

        /**
         * <p>The default identifier of the dedicated proxy endpoint. The value is fixed as <strong>RWSplit</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>RWSplit</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        /**
         * <p>The time at which the certificate expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-16T08:43:20Z</p>
         */
        @NameInMap("SslExpiredTime")
        public String sslExpiredTime;

        public static GetDbProxyInstanceSslResponseBodyDbProxyCertListItemsDbProxyCertListItems build(java.util.Map<String, ?> map) throws Exception {
            GetDbProxyInstanceSslResponseBodyDbProxyCertListItemsDbProxyCertListItems self = new GetDbProxyInstanceSslResponseBodyDbProxyCertListItemsDbProxyCertListItems();
            return TeaModel.build(map, self);
        }

        public GetDbProxyInstanceSslResponseBodyDbProxyCertListItemsDbProxyCertListItems setCertCommonName(String certCommonName) {
            this.certCommonName = certCommonName;
            return this;
        }
        public String getCertCommonName() {
            return this.certCommonName;
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
