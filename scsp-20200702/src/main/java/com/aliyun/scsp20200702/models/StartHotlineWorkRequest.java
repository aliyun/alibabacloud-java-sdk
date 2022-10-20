// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class StartHotlineWorkRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SkillGroups")
    public String skillGroups;

    @NameInMap("WorkChannel")
    public String workChannel;

    public static StartHotlineWorkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartHotlineWorkRequest self = new StartHotlineWorkRequest();
        return TeaModel.build(map, self);
    }

    public StartHotlineWorkRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public StartHotlineWorkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public StartHotlineWorkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StartHotlineWorkRequest setSkillGroups(String skillGroups) {
        this.skillGroups = skillGroups;
        return this;
    }
    public String getSkillGroups() {
        return this.skillGroups;
    }

    public StartHotlineWorkRequest setWorkChannel(String workChannel) {
        this.workChannel = workChannel;
        return this;
    }
    public String getWorkChannel() {
        return this.workChannel;
    }

}
