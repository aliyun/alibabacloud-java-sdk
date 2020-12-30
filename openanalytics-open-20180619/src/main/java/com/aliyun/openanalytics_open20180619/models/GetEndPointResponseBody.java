// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class GetEndPointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EndPointInfo")
    public GetEndPointResponseBodyEndPointInfo endPointInfo;

    @NameInMap("RegionId")
    public String regionId;

    public static GetEndPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEndPointResponseBody self = new GetEndPointResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEndPointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEndPointResponseBody setEndPointInfo(GetEndPointResponseBodyEndPointInfo endPointInfo) {
        this.endPointInfo = endPointInfo;
        return this;
    }
    public GetEndPointResponseBodyEndPointInfo getEndPointInfo() {
        return this.endPointInfo;
    }

    public GetEndPointResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class GetEndPointResponseBodyEndPointInfo extends TeaModel {
        @NameInMap("product")
        public String product;

        @NameInMap("zone")
        public String zone;

        @NameInMap("domainURL")
        public String domainURL;

        @NameInMap("vSwitch")
        public String vSwitch;

        @NameInMap("host")
        public String host;

        @NameInMap("status")
        public String status;

        @NameInMap("allowIP")
        public String allowIP;

        @NameInMap("vpcID")
        public String vpcID;

        @NameInMap("endPointID")
        public String endPointID;

        @NameInMap("networkType")
        public String networkType;

        @NameInMap("port")
        public String port;

        public static GetEndPointResponseBodyEndPointInfo build(java.util.Map<String, ?> map) throws Exception {
            GetEndPointResponseBodyEndPointInfo self = new GetEndPointResponseBodyEndPointInfo();
            return TeaModel.build(map, self);
        }

        public GetEndPointResponseBodyEndPointInfo setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public GetEndPointResponseBodyEndPointInfo setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public GetEndPointResponseBodyEndPointInfo setDomainURL(String domainURL) {
            this.domainURL = domainURL;
            return this;
        }
        public String getDomainURL() {
            return this.domainURL;
        }

        public GetEndPointResponseBodyEndPointInfo setVSwitch(String vSwitch) {
            this.vSwitch = vSwitch;
            return this;
        }
        public String getVSwitch() {
            return this.vSwitch;
        }

        public GetEndPointResponseBodyEndPointInfo setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetEndPointResponseBodyEndPointInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetEndPointResponseBodyEndPointInfo setAllowIP(String allowIP) {
            this.allowIP = allowIP;
            return this;
        }
        public String getAllowIP() {
            return this.allowIP;
        }

        public GetEndPointResponseBodyEndPointInfo setVpcID(String vpcID) {
            this.vpcID = vpcID;
            return this;
        }
        public String getVpcID() {
            return this.vpcID;
        }

        public GetEndPointResponseBodyEndPointInfo setEndPointID(String endPointID) {
            this.endPointID = endPointID;
            return this;
        }
        public String getEndPointID() {
            return this.endPointID;
        }

        public GetEndPointResponseBodyEndPointInfo setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public GetEndPointResponseBodyEndPointInfo setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

}
