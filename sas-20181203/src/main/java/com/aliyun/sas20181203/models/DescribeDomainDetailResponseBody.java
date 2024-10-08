// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDomainDetailResponseBody extends TeaModel {
    /**
     * <p>The total number of alerts in your website assets.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AlarmCount")
    public Integer alarmCount;

    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>An array that consists of the details about the domain asset.</p>
     */
    @NameInMap("DomainDetailItems")
    public java.util.List<DescribeDomainDetailResponseBodyDomainDetailItems> domainDetailItems;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>3A85CFCF-05C8-451A-9E41-C0D5E96BA407</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the root domain that corresponds to the domain.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("RootDomain")
    public String rootDomain;

    /**
     * <p>The total number of vulnerabilities in your website assets.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
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
        /**
         * <p>The type of the domain asset. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: an Elastic Compute Service (ECS) instance</li>
         * <li><strong>1</strong>: a Server Load Balancer (SLB) instance</li>
         * <li><strong>2</strong>: a Network Address Translation (NAT) gateway</li>
         * <li><strong>3</strong>: an ApsaraDB RDS instance</li>
         * <li><strong>4</strong>: an ApsaraDB for MongoDB instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AssetType")
        public String assetType;

        /**
         * <p>The instance ID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>i-m5e6w7dzsktt6mz4***</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>iZm5e6w7dzsktt6mz4yimeZ-6****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The instance UUID of the domain asset.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp1g9dohoyin9cjhn6****</p>
         */
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
