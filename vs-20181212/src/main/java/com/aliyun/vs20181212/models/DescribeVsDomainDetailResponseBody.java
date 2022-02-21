// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainDetailResponseBody extends TeaModel {
    @NameInMap("DomainConfig")
    public DescribeVsDomainDetailResponseBodyDomainConfig domainConfig;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVsDomainDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainDetailResponseBody self = new DescribeVsDomainDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainDetailResponseBody setDomainConfig(DescribeVsDomainDetailResponseBodyDomainConfig domainConfig) {
        this.domainConfig = domainConfig;
        return this;
    }
    public DescribeVsDomainDetailResponseBodyDomainConfig getDomainConfig() {
        return this.domainConfig;
    }

    public DescribeVsDomainDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVsDomainDetailResponseBodyDomainConfig extends TeaModel {
        @NameInMap("Cname")
        public String cname;

        @NameInMap("Description")
        public String description;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DomainStatus")
        public String domainStatus;

        @NameInMap("DomainType")
        public String domainType;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Region")
        public String region;

        @NameInMap("SSLProtocol")
        public String SSLProtocol;

        @NameInMap("Scope")
        public String scope;

        public static DescribeVsDomainDetailResponseBodyDomainConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsDomainDetailResponseBodyDomainConfig self = new DescribeVsDomainDetailResponseBodyDomainConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVsDomainDetailResponseBodyDomainConfig setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeVsDomainDetailResponseBodyDomainConfig setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVsDomainDetailResponseBodyDomainConfig setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeVsDomainDetailResponseBodyDomainConfig setDomainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }
        public String getDomainStatus() {
            return this.domainStatus;
        }

        public DescribeVsDomainDetailResponseBodyDomainConfig setDomainType(String domainType) {
            this.domainType = domainType;
            return this;
        }
        public String getDomainType() {
            return this.domainType;
        }

        public DescribeVsDomainDetailResponseBodyDomainConfig setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeVsDomainDetailResponseBodyDomainConfig setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeVsDomainDetailResponseBodyDomainConfig setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeVsDomainDetailResponseBodyDomainConfig setSSLProtocol(String SSLProtocol) {
            this.SSLProtocol = SSLProtocol;
            return this;
        }
        public String getSSLProtocol() {
            return this.SSLProtocol;
        }

        public DescribeVsDomainDetailResponseBodyDomainConfig setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

    }

}
