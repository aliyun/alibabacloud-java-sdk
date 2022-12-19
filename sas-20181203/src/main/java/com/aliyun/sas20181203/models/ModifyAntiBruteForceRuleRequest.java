// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAntiBruteForceRuleRequest extends TeaModel {
    // Specifies whether to set the defense rule as the default rule. Valid values:
    // 
    // *   **true**: yes
    // *   **false**: no
    @NameInMap("DefaultRule")
    public Boolean defaultRule;

    // The threshold of logon failures that you specify. Valid values:
    // 
    // *   **2**
    // *   **3**
    // *   **4**
    // *   **5**
    // *   **10**
    // *   **50**
    // *   **80**
    // *   **100**
    @NameInMap("FailCount")
    public Integer failCount;

    // The period of time during which logons from an account are not allowed. Unit: minutes. Valid values:
    // 
    // *   **5**
    // *   **15**
    // *   **30**
    // *   **60**
    // *   **120**
    // *   **360**
    // *   **720**
    // *   **1440**
    // *   **10080**
    // *   **52560000**: permanent
    @NameInMap("ForbiddenTime")
    public Integer forbiddenTime;

    // The ID of the defense rule.
    @NameInMap("Id")
    public Long id;

    // The name of the defense rule.
    @NameInMap("Name")
    public String name;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The period of time during which logon failures from an account are measured. Unit: minutes. Valid values:
    // 
    // *   **1**
    // *   **2**
    // *   **5**
    // *   **10**
    // *   **15**
    @NameInMap("Span")
    public Integer span;

    // An array consisting of the UUIDs of the servers to which the defense rule is applied.
    @NameInMap("UuidList")
    public java.util.List<String> uuidList;

    public static ModifyAntiBruteForceRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAntiBruteForceRuleRequest self = new ModifyAntiBruteForceRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAntiBruteForceRuleRequest setDefaultRule(Boolean defaultRule) {
        this.defaultRule = defaultRule;
        return this;
    }
    public Boolean getDefaultRule() {
        return this.defaultRule;
    }

    public ModifyAntiBruteForceRuleRequest setFailCount(Integer failCount) {
        this.failCount = failCount;
        return this;
    }
    public Integer getFailCount() {
        return this.failCount;
    }

    public ModifyAntiBruteForceRuleRequest setForbiddenTime(Integer forbiddenTime) {
        this.forbiddenTime = forbiddenTime;
        return this;
    }
    public Integer getForbiddenTime() {
        return this.forbiddenTime;
    }

    public ModifyAntiBruteForceRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ModifyAntiBruteForceRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyAntiBruteForceRuleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyAntiBruteForceRuleRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyAntiBruteForceRuleRequest setSpan(Integer span) {
        this.span = span;
        return this;
    }
    public Integer getSpan() {
        return this.span;
    }

    public ModifyAntiBruteForceRuleRequest setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

}
