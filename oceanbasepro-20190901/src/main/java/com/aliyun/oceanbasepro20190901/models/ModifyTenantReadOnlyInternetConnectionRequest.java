// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantReadOnlyInternetConnectionRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InternetAddressStatus")
    public String internetAddressStatus;

    @NameInMap("Port")
    public Integer port;

    @NameInMap("TenantId")
    public String tenantId;

    public static ModifyTenantReadOnlyInternetConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantReadOnlyInternetConnectionRequest self = new ModifyTenantReadOnlyInternetConnectionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTenantReadOnlyInternetConnectionRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyTenantReadOnlyInternetConnectionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyTenantReadOnlyInternetConnectionRequest setInternetAddressStatus(String internetAddressStatus) {
        this.internetAddressStatus = internetAddressStatus;
        return this;
    }
    public String getInternetAddressStatus() {
        return this.internetAddressStatus;
    }

    public ModifyTenantReadOnlyInternetConnectionRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public ModifyTenantReadOnlyInternetConnectionRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
