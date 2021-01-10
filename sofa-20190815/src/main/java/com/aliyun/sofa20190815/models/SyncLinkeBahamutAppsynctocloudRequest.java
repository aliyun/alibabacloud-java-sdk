// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SyncLinkeBahamutAppsynctocloudRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("CloudTenantId")
    public String cloudTenantId;

    @NameInMap("TenantId")
    public String tenantId;

    public static SyncLinkeBahamutAppsynctocloudRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncLinkeBahamutAppsynctocloudRequest self = new SyncLinkeBahamutAppsynctocloudRequest();
        return TeaModel.build(map, self);
    }

    public SyncLinkeBahamutAppsynctocloudRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public SyncLinkeBahamutAppsynctocloudRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SyncLinkeBahamutAppsynctocloudRequest setCloudTenantId(String cloudTenantId) {
        this.cloudTenantId = cloudTenantId;
        return this;
    }
    public String getCloudTenantId() {
        return this.cloudTenantId;
    }

    public SyncLinkeBahamutAppsynctocloudRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
