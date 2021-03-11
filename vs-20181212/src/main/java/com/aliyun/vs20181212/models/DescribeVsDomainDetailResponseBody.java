// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainConfig")
    public DescribeVsDomainDetailResponseBodyDomainConfig domainConfig;

    public static DescribeVsDomainDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainDetailResponseBody self = new DescribeVsDomainDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVsDomainDetailResponseBody setDomainConfig(DescribeVsDomainDetailResponseBodyDomainConfig domainConfig) {
        this.domainConfig = domainConfig;
        return this;
    }
    public DescribeVsDomainDetailResponseBodyDomainConfig getDomainConfig() {
        return this.domainConfig;
    }

    public static class DescribeVsDomainDetailResponseBodyDomainConfig extends TeaModel {
        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("Description")
        public String description;

        @NameInMap("SSLProtocol")
        public String SSLProtocol;

        @NameInMap("Region")
        public String region;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("Cname")
        public String cname;

        @NameInMap("DomainStatus")
        public String domainStatus;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DomainType")
        public String domainType;

        public static DescribeVsDomainDetailResponseBodyDomainConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsDomainDetailResponseBodyDomainConfig self = new DescribeVsDomainDetailResponseBodyDomainConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVsDomainDetailResponseBodyDomainConfig setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeVsDomainDetailResponseBodyDomainConfig setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVsDomainDetailResponseBodyDomainConfig setSSLProtocol(String SSLProtocol) {
            this.SSLProtocol = SSLProtocol;
            return this;
        }
        public String getSSLProtocol() {
            return this.SSLProtocol;
        }

        public DescribeVsDomainDetailResponseBodyDomainConfig setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeVsDomainDetailResponseBodyDomainConfig setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public DescribeVsDomainDetailResponseBodyDomainConfig setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeVsDomainDetailResponseBodyDomainConfig setDomainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }
        public String getDomainStatus() {
            return this.domainStatus;
        }

        public DescribeVsDomainDetailResponseBodyDomainConfig setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeVsDomainDetailResponseBodyDomainConfig setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeVsDomainDetailResponseBodyDomainConfig setDomainType(String domainType) {
            this.domainType = domainType;
            return this;
        }
        public String getDomainType() {
            return this.domainType;
        }

    }

}
