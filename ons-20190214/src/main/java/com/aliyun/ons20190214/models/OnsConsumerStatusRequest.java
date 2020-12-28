// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsConsumerStatusRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Detail")
    public Boolean detail;

    @NameInMap("NeedJstack")
    public Boolean needJstack;

    @NameInMap("InstanceId")
    public String instanceId;

    public static OnsConsumerStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsConsumerStatusRequest self = new OnsConsumerStatusRequest();
        return TeaModel.build(map, self);
    }

    public OnsConsumerStatusRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public OnsConsumerStatusRequest setDetail(Boolean detail) {
        this.detail = detail;
        return this;
    }
    public Boolean getDetail() {
        return this.detail;
    }

    public OnsConsumerStatusRequest setNeedJstack(Boolean needJstack) {
        this.needJstack = needJstack;
        return this;
    }
    public Boolean getNeedJstack() {
        return this.needJstack;
    }

    public OnsConsumerStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
