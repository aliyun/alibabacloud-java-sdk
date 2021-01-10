// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDTXAppRequest extends TeaModel {
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

    public static CreateDTXAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDTXAppRequest self = new CreateDTXAppRequest();
        return TeaModel.build(map, self);
    }

    public CreateDTXAppRequest setActivityMode(Long activityMode) {
        this.activityMode = activityMode;
        return this;
    }
    public Long getActivityMode() {
        return this.activityMode;
    }

    public CreateDTXAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateDTXAppRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateDTXAppRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDTXAppRequest setSplitRuleJsonStr(String splitRuleJsonStr) {
        this.splitRuleJsonStr = splitRuleJsonStr;
        return this;
    }
    public String getSplitRuleJsonStr() {
        return this.splitRuleJsonStr;
    }

}
