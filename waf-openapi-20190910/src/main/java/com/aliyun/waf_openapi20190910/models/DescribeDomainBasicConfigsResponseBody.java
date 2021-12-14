// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeDomainBasicConfigsResponseBody extends TeaModel {
    @NameInMap("DomainConfigs")
    public java.util.List<DescribeDomainBasicConfigsResponseBodyDomainConfigs> domainConfigs;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDomainBasicConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainBasicConfigsResponseBody self = new DescribeDomainBasicConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainBasicConfigsResponseBody setDomainConfigs(java.util.List<DescribeDomainBasicConfigsResponseBodyDomainConfigs> domainConfigs) {
        this.domainConfigs = domainConfigs;
        return this;
    }
    public java.util.List<DescribeDomainBasicConfigsResponseBodyDomainConfigs> getDomainConfigs() {
        return this.domainConfigs;
    }

    public DescribeDomainBasicConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainBasicConfigsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDomainBasicConfigsResponseBodyDomainConfigs extends TeaModel {
        @NameInMap("AccessType")
        public String accessType;

        @NameInMap("AclStatus")
        public Integer aclStatus;

        @NameInMap("CcMode")
        public Integer ccMode;

        @NameInMap("CcStatus")
        public Integer ccStatus;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Version")
        public Long version;

        @NameInMap("WafMode")
        public Integer wafMode;

        @NameInMap("WafStatus")
        public Integer wafStatus;

        public static DescribeDomainBasicConfigsResponseBodyDomainConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainBasicConfigsResponseBodyDomainConfigs self = new DescribeDomainBasicConfigsResponseBodyDomainConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeDomainBasicConfigsResponseBodyDomainConfigs setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public DescribeDomainBasicConfigsResponseBodyDomainConfigs setAclStatus(Integer aclStatus) {
            this.aclStatus = aclStatus;
            return this;
        }
        public Integer getAclStatus() {
            return this.aclStatus;
        }

        public DescribeDomainBasicConfigsResponseBodyDomainConfigs setCcMode(Integer ccMode) {
            this.ccMode = ccMode;
            return this;
        }
        public Integer getCcMode() {
            return this.ccMode;
        }

        public DescribeDomainBasicConfigsResponseBodyDomainConfigs setCcStatus(Integer ccStatus) {
            this.ccStatus = ccStatus;
            return this;
        }
        public Integer getCcStatus() {
            return this.ccStatus;
        }

        public DescribeDomainBasicConfigsResponseBodyDomainConfigs setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDomainBasicConfigsResponseBodyDomainConfigs setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribeDomainBasicConfigsResponseBodyDomainConfigs setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeDomainBasicConfigsResponseBodyDomainConfigs setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

        public DescribeDomainBasicConfigsResponseBodyDomainConfigs setWafMode(Integer wafMode) {
            this.wafMode = wafMode;
            return this;
        }
        public Integer getWafMode() {
            return this.wafMode;
        }

        public DescribeDomainBasicConfigsResponseBodyDomainConfigs setWafStatus(Integer wafStatus) {
            this.wafStatus = wafStatus;
            return this;
        }
        public Integer getWafStatus() {
            return this.wafStatus;
        }

    }

}
