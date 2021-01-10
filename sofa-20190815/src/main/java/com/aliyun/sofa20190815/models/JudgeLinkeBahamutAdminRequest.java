// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class JudgeLinkeBahamutAdminRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("TenantId")
    public String tenantId;

    public static JudgeLinkeBahamutAdminRequest build(java.util.Map<String, ?> map) throws Exception {
        JudgeLinkeBahamutAdminRequest self = new JudgeLinkeBahamutAdminRequest();
        return TeaModel.build(map, self);
    }

    public JudgeLinkeBahamutAdminRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public JudgeLinkeBahamutAdminRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
