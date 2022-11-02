// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyMajorProtectionBlackIpRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("ExpiredTime")
    public Long expiredTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IpList")
    public String ipList;

    @NameInMap("RuleId")
    public Long ruleId;

    @NameInMap("TemplateId")
    public Long templateId;

    public static ModifyMajorProtectionBlackIpRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMajorProtectionBlackIpRequest self = new ModifyMajorProtectionBlackIpRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMajorProtectionBlackIpRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyMajorProtectionBlackIpRequest setExpiredTime(Long expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public Long getExpiredTime() {
        return this.expiredTime;
    }

    public ModifyMajorProtectionBlackIpRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyMajorProtectionBlackIpRequest setIpList(String ipList) {
        this.ipList = ipList;
        return this;
    }
    public String getIpList() {
        return this.ipList;
    }

    public ModifyMajorProtectionBlackIpRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public ModifyMajorProtectionBlackIpRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
