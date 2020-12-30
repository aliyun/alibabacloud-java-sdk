// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class GetEndPointByDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EndPointInfo")
    public GetEndPointByDomainResponseBodyEndPointInfo endPointInfo;

    @NameInMap("RegionId")
    public String regionId;

    public static GetEndPointByDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEndPointByDomainResponseBody self = new GetEndPointByDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEndPointByDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEndPointByDomainResponseBody setEndPointInfo(GetEndPointByDomainResponseBodyEndPointInfo endPointInfo) {
        this.endPointInfo = endPointInfo;
        return this;
    }
    public GetEndPointByDomainResponseBodyEndPointInfo getEndPointInfo() {
        return this.endPointInfo;
    }

    public GetEndPointByDomainResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class GetEndPointByDomainResponseBodyEndPointInfo extends TeaModel {
        @NameInMap("product")
        public String product;

        @NameInMap("cloudInstanceID")
        public String cloudInstanceID;

        @NameInMap("zone")
        public String zone;

        @NameInMap("domainURL")
        public String domainURL;

        @NameInMap("vSwitch")
        public String vSwitch;

        @NameInMap("host")
        public String host;

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

        public static GetEndPointByDomainResponseBodyEndPointInfo build(java.util.Map<String, ?> map) throws Exception {
            GetEndPointByDomainResponseBodyEndPointInfo self = new GetEndPointByDomainResponseBodyEndPointInfo();
            return TeaModel.build(map, self);
        }

        public GetEndPointByDomainResponseBodyEndPointInfo setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public GetEndPointByDomainResponseBodyEndPointInfo setCloudInstanceID(String cloudInstanceID) {
            this.cloudInstanceID = cloudInstanceID;
            return this;
        }
        public String getCloudInstanceID() {
            return this.cloudInstanceID;
        }

        public GetEndPointByDomainResponseBodyEndPointInfo setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public GetEndPointByDomainResponseBodyEndPointInfo setDomainURL(String domainURL) {
            this.domainURL = domainURL;
            return this;
        }
        public String getDomainURL() {
            return this.domainURL;
        }

        public GetEndPointByDomainResponseBodyEndPointInfo setVSwitch(String vSwitch) {
            this.vSwitch = vSwitch;
            return this;
        }
        public String getVSwitch() {
            return this.vSwitch;
        }

        public GetEndPointByDomainResponseBodyEndPointInfo setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetEndPointByDomainResponseBodyEndPointInfo setAllowIP(String allowIP) {
            this.allowIP = allowIP;
            return this;
        }
        public String getAllowIP() {
            return this.allowIP;
        }

        public GetEndPointByDomainResponseBodyEndPointInfo setVpcID(String vpcID) {
            this.vpcID = vpcID;
            return this;
        }
        public String getVpcID() {
            return this.vpcID;
        }

        public GetEndPointByDomainResponseBodyEndPointInfo setEndPointID(String endPointID) {
            this.endPointID = endPointID;
            return this;
        }
        public String getEndPointID() {
            return this.endPointID;
        }

        public GetEndPointByDomainResponseBodyEndPointInfo setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public GetEndPointByDomainResponseBodyEndPointInfo setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

}
