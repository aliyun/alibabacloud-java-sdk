// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CheckDeveloperRoleRequest extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("companyId")
    public Long companyId;

    @NameInMap("platform")
    public String platform;

    @NameInMap("roleName")
    public String roleName;

    public static CheckDeveloperRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckDeveloperRoleRequest self = new CheckDeveloperRoleRequest();
        return TeaModel.build(map, self);
    }

    public CheckDeveloperRoleRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CheckDeveloperRoleRequest setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public CheckDeveloperRoleRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public CheckDeveloperRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
