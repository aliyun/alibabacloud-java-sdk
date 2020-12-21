// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class GetEndPointResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("EndPointInfo")
    @Validation(required = true)
    public GetEndPointResponseEndPointInfo endPointInfo;

    public static GetEndPointResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEndPointResponse self = new GetEndPointResponse();
        return TeaModel.build(map, self);
    }

    public GetEndPointResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEndPointResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetEndPointResponse setEndPointInfo(GetEndPointResponseEndPointInfo endPointInfo) {
        this.endPointInfo = endPointInfo;
        return this;
    }
    public GetEndPointResponseEndPointInfo getEndPointInfo() {
        return this.endPointInfo;
    }

    public static class GetEndPointResponseEndPointInfo extends TeaModel {
        @NameInMap("endPointID")
        @Validation(required = true)
        public String endPointID;

        @NameInMap("domainURL")
        @Validation(required = true)
        public String domainURL;

        @NameInMap("host")
        @Validation(required = true)
        public String host;

        @NameInMap("port")
        @Validation(required = true)
        public String port;

        @NameInMap("networkType")
        @Validation(required = true)
        public String networkType;

        @NameInMap("vpcID")
        @Validation(required = true)
        public String vpcID;

        @NameInMap("vSwitch")
        @Validation(required = true)
        public String vSwitch;

        @NameInMap("zone")
        @Validation(required = true)
        public String zone;

        @NameInMap("allowIP")
        @Validation(required = true)
        public String allowIP;

        @NameInMap("status")
        @Validation(required = true)
        public String status;

        @NameInMap("product")
        @Validation(required = true)
        public String product;

        public static GetEndPointResponseEndPointInfo build(java.util.Map<String, ?> map) throws Exception {
            GetEndPointResponseEndPointInfo self = new GetEndPointResponseEndPointInfo();
            return TeaModel.build(map, self);
        }

        public GetEndPointResponseEndPointInfo setEndPointID(String endPointID) {
            this.endPointID = endPointID;
            return this;
        }
        public String getEndPointID() {
            return this.endPointID;
        }

        public GetEndPointResponseEndPointInfo setDomainURL(String domainURL) {
            this.domainURL = domainURL;
            return this;
        }
        public String getDomainURL() {
            return this.domainURL;
        }

        public GetEndPointResponseEndPointInfo setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetEndPointResponseEndPointInfo setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public GetEndPointResponseEndPointInfo setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public GetEndPointResponseEndPointInfo setVpcID(String vpcID) {
            this.vpcID = vpcID;
            return this;
        }
        public String getVpcID() {
            return this.vpcID;
        }

        public GetEndPointResponseEndPointInfo setVSwitch(String vSwitch) {
            this.vSwitch = vSwitch;
            return this;
        }
        public String getVSwitch() {
            return this.vSwitch;
        }

        public GetEndPointResponseEndPointInfo setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public GetEndPointResponseEndPointInfo setAllowIP(String allowIP) {
            this.allowIP = allowIP;
            return this;
        }
        public String getAllowIP() {
            return this.allowIP;
        }

        public GetEndPointResponseEndPointInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetEndPointResponseEndPointInfo setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

    }

}
