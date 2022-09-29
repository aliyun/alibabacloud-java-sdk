// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePrivilegeCmd extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("roleId")
    public Long roleId;

    @NameInMap("strategyItems")
    public java.util.List<StrategyItem> strategyItems;

    @NameInMap("strategys")
    public String strategys;

    public static CreatePrivilegeCmd build(java.util.Map<String, ?> map) throws Exception {
        CreatePrivilegeCmd self = new CreatePrivilegeCmd();
        return TeaModel.build(map, self);
    }

    public CreatePrivilegeCmd setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CreatePrivilegeCmd setRoleId(Long roleId) {
        this.roleId = roleId;
        return this;
    }
    public Long getRoleId() {
        return this.roleId;
    }

    public CreatePrivilegeCmd setStrategyItems(java.util.List<StrategyItem> strategyItems) {
        this.strategyItems = strategyItems;
        return this;
    }
    public java.util.List<StrategyItem> getStrategyItems() {
        return this.strategyItems;
    }

    public CreatePrivilegeCmd setStrategys(String strategys) {
        this.strategys = strategys;
        return this;
    }
    public String getStrategys() {
        return this.strategys;
    }

}
