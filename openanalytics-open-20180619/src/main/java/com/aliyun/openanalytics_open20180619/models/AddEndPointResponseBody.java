// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class AddEndPointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EndPointInfo")
    public AddEndPointResponseBodyEndPointInfo endPointInfo;

    @NameInMap("RegionId")
    public String regionId;

    public static AddEndPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddEndPointResponseBody self = new AddEndPointResponseBody();
        return TeaModel.build(map, self);
    }

    public AddEndPointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddEndPointResponseBody setEndPointInfo(AddEndPointResponseBodyEndPointInfo endPointInfo) {
        this.endPointInfo = endPointInfo;
        return this;
    }
    public AddEndPointResponseBodyEndPointInfo getEndPointInfo() {
        return this.endPointInfo;
    }

    public AddEndPointResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class AddEndPointResponseBodyEndPointInfo extends TeaModel {
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

        @NameInMap("endPointID")
        public String endPointID;

        @NameInMap("allowIP")
        public String allowIP;

        @NameInMap("vpcID")
        public String vpcID;

        @NameInMap("networkType")
        public String networkType;

        @NameInMap("port")
        public String port;

        public static AddEndPointResponseBodyEndPointInfo build(java.util.Map<String, ?> map) throws Exception {
            AddEndPointResponseBodyEndPointInfo self = new AddEndPointResponseBodyEndPointInfo();
            return TeaModel.build(map, self);
        }

        public AddEndPointResponseBodyEndPointInfo setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public AddEndPointResponseBodyEndPointInfo setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public AddEndPointResponseBodyEndPointInfo setDomainURL(String domainURL) {
            this.domainURL = domainURL;
            return this;
        }
        public String getDomainURL() {
            return this.domainURL;
        }

        public AddEndPointResponseBodyEndPointInfo setVSwitch(String vSwitch) {
            this.vSwitch = vSwitch;
            return this;
        }
        public String getVSwitch() {
            return this.vSwitch;
        }

        public AddEndPointResponseBodyEndPointInfo setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public AddEndPointResponseBodyEndPointInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public AddEndPointResponseBodyEndPointInfo setEndPointID(String endPointID) {
            this.endPointID = endPointID;
            return this;
        }
        public String getEndPointID() {
            return this.endPointID;
        }

        public AddEndPointResponseBodyEndPointInfo setAllowIP(String allowIP) {
            this.allowIP = allowIP;
            return this;
        }
        public String getAllowIP() {
            return this.allowIP;
        }

        public AddEndPointResponseBodyEndPointInfo setVpcID(String vpcID) {
            this.vpcID = vpcID;
            return this;
        }
        public String getVpcID() {
            return this.vpcID;
        }

        public AddEndPointResponseBodyEndPointInfo setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public AddEndPointResponseBodyEndPointInfo setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

}
