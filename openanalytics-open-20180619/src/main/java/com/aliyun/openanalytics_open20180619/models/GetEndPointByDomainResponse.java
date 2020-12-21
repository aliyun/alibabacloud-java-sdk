// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class GetEndPointByDomainResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("EndPointInfo")
    @Validation(required = true)
    public GetEndPointByDomainResponseEndPointInfo endPointInfo;

    public static GetEndPointByDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEndPointByDomainResponse self = new GetEndPointByDomainResponse();
        return TeaModel.build(map, self);
    }

    public GetEndPointByDomainResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEndPointByDomainResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetEndPointByDomainResponse setEndPointInfo(GetEndPointByDomainResponseEndPointInfo endPointInfo) {
        this.endPointInfo = endPointInfo;
        return this;
    }
    public GetEndPointByDomainResponseEndPointInfo getEndPointInfo() {
        return this.endPointInfo;
    }

    public static class GetEndPointByDomainResponseEndPointInfo extends TeaModel {
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

        @NameInMap("cloudInstanceID")
        @Validation(required = true)
        public String cloudInstanceID;

        @NameInMap("product")
        @Validation(required = true)
        public String product;

        public static GetEndPointByDomainResponseEndPointInfo build(java.util.Map<String, ?> map) throws Exception {
            GetEndPointByDomainResponseEndPointInfo self = new GetEndPointByDomainResponseEndPointInfo();
            return TeaModel.build(map, self);
        }

        public GetEndPointByDomainResponseEndPointInfo setEndPointID(String endPointID) {
            this.endPointID = endPointID;
            return this;
        }
        public String getEndPointID() {
            return this.endPointID;
        }

        public GetEndPointByDomainResponseEndPointInfo setDomainURL(String domainURL) {
            this.domainURL = domainURL;
            return this;
        }
        public String getDomainURL() {
            return this.domainURL;
        }

        public GetEndPointByDomainResponseEndPointInfo setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetEndPointByDomainResponseEndPointInfo setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public GetEndPointByDomainResponseEndPointInfo setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public GetEndPointByDomainResponseEndPointInfo setVpcID(String vpcID) {
            this.vpcID = vpcID;
            return this;
        }
        public String getVpcID() {
            return this.vpcID;
        }

        public GetEndPointByDomainResponseEndPointInfo setVSwitch(String vSwitch) {
            this.vSwitch = vSwitch;
            return this;
        }
        public String getVSwitch() {
            return this.vSwitch;
        }

        public GetEndPointByDomainResponseEndPointInfo setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public GetEndPointByDomainResponseEndPointInfo setAllowIP(String allowIP) {
            this.allowIP = allowIP;
            return this;
        }
        public String getAllowIP() {
            return this.allowIP;
        }

        public GetEndPointByDomainResponseEndPointInfo setCloudInstanceID(String cloudInstanceID) {
            this.cloudInstanceID = cloudInstanceID;
            return this;
        }
        public String getCloudInstanceID() {
            return this.cloudInstanceID;
        }

        public GetEndPointByDomainResponseEndPointInfo setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

    }

}
