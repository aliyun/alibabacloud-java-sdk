// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDomainDetailResponseBody extends TeaModel {
    // The total number of alerts in your website assets.
    @NameInMap("AlarmCount")
    public Integer alarmCount;

    // The domain name.
    @NameInMap("Domain")
    public String domain;

    // An array that consists of the details about the domain asset.
    @NameInMap("DomainDetailItems")
    public java.util.List<DescribeDomainDetailResponseBodyDomainDetailItems> domainDetailItems;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The name of the root domain that corresponds to the domain.
    @NameInMap("RootDomain")
    public String rootDomain;

    // The total number of vulnerabilities in your website assets.
    @NameInMap("VulCount")
    public Integer vulCount;

    public static DescribeDomainDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainDetailResponseBody self = new DescribeDomainDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainDetailResponseBody setAlarmCount(Integer alarmCount) {
        this.alarmCount = alarmCount;
        return this;
    }
    public Integer getAlarmCount() {
        return this.alarmCount;
    }

    public DescribeDomainDetailResponseBody setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeDomainDetailResponseBody setDomainDetailItems(java.util.List<DescribeDomainDetailResponseBodyDomainDetailItems> domainDetailItems) {
        this.domainDetailItems = domainDetailItems;
        return this;
    }
    public java.util.List<DescribeDomainDetailResponseBodyDomainDetailItems> getDomainDetailItems() {
        return this.domainDetailItems;
    }

    public DescribeDomainDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainDetailResponseBody setRootDomain(String rootDomain) {
        this.rootDomain = rootDomain;
        return this;
    }
    public String getRootDomain() {
        return this.rootDomain;
    }

    public DescribeDomainDetailResponseBody setVulCount(Integer vulCount) {
        this.vulCount = vulCount;
        return this;
    }
    public Integer getVulCount() {
        return this.vulCount;
    }

    public static class DescribeDomainDetailResponseBodyDomainDetailItems extends TeaModel {
        // The type of the domain asset. Valid values:
        // 
        // *   **0**: an Elastic Compute Service (ECS) instance
        // *   **1**: a Server Load Balancer (SLB) instance
        // *   **2**: a Network Address Translation (NAT) gateway
        // *   **3**: an ApsaraDB RDS instance
        // *   **4**: an ApsaraDB for MongoDB instance
        @NameInMap("AssetType")
        public String assetType;

        // The instance ID of the asset.
        @NameInMap("InstanceId")
        public String instanceId;

        // The name of the asset.
        @NameInMap("InstanceName")
        public String instanceName;

        // The public IP address of the asset.
        @NameInMap("InternetIp")
        public String internetIp;

        // The private IP address of the asset.
        @NameInMap("IntranetIp")
        public String intranetIp;

        // The instance UUID of the domain asset.
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeDomainDetailResponseBodyDomainDetailItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainDetailResponseBodyDomainDetailItems self = new DescribeDomainDetailResponseBodyDomainDetailItems();
            return TeaModel.build(map, self);
        }

        public DescribeDomainDetailResponseBodyDomainDetailItems setAssetType(String assetType) {
            this.assetType = assetType;
            return this;
        }
        public String getAssetType() {
            return this.assetType;
        }

        public DescribeDomainDetailResponseBodyDomainDetailItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDomainDetailResponseBodyDomainDetailItems setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeDomainDetailResponseBodyDomainDetailItems setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeDomainDetailResponseBodyDomainDetailItems setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeDomainDetailResponseBodyDomainDetailItems setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
