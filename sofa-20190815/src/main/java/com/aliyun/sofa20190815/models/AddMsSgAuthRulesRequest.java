// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsSgAuthRulesRequest extends TeaModel {
    @NameInMap("AuthGroupId")
    public Long authGroupId;

    @NameInMap("AuthRule")
    public String authRule;

    @NameInMap("DataId")
    public String dataId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static AddMsSgAuthRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMsSgAuthRulesRequest self = new AddMsSgAuthRulesRequest();
        return TeaModel.build(map, self);
    }

    public AddMsSgAuthRulesRequest setAuthGroupId(Long authGroupId) {
        this.authGroupId = authGroupId;
        return this;
    }
    public Long getAuthGroupId() {
        return this.authGroupId;
    }

    public AddMsSgAuthRulesRequest setAuthRule(String authRule) {
        this.authRule = authRule;
        return this;
    }
    public String getAuthRule() {
        return this.authRule;
    }

    public AddMsSgAuthRulesRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public AddMsSgAuthRulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
