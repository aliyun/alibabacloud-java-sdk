// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeDomainAdvanceConfigsResponseBody extends TeaModel {
    @NameInMap("DomainConfigs")
    public java.util.List<DescribeDomainAdvanceConfigsResponseBodyDomainConfigs> domainConfigs;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainAdvanceConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainAdvanceConfigsResponseBody self = new DescribeDomainAdvanceConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainAdvanceConfigsResponseBody setDomainConfigs(java.util.List<DescribeDomainAdvanceConfigsResponseBodyDomainConfigs> domainConfigs) {
        this.domainConfigs = domainConfigs;
        return this;
    }
    public java.util.List<DescribeDomainAdvanceConfigsResponseBodyDomainConfigs> getDomainConfigs() {
        return this.domainConfigs;
    }

    public DescribeDomainAdvanceConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile extends TeaModel {
        @NameInMap("CertStatus")
        public Integer certStatus;

        @NameInMap("ClusterType")
        public Integer clusterType;

        @NameInMap("Cname")
        public String cname;

        @NameInMap("ExclusiveVipStatus")
        public Integer exclusiveVipStatus;

        @NameInMap("GSLBStatus")
        public String GSLBStatus;

        @NameInMap("Http2Port")
        public java.util.List<Integer> http2Port;

        @NameInMap("HttpPort")
        public java.util.List<Integer> httpPort;

        @NameInMap("HttpsPort")
        public java.util.List<Integer> httpsPort;

        @NameInMap("Ipv6Status")
        public Integer ipv6Status;

        @NameInMap("ResolvedType")
        public Integer resolvedType;

        @NameInMap("Rs")
        public java.util.List<String> rs;

        @NameInMap("VipServiceStatus")
        public Integer vipServiceStatus;

        public static DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile self = new DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile();
            return TeaModel.build(map, self);
        }

        public DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile setCertStatus(Integer certStatus) {
            this.certStatus = certStatus;
            return this;
        }
        public Integer getCertStatus() {
            return this.certStatus;
        }

        public DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile setClusterType(Integer clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public Integer getClusterType() {
            return this.clusterType;
        }

        public DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile setExclusiveVipStatus(Integer exclusiveVipStatus) {
            this.exclusiveVipStatus = exclusiveVipStatus;
            return this;
        }
        public Integer getExclusiveVipStatus() {
            return this.exclusiveVipStatus;
        }

        public DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile setGSLBStatus(String GSLBStatus) {
            this.GSLBStatus = GSLBStatus;
            return this;
        }
        public String getGSLBStatus() {
            return this.GSLBStatus;
        }

        public DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile setHttp2Port(java.util.List<Integer> http2Port) {
            this.http2Port = http2Port;
            return this;
        }
        public java.util.List<Integer> getHttp2Port() {
            return this.http2Port;
        }

        public DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile setHttpPort(java.util.List<Integer> httpPort) {
            this.httpPort = httpPort;
            return this;
        }
        public java.util.List<Integer> getHttpPort() {
            return this.httpPort;
        }

        public DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile setHttpsPort(java.util.List<Integer> httpsPort) {
            this.httpsPort = httpsPort;
            return this;
        }
        public java.util.List<Integer> getHttpsPort() {
            return this.httpsPort;
        }

        public DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile setIpv6Status(Integer ipv6Status) {
            this.ipv6Status = ipv6Status;
            return this;
        }
        public Integer getIpv6Status() {
            return this.ipv6Status;
        }

        public DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile setResolvedType(Integer resolvedType) {
            this.resolvedType = resolvedType;
            return this;
        }
        public Integer getResolvedType() {
            return this.resolvedType;
        }

        public DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile setRs(java.util.List<String> rs) {
            this.rs = rs;
            return this;
        }
        public java.util.List<String> getRs() {
            return this.rs;
        }

        public DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile setVipServiceStatus(Integer vipServiceStatus) {
            this.vipServiceStatus = vipServiceStatus;
            return this;
        }
        public Integer getVipServiceStatus() {
            return this.vipServiceStatus;
        }

    }

    public static class DescribeDomainAdvanceConfigsResponseBodyDomainConfigs extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("Profile")
        public DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile profile;

        public static DescribeDomainAdvanceConfigsResponseBodyDomainConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainAdvanceConfigsResponseBodyDomainConfigs self = new DescribeDomainAdvanceConfigsResponseBodyDomainConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeDomainAdvanceConfigsResponseBodyDomainConfigs setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDomainAdvanceConfigsResponseBodyDomainConfigs setProfile(DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile profile) {
            this.profile = profile;
            return this;
        }
        public DescribeDomainAdvanceConfigsResponseBodyDomainConfigsProfile getProfile() {
            return this.profile;
        }

    }

}
