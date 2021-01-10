// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class PushDTXWhitelistRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PushTargetRepeatList")
    public java.util.List<String> pushTargetRepeatList;

    @NameInMap("RefId")
    public Long refId;

    @NameInMap("Type")
    public Long type;

    public static PushDTXWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        PushDTXWhitelistRequest self = new PushDTXWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public PushDTXWhitelistRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PushDTXWhitelistRequest setPushTargetRepeatList(java.util.List<String> pushTargetRepeatList) {
        this.pushTargetRepeatList = pushTargetRepeatList;
        return this;
    }
    public java.util.List<String> getPushTargetRepeatList() {
        return this.pushTargetRepeatList;
    }

    public PushDTXWhitelistRequest setRefId(Long refId) {
        this.refId = refId;
        return this;
    }
    public Long getRefId() {
        return this.refId;
    }

    public PushDTXWhitelistRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
