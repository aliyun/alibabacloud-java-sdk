// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddCheckResultWhiteListRequest extends TeaModel {
    /**
     * <p>The IDs of the check items.</p>
     * <blockquote>
     * <p>Call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to obtain this parameter.</p>
     * </blockquote>
     */
    @NameInMap("CheckIds")
    public java.util.List<Long> checkIds;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. Different requests should use different tokens. The token supports only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance IDs of the cloud service instances to add to the whitelist. Separate multiple instance IDs with commas (,).</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The remarks. Maximum length: 65,535 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The rule type. Default value: <strong>WHITE</strong>. Valid values:</p>
     * <ul>
     * <li><strong>WHITE</strong>: adds to the whitelist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>WHITE</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    public static AddCheckResultWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCheckResultWhiteListRequest self = new AddCheckResultWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public AddCheckResultWhiteListRequest setCheckIds(java.util.List<Long> checkIds) {
        this.checkIds = checkIds;
        return this;
    }
    public java.util.List<Long> getCheckIds() {
        return this.checkIds;
    }

    public AddCheckResultWhiteListRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddCheckResultWhiteListRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public AddCheckResultWhiteListRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public AddCheckResultWhiteListRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

}
