// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAntiBruteForceRuleRequest extends TeaModel {
    /**
     * <p>Specifies whether to set the defense rule as the default rule. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DefaultRule")
    public Boolean defaultRule;

    /**
     * <p>The threshold of logon failures that you specify. Valid values:</p>
     * <ul>
     * <li><strong>2</strong></li>
     * <li><strong>3</strong></li>
     * <li><strong>4</strong></li>
     * <li><strong>5</strong></li>
     * <li><strong>10</strong></li>
     * <li><strong>50</strong></li>
     * <li><strong>80</strong></li>
     * <li><strong>100</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("FailCount")
    public Integer failCount;

    /**
     * <p>The period of time during which logons from an account are not allowed. Unit: minutes. Valid values:</p>
     * <ul>
     * <li><strong>5</strong></li>
     * <li><strong>15</strong></li>
     * <li><strong>30</strong></li>
     * <li><strong>60</strong></li>
     * <li><strong>120</strong></li>
     * <li><strong>360</strong></li>
     * <li><strong>720</strong></li>
     * <li><strong>1440</strong></li>
     * <li><strong>10080</strong></li>
     * <li><strong>52560000</strong>: permanent</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ForbiddenTime")
    public Integer forbiddenTime;

    /**
     * <p>The ID of the defense rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>65778</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The name of the defense rule.</p>
     * 
     * <strong>example:</strong>
     * <p>TestRule</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The period of time during which logon failures from an account are measured. Unit: minutes. Valid values:</p>
     * <ul>
     * <li><strong>1</strong></li>
     * <li><strong>2</strong></li>
     * <li><strong>5</strong></li>
     * <li><strong>10</strong></li>
     * <li><strong>15</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Span")
    public Integer span;

    /**
     * <p>An array consisting of the UUIDs of the servers to which the defense rule is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>uuid-13213-dasda</p>
     */
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
