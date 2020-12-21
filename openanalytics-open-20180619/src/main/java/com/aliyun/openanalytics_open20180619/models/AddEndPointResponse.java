// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class AddEndPointResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("EndPointInfo")
    @Validation(required = true)
    public AddEndPointResponseEndPointInfo endPointInfo;

    public static AddEndPointResponse build(java.util.Map<String, ?> map) throws Exception {
        AddEndPointResponse self = new AddEndPointResponse();
        return TeaModel.build(map, self);
    }

    public AddEndPointResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddEndPointResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddEndPointResponse setEndPointInfo(AddEndPointResponseEndPointInfo endPointInfo) {
        this.endPointInfo = endPointInfo;
        return this;
    }
    public AddEndPointResponseEndPointInfo getEndPointInfo() {
        return this.endPointInfo;
    }

    public static class AddEndPointResponseEndPointInfo extends TeaModel {
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

        @NameInMap("endPointID")
        @Validation(required = true)
        public String endPointID;

        @NameInMap("status")
        @Validation(required = true)
        public String status;

        @NameInMap("product")
        @Validation(required = true)
        public String product;

        public static AddEndPointResponseEndPointInfo build(java.util.Map<String, ?> map) throws Exception {
            AddEndPointResponseEndPointInfo self = new AddEndPointResponseEndPointInfo();
            return TeaModel.build(map, self);
        }

        public AddEndPointResponseEndPointInfo setDomainURL(String domainURL) {
            this.domainURL = domainURL;
            return this;
        }
        public String getDomainURL() {
            return this.domainURL;
        }

        public AddEndPointResponseEndPointInfo setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public AddEndPointResponseEndPointInfo setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public AddEndPointResponseEndPointInfo setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public AddEndPointResponseEndPointInfo setVpcID(String vpcID) {
            this.vpcID = vpcID;
            return this;
        }
        public String getVpcID() {
            return this.vpcID;
        }

        public AddEndPointResponseEndPointInfo setVSwitch(String vSwitch) {
            this.vSwitch = vSwitch;
            return this;
        }
        public String getVSwitch() {
            return this.vSwitch;
        }

        public AddEndPointResponseEndPointInfo setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public AddEndPointResponseEndPointInfo setAllowIP(String allowIP) {
            this.allowIP = allowIP;
            return this;
        }
        public String getAllowIP() {
            return this.allowIP;
        }

        public AddEndPointResponseEndPointInfo setEndPointID(String endPointID) {
            this.endPointID = endPointID;
            return this;
        }
        public String getEndPointID() {
            return this.endPointID;
        }

        public AddEndPointResponseEndPointInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public AddEndPointResponseEndPointInfo setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

    }

}
