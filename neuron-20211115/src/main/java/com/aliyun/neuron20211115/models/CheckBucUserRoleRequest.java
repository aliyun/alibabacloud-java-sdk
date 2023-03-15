// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CheckBucUserRoleRequest extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("companyId")
    public Long companyId;

    @NameInMap("platform")
    public String platform;

    @NameInMap("roleName")
    public String roleName;

    public static CheckBucUserRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckBucUserRoleRequest self = new CheckBucUserRoleRequest();
        return TeaModel.build(map, self);
    }

    public CheckBucUserRoleRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CheckBucUserRoleRequest setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public CheckBucUserRoleRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public CheckBucUserRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
