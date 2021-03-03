// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeDomainAdvanceConfigsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainConfigs")
    public java.util.List<DescribeDomainAdvanceConfigsResponseBodyDomainConfigs> domainConfigs;

    public static DescribeDomainAdvanceConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainAdvanceConfigsResponseBody self = new DescribeDomainAdvanceConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainAdvanceConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainAdvanceConfigsResponseBody setDomainConfigs(java.util.List<DescribeDomainAdvanceConfigsResponseBodyDomainConfigs> domainConfigs) {
        this.domainConfigs = domainConfigs;
        return this;
    }
    public java.util.List<DescribeDomainAdvanceConfigsResponseBodyDomainConfigs> getDomainConfigs() {
        return this.domainConfigs;
    }

    public static class DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile extends TeaModel {
        @NameInMap("Http2Port")
        public String http2Port;

        @NameInMap("Ipv6Status")
        public Integer ipv6Status;

        @NameInMap("HttpPort")
        public String httpPort;

        @NameInMap("GSLBStatus")
        public String GSLBStatus;

        @NameInMap("Rs")
        public String rs;

        @NameInMap("VipServiceStatus")
        public Integer vipServiceStatus;

        @NameInMap("ClusterType")
        public Integer clusterType;

        @NameInMap("ExclusiveVipStatus")
        public Integer exclusiveVipStatus;

        @NameInMap("Cname")
        public String cname;

        @NameInMap("CertStatus")
        public Integer certStatus;

        @NameInMap("HttpsPort")
        public String httpsPort;

        @NameInMap("ResolvedType")
        public Integer resolvedType;

        public static DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile self = new DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile();
            return TeaModel.build(map, self);
        }

        public DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile setHttp2Port(String http2Port) {
            this.http2Port = http2Port;
            return this;
        }
        public String getHttp2Port() {
            return this.http2Port;
        }

        public DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile setIpv6Status(Integer ipv6Status) {
            this.ipv6Status = ipv6Status;
            return this;
        }
        public Integer getIpv6Status() {
            return this.ipv6Status;
        }

        public DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile setHttpPort(String httpPort) {
            this.httpPort = httpPort;
            return this;
        }
        public String getHttpPort() {
            return this.httpPort;
        }

        public DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile setGSLBStatus(String GSLBStatus) {
            this.GSLBStatus = GSLBStatus;
            return this;
        }
        public String getGSLBStatus() {
            return this.GSLBStatus;
        }

        public DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile setRs(String rs) {
            this.rs = rs;
            return this;
        }
        public String getRs() {
            return this.rs;
        }

        public DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile setVipServiceStatus(Integer vipServiceStatus) {
            this.vipServiceStatus = vipServiceStatus;
            return this;
        }
        public Integer getVipServiceStatus() {
            return this.vipServiceStatus;
        }

        public DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile setClusterType(Integer clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public Integer getClusterType() {
            return this.clusterType;
        }

        public DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile setExclusiveVipStatus(Integer exclusiveVipStatus) {
            this.exclusiveVipStatus = exclusiveVipStatus;
            return this;
        }
        public Integer getExclusiveVipStatus() {
            return this.exclusiveVipStatus;
        }

        public DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile setCertStatus(Integer certStatus) {
            this.certStatus = certStatus;
            return this;
        }
        public Integer getCertStatus() {
            return this.certStatus;
        }

        public DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile setHttpsPort(String httpsPort) {
            this.httpsPort = httpsPort;
            return this;
        }
        public String getHttpsPort() {
            return this.httpsPort;
        }

        public DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile setResolvedType(Integer resolvedType) {
            this.resolvedType = resolvedType;
            return this;
        }
        public Integer getResolvedType() {
            return this.resolvedType;
        }

    }

    public static class DescribeDomainAdvanceConfigsResponseBodyDomainConfigs extends TeaModel {
        @NameInMap("Profile")
        public DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile profile;

        @NameInMap("Domain")
        public String domain;

        public static DescribeDomainAdvanceConfigsResponseBodyDomainConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainAdvanceConfigsResponseBodyDomainConfigs self = new DescribeDomainAdvanceConfigsResponseBodyDomainConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeDomainAdvanceConfigsResponseBodyDomainConfigs setProfile(DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile profile) {
            this.profile = profile;
            return this;
        }
        public DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile getProfile() {
            return this.profile;
        }

        public DescribeDomainAdvanceConfigsResponseBodyDomainConfigs setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

    }

}
