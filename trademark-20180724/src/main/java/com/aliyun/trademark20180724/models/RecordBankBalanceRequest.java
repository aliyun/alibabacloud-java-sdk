// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class RecordBankBalanceRequest extends TeaModel {
    @NameInMap("ActionDate")
    public Long actionDate;

    @NameInMap("Balance")
    public String balance;

    @NameInMap("PrincipalName")
    public String principalName;

    public static RecordBankBalanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecordBankBalanceRequest self = new RecordBankBalanceRequest();
        return TeaModel.build(map, self);
    }

    public RecordBankBalanceRequest setActionDate(Long actionDate) {
        this.actionDate = actionDate;
        return this;
    }
    public Long getActionDate() {
        return this.actionDate;
    }

    public RecordBankBalanceRequest setBalance(String balance) {
        this.balance = balance;
        return this;
    }
    public String getBalance() {
        return this.balance;
    }

    public RecordBankBalanceRequest setPrincipalName(String principalName) {
        this.principalName = principalName;
        return this;
    }
    public String getPrincipalName() {
        return this.principalName;
    }

}
