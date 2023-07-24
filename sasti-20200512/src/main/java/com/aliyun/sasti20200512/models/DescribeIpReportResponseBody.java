// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sasti20200512.models;

import com.aliyun.tea.*;

public class DescribeIpReportResponseBody extends TeaModel {
    @NameInMap("AttackCntByThreatType")
    public String attackCntByThreatType;

    @NameInMap("AttackPreferenceTop5")
    public String attackPreferenceTop5;

    @NameInMap("Confidence")
    public String confidence;

    @NameInMap("Context")
    public String context;

    @NameInMap("Group")
    public String group;

    @NameInMap("Intelligences")
    public String intelligences;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Scenario")
    public String scenario;

    @NameInMap("ThreatLevel")
    public String threatLevel;

    @NameInMap("ThreatTypes")
    public String threatTypes;

    @NameInMap("Whois")
    public String whois;

    public static DescribeIpReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpReportResponseBody self = new DescribeIpReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIpReportResponseBody setAttackCntByThreatType(String attackCntByThreatType) {
        this.attackCntByThreatType = attackCntByThreatType;
        return this;
    }
    public String getAttackCntByThreatType() {
        return this.attackCntByThreatType;
    }

    public DescribeIpReportResponseBody setAttackPreferenceTop5(String attackPreferenceTop5) {
        this.attackPreferenceTop5 = attackPreferenceTop5;
        return this;
    }
    public String getAttackPreferenceTop5() {
        return this.attackPreferenceTop5;
    }

    public DescribeIpReportResponseBody setConfidence(String confidence) {
        this.confidence = confidence;
        return this;
    }
    public String getConfidence() {
        return this.confidence;
    }

    public DescribeIpReportResponseBody setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

    public DescribeIpReportResponseBody setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public DescribeIpReportResponseBody setIntelligences(String intelligences) {
        this.intelligences = intelligences;
        return this;
    }
    public String getIntelligences() {
        return this.intelligences;
    }

    public DescribeIpReportResponseBody setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribeIpReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIpReportResponseBody setScenario(String scenario) {
        this.scenario = scenario;
        return this;
    }
    public String getScenario() {
        return this.scenario;
    }

    public DescribeIpReportResponseBody setThreatLevel(String threatLevel) {
        this.threatLevel = threatLevel;
        return this;
    }
    public String getThreatLevel() {
        return this.threatLevel;
    }

    public DescribeIpReportResponseBody setThreatTypes(String threatTypes) {
        this.threatTypes = threatTypes;
        return this;
    }
    public String getThreatTypes() {
        return this.threatTypes;
    }

    public DescribeIpReportResponseBody setWhois(String whois) {
        this.whois = whois;
        return this;
    }
    public String getWhois() {
        return this.whois;
    }

}
