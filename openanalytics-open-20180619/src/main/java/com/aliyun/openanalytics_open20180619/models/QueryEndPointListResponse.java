// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class QueryEndPointListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("EndPointList")
    @Validation(required = true)
    public java.util.List<QueryEndPointListResponseEndPointList> endPointList;

    public static QueryEndPointListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEndPointListResponse self = new QueryEndPointListResponse();
        return TeaModel.build(map, self);
    }

    public QueryEndPointListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEndPointListResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryEndPointListResponse setEndPointList(java.util.List<QueryEndPointListResponseEndPointList> endPointList) {
        this.endPointList = endPointList;
        return this;
    }
    public java.util.List<QueryEndPointListResponseEndPointList> getEndPointList() {
        return this.endPointList;
    }

    public static class QueryEndPointListResponseEndPointList extends TeaModel {
        @NameInMap("endPointID")
        @Validation(required = true)
        public String endPointID;

        @NameInMap("zone")
        @Validation(required = true)
        public String zone;

        @NameInMap("vSwitch")
        @Validation(required = true)
        public String vSwitch;

        @NameInMap("status")
        @Validation(required = true)
        public String status;

        @NameInMap("vpcID")
        @Validation(required = true)
        public String vpcID;

        @NameInMap("host")
        @Validation(required = true)
        public String host;

        @NameInMap("domainURL")
        @Validation(required = true)
        public String domainURL;

        @NameInMap("networkType")
        @Validation(required = true)
        public String networkType;

        @NameInMap("allowIP")
        @Validation(required = true)
        public String allowIP;

        @NameInMap("port")
        @Validation(required = true)
        public String port;

        @NameInMap("product")
        @Validation(required = true)
        public String product;

        public static QueryEndPointListResponseEndPointList build(java.util.Map<String, ?> map) throws Exception {
            QueryEndPointListResponseEndPointList self = new QueryEndPointListResponseEndPointList();
            return TeaModel.build(map, self);
        }

        public QueryEndPointListResponseEndPointList setEndPointID(String endPointID) {
            this.endPointID = endPointID;
            return this;
        }
        public String getEndPointID() {
            return this.endPointID;
        }

        public QueryEndPointListResponseEndPointList setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public QueryEndPointListResponseEndPointList setVSwitch(String vSwitch) {
            this.vSwitch = vSwitch;
            return this;
        }
        public String getVSwitch() {
            return this.vSwitch;
        }

        public QueryEndPointListResponseEndPointList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryEndPointListResponseEndPointList setVpcID(String vpcID) {
            this.vpcID = vpcID;
            return this;
        }
        public String getVpcID() {
            return this.vpcID;
        }

        public QueryEndPointListResponseEndPointList setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public QueryEndPointListResponseEndPointList setDomainURL(String domainURL) {
            this.domainURL = domainURL;
            return this;
        }
        public String getDomainURL() {
            return this.domainURL;
        }

        public QueryEndPointListResponseEndPointList setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public QueryEndPointListResponseEndPointList setAllowIP(String allowIP) {
            this.allowIP = allowIP;
            return this;
        }
        public String getAllowIP() {
            return this.allowIP;
        }

        public QueryEndPointListResponseEndPointList setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public QueryEndPointListResponseEndPointList setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

    }

}
