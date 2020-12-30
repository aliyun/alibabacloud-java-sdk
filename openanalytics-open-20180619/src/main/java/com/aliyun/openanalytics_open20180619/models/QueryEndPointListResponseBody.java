// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class QueryEndPointListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EndPointList")
    public java.util.List<QueryEndPointListResponseBodyEndPointList> endPointList;

    @NameInMap("RegionId")
    public String regionId;

    public static QueryEndPointListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEndPointListResponseBody self = new QueryEndPointListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEndPointListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEndPointListResponseBody setEndPointList(java.util.List<QueryEndPointListResponseBodyEndPointList> endPointList) {
        this.endPointList = endPointList;
        return this;
    }
    public java.util.List<QueryEndPointListResponseBodyEndPointList> getEndPointList() {
        return this.endPointList;
    }

    public QueryEndPointListResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class QueryEndPointListResponseBodyEndPointList extends TeaModel {
        @NameInMap("product")
        public String product;

        @NameInMap("domainURL")
        public String domainURL;

        @NameInMap("zone")
        public String zone;

        @NameInMap("vSwitch")
        public String vSwitch;

        @NameInMap("host")
        public String host;

        @NameInMap("allowIP")
        public String allowIP;

        @NameInMap("vpcID")
        public String vpcID;

        @NameInMap("status")
        public String status;

        @NameInMap("endPointID")
        public String endPointID;

        @NameInMap("networkType")
        public String networkType;

        @NameInMap("port")
        public String port;

        public static QueryEndPointListResponseBodyEndPointList build(java.util.Map<String, ?> map) throws Exception {
            QueryEndPointListResponseBodyEndPointList self = new QueryEndPointListResponseBodyEndPointList();
            return TeaModel.build(map, self);
        }

        public QueryEndPointListResponseBodyEndPointList setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public QueryEndPointListResponseBodyEndPointList setDomainURL(String domainURL) {
            this.domainURL = domainURL;
            return this;
        }
        public String getDomainURL() {
            return this.domainURL;
        }

        public QueryEndPointListResponseBodyEndPointList setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public QueryEndPointListResponseBodyEndPointList setVSwitch(String vSwitch) {
            this.vSwitch = vSwitch;
            return this;
        }
        public String getVSwitch() {
            return this.vSwitch;
        }

        public QueryEndPointListResponseBodyEndPointList setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public QueryEndPointListResponseBodyEndPointList setAllowIP(String allowIP) {
            this.allowIP = allowIP;
            return this;
        }
        public String getAllowIP() {
            return this.allowIP;
        }

        public QueryEndPointListResponseBodyEndPointList setVpcID(String vpcID) {
            this.vpcID = vpcID;
            return this;
        }
        public String getVpcID() {
            return this.vpcID;
        }

        public QueryEndPointListResponseBodyEndPointList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryEndPointListResponseBodyEndPointList setEndPointID(String endPointID) {
            this.endPointID = endPointID;
            return this;
        }
        public String getEndPointID() {
            return this.endPointID;
        }

        public QueryEndPointListResponseBodyEndPointList setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public QueryEndPointListResponseBodyEndPointList setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

}
