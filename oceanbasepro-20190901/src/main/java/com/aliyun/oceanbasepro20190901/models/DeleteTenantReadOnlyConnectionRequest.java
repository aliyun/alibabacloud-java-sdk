// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteTenantReadOnlyConnectionRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Port")
    public Integer port;

    @NameInMap("TenantId")
    public String tenantId;

    public static DeleteTenantReadOnlyConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTenantReadOnlyConnectionRequest self = new DeleteTenantReadOnlyConnectionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTenantReadOnlyConnectionRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DeleteTenantReadOnlyConnectionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteTenantReadOnlyConnectionRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public DeleteTenantReadOnlyConnectionRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
