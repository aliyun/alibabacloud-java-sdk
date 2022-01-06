// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class XspaceNextbotCreateTenantRequest extends TeaModel {
    @NameInMap("BuId")
    public String buId;

    @NameInMap("BuName")
    public String buName;

    @NameInMap("InstanceId")
    public String instanceId;

    public static XspaceNextbotCreateTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        XspaceNextbotCreateTenantRequest self = new XspaceNextbotCreateTenantRequest();
        return TeaModel.build(map, self);
    }

    public XspaceNextbotCreateTenantRequest setBuId(String buId) {
        this.buId = buId;
        return this;
    }
    public String getBuId() {
        return this.buId;
    }

    public XspaceNextbotCreateTenantRequest setBuName(String buName) {
        this.buName = buName;
        return this;
    }
    public String getBuName() {
        return this.buName;
    }

    public XspaceNextbotCreateTenantRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
