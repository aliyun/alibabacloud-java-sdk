// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class OpenScdnServiceRequest extends TeaModel {
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("CcProtection")
    public Integer ccProtection;

    @NameInMap("DDoSBasic")
    public Integer DDoSBasic;

    @NameInMap("DomainCount")
    public Integer domainCount;

    @NameInMap("ElasticProtection")
    public Integer elasticProtection;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProtectType")
    public String protectType;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("StartDate")
    public String startDate;

    public static OpenScdnServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenScdnServiceRequest self = new OpenScdnServiceRequest();
        return TeaModel.build(map, self);
    }

    public OpenScdnServiceRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public OpenScdnServiceRequest setCcProtection(Integer ccProtection) {
        this.ccProtection = ccProtection;
        return this;
    }
    public Integer getCcProtection() {
        return this.ccProtection;
    }

    public OpenScdnServiceRequest setDDoSBasic(Integer DDoSBasic) {
        this.DDoSBasic = DDoSBasic;
        return this;
    }
    public Integer getDDoSBasic() {
        return this.DDoSBasic;
    }

    public OpenScdnServiceRequest setDomainCount(Integer domainCount) {
        this.domainCount = domainCount;
        return this;
    }
    public Integer getDomainCount() {
        return this.domainCount;
    }

    public OpenScdnServiceRequest setElasticProtection(Integer elasticProtection) {
        this.elasticProtection = elasticProtection;
        return this;
    }
    public Integer getElasticProtection() {
        return this.elasticProtection;
    }

    public OpenScdnServiceRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public OpenScdnServiceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public OpenScdnServiceRequest setProtectType(String protectType) {
        this.protectType = protectType;
        return this;
    }
    public String getProtectType() {
        return this.protectType;
    }

    public OpenScdnServiceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public OpenScdnServiceRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
