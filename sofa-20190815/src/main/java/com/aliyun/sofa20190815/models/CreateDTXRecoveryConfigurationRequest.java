// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDTXRecoveryConfigurationRequest extends TeaModel {
    @NameInMap("ActionMode")
    public Long actionMode;

    @NameInMap("ActivityMode")
    public Long activityMode;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("Content")
    public String content;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OldBiztype")
    public String oldBiztype;

    @NameInMap("Role")
    public Long role;

    @NameInMap("SplitRuleJsonStr")
    public String splitRuleJsonStr;

    public static CreateDTXRecoveryConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDTXRecoveryConfigurationRequest self = new CreateDTXRecoveryConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public CreateDTXRecoveryConfigurationRequest setActionMode(Long actionMode) {
        this.actionMode = actionMode;
        return this;
    }
    public Long getActionMode() {
        return this.actionMode;
    }

    public CreateDTXRecoveryConfigurationRequest setActivityMode(Long activityMode) {
        this.activityMode = activityMode;
        return this;
    }
    public Long getActivityMode() {
        return this.activityMode;
    }

    public CreateDTXRecoveryConfigurationRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateDTXRecoveryConfigurationRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateDTXRecoveryConfigurationRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateDTXRecoveryConfigurationRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateDTXRecoveryConfigurationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDTXRecoveryConfigurationRequest setOldBiztype(String oldBiztype) {
        this.oldBiztype = oldBiztype;
        return this;
    }
    public String getOldBiztype() {
        return this.oldBiztype;
    }

    public CreateDTXRecoveryConfigurationRequest setRole(Long role) {
        this.role = role;
        return this;
    }
    public Long getRole() {
        return this.role;
    }

    public CreateDTXRecoveryConfigurationRequest setSplitRuleJsonStr(String splitRuleJsonStr) {
        this.splitRuleJsonStr = splitRuleJsonStr;
        return this;
    }
    public String getSplitRuleJsonStr() {
        return this.splitRuleJsonStr;
    }

}
