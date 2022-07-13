// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class StartHotlineWorkRequest extends TeaModel {
    // 坐席账号名称(唯一值)，外部账号与XP账号登录名的映射
    @NameInMap("AccountName")
    public String accountName;

    // 客户请求唯一id，用于幂等校验，可以用uuid生成
    @NameInMap("ClientToken")
    public String clientToken;

    // AICCS实例ID，在智能联络中心控制台上可以看到
    @NameInMap("InstanceId")
    public String instanceId;

    // 坐席热线技能组，格式："[123,456,......,789]"
    @NameInMap("SkillGroups")
    public String skillGroups;

    // 上班渠道，格式：(手机上班){"workChannel":"PSTN"} ;  (PC上班){"workChannel":"PC"}
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
