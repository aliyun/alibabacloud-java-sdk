// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateAntiBruteForceRuleRequest extends TeaModel {
    // Specifies whether to set the defense rule as the default rule. Valid values:
    // 
    // *   **true**: yes
    // *   **false**: no
    // 
    // >  If no defense rule is created for a server, the default rule is applied to the server.
    @NameInMap("DefaultRule")
    public Boolean defaultRule;

    // The maximum number of failed logon attempts from an account. Valid values: 2, 3, 4, 5, 10, 50, 80, and 100.
    @NameInMap("FailCount")
    public Integer failCount;

    // The period of time during which logons from an account are not allowed. Unit: minutes. Valid values:
    // 
    // *   **5**: 5 minutes
    // *   **15**: 15 minutes
    // *   **30**: 30 minutes
    // *   **60**: 1 hour
    // *   **120**: 2 hours
    // *   **360**: 6 hours
    // *   **720**: 12 hours
    // *   **1440**: 24 hours
    // *   **10080**: 7 days
    // *   **52560000**: permanent
    @NameInMap("ForbiddenTime")
    public Integer forbiddenTime;

    // The name of the defense rule.
    @NameInMap("Name")
    public String name;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The maximum period of time during which failed logon attempts from an account can occur. Unit: minutes. Valid values:
    // 
    // *   **1**
    // *   **2**
    // *   **5**
    // *   **10**
    // *   **15**
    // 
    // >  To configure a defense rule, you must specify the Span, FailCount, and ForbiddenTime parameters. If the number of failed logon attempts from an account within the minutes specified by Span exceeds the value specified by FailCount, the account cannot be used for logons within the minutes specified by ForbiddenTime.
    @NameInMap("Span")
    public Integer span;

    // The UUIDs of the servers to which you want to apply the defense rule.
    @NameInMap("UuidList")
    public java.util.List<String> uuidList;

    public static CreateAntiBruteForceRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAntiBruteForceRuleRequest self = new CreateAntiBruteForceRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateAntiBruteForceRuleRequest setDefaultRule(Boolean defaultRule) {
        this.defaultRule = defaultRule;
        return this;
    }
    public Boolean getDefaultRule() {
        return this.defaultRule;
    }

    public CreateAntiBruteForceRuleRequest setFailCount(Integer failCount) {
        this.failCount = failCount;
        return this;
    }
    public Integer getFailCount() {
        return this.failCount;
    }

    public CreateAntiBruteForceRuleRequest setForbiddenTime(Integer forbiddenTime) {
        this.forbiddenTime = forbiddenTime;
        return this;
    }
    public Integer getForbiddenTime() {
        return this.forbiddenTime;
    }

    public CreateAntiBruteForceRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAntiBruteForceRuleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateAntiBruteForceRuleRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateAntiBruteForceRuleRequest setSpan(Integer span) {
        this.span = span;
        return this;
    }
    public Integer getSpan() {
        return this.span;
    }

    public CreateAntiBruteForceRuleRequest setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

}
