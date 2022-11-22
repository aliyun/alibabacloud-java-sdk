// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sasti20200512.models;

import com.aliyun.tea.*;

public class DescribeDomainReportResponseBody extends TeaModel {
    @NameInMap("AttackCntByThreatType")
    public String attackCntByThreatType;

    @NameInMap("AttackPreferenceTop5")
    public String attackPreferenceTop5;

    @NameInMap("Basic")
    public String basic;

    @NameInMap("Confidence")
    public String confidence;

    @NameInMap("Context")
    public String context;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Group")
    public String group;

    @NameInMap("Intelligences")
    public String intelligences;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Scenario")
    public String scenario;

    @NameInMap("SslCert")
    public String sslCert;

    @NameInMap("ThreatLevel")
    public String threatLevel;

    @NameInMap("ThreatTypes")
    public String threatTypes;

    @NameInMap("Whois")
    public String whois;

    public static DescribeDomainReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainReportResponseBody self = new DescribeDomainReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainReportResponseBody setAttackCntByThreatType(String attackCntByThreatType) {
        this.attackCntByThreatType = attackCntByThreatType;
        return this;
    }
    public String getAttackCntByThreatType() {
        return this.attackCntByThreatType;
    }

    public DescribeDomainReportResponseBody setAttackPreferenceTop5(String attackPreferenceTop5) {
        this.attackPreferenceTop5 = attackPreferenceTop5;
        return this;
    }
    public String getAttackPreferenceTop5() {
        return this.attackPreferenceTop5;
    }

    public DescribeDomainReportResponseBody setBasic(String basic) {
        this.basic = basic;
        return this;
    }
    public String getBasic() {
        return this.basic;
    }

    public DescribeDomainReportResponseBody setConfidence(String confidence) {
        this.confidence = confidence;
        return this;
    }
    public String getConfidence() {
        return this.confidence;
    }

    public DescribeDomainReportResponseBody setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

    public DescribeDomainReportResponseBody setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeDomainReportResponseBody setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public DescribeDomainReportResponseBody setIntelligences(String intelligences) {
        this.intelligences = intelligences;
        return this;
    }
    public String getIntelligences() {
        return this.intelligences;
    }

    public DescribeDomainReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainReportResponseBody setScenario(String scenario) {
        this.scenario = scenario;
        return this;
    }
    public String getScenario() {
        return this.scenario;
    }

    public DescribeDomainReportResponseBody setSslCert(String sslCert) {
        this.sslCert = sslCert;
        return this;
    }
    public String getSslCert() {
        return this.sslCert;
    }

    public DescribeDomainReportResponseBody setThreatLevel(String threatLevel) {
        this.threatLevel = threatLevel;
        return this;
    }
    public String getThreatLevel() {
        return this.threatLevel;
    }

    public DescribeDomainReportResponseBody setThreatTypes(String threatTypes) {
        this.threatTypes = threatTypes;
        return this;
    }
    public String getThreatTypes() {
        return this.threatTypes;
    }

    public DescribeDomainReportResponseBody setWhois(String whois) {
        this.whois = whois;
        return this;
    }
    public String getWhois() {
        return this.whois;
    }

}
