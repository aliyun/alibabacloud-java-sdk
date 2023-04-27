// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DeleteDomainRequest extends TeaModel {
    /**
     * <p>The mode in which the domain name is added to WAF. Valid values:</p>
     * <br>
     * <p>*   **share:** CNAME record mode. This is the default value.</p>
     * <p>*   **hybrid_cloud_cname:** hybrid cloud reverse proxy mode.</p>
     */
    @NameInMap("AccessType")
    public String accessType;

    /**
     * <p>The domain name that you want to delete.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The ID of the domain name.</p>
     */
    @NameInMap("DomainId")
    public String domainId;

    /**
     * <p>The ID of the WAF instance.</p>
     * <br>
     * <p>>  You can call the [DescribeInstance](~~433756~~) operation to obtain the ID of the WAF instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <br>
     * <p>*   **cn-hangzhou:** the Chinese mainland.</p>
     * <p>*   **ap-southeast-1:** outside the Chinese mainland.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The source IP address of the request. The value of this parameter is specified by the system.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DeleteDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainRequest self = new DeleteDomainRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDomainRequest setAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }
    public String getAccessType() {
        return this.accessType;
    }

    public DeleteDomainRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DeleteDomainRequest setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public DeleteDomainRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteDomainRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteDomainRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
