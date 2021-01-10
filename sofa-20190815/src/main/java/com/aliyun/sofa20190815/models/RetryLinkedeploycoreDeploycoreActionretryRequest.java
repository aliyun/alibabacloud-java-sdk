// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryLinkedeploycoreDeploycoreActionretryRequest extends TeaModel {
    @NameInMap("ActionId")
    public Long actionId;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("TenantName")
    public String tenantName;

    public static RetryLinkedeploycoreDeploycoreActionretryRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryLinkedeploycoreDeploycoreActionretryRequest self = new RetryLinkedeploycoreDeploycoreActionretryRequest();
        return TeaModel.build(map, self);
    }

    public RetryLinkedeploycoreDeploycoreActionretryRequest setActionId(Long actionId) {
        this.actionId = actionId;
        return this;
    }
    public Long getActionId() {
        return this.actionId;
    }

    public RetryLinkedeploycoreDeploycoreActionretryRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public RetryLinkedeploycoreDeploycoreActionretryRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
