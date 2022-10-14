// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ExpertResourceSetting extends TeaModel {
    @NameInMap("jobmanagerResourceSettingSpec")
    public BasicResourceSettingSpec jobmanagerResourceSettingSpec;

    @NameInMap("resourcePlan")
    public String resourcePlan;

    public static ExpertResourceSetting build(java.util.Map<String, ?> map) throws Exception {
        ExpertResourceSetting self = new ExpertResourceSetting();
        return TeaModel.build(map, self);
    }

    public ExpertResourceSetting setJobmanagerResourceSettingSpec(BasicResourceSettingSpec jobmanagerResourceSettingSpec) {
        this.jobmanagerResourceSettingSpec = jobmanagerResourceSettingSpec;
        return this;
    }
    public BasicResourceSettingSpec getJobmanagerResourceSettingSpec() {
        return this.jobmanagerResourceSettingSpec;
    }

    public ExpertResourceSetting setResourcePlan(String resourcePlan) {
        this.resourcePlan = resourcePlan;
        return this;
    }
    public String getResourcePlan() {
        return this.resourcePlan;
    }

}
