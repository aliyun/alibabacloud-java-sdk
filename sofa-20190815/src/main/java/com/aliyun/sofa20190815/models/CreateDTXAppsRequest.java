// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDTXAppsRequest extends TeaModel {
    @NameInMap("ActivityMode")
    public Long activityMode;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SplitRuleJsonStr")
    public String splitRuleJsonStr;

    public static CreateDTXAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDTXAppsRequest self = new CreateDTXAppsRequest();
        return TeaModel.build(map, self);
    }

    public CreateDTXAppsRequest setActivityMode(Long activityMode) {
        this.activityMode = activityMode;
        return this;
    }
    public Long getActivityMode() {
        return this.activityMode;
    }

    public CreateDTXAppsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateDTXAppsRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateDTXAppsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDTXAppsRequest setSplitRuleJsonStr(String splitRuleJsonStr) {
        this.splitRuleJsonStr = splitRuleJsonStr;
        return this;
    }
    public String getSplitRuleJsonStr() {
        return this.splitRuleJsonStr;
    }

}
