// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class XspaceNextbotCreatTenantRequest extends TeaModel {
    @NameInMap("BuId")
    public String buId;

    @NameInMap("BuName")
    public String buName;

    @NameInMap("InstanceId")
    public String instanceId;

    public static XspaceNextbotCreatTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        XspaceNextbotCreatTenantRequest self = new XspaceNextbotCreatTenantRequest();
        return TeaModel.build(map, self);
    }

    public XspaceNextbotCreatTenantRequest setBuId(String buId) {
        this.buId = buId;
        return this;
    }
    public String getBuId() {
        return this.buId;
    }

    public XspaceNextbotCreatTenantRequest setBuName(String buName) {
        this.buName = buName;
        return this;
    }
    public String getBuName() {
        return this.buName;
    }

    public XspaceNextbotCreatTenantRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
