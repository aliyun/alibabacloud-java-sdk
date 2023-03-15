// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListSettledsRequest extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("applicant")
    public String applicant;

    @NameInMap("enterpriseName")
    public String enterpriseName;

    @NameInMap("status")
    public String status;

    public static ListSettledsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSettledsRequest self = new ListSettledsRequest();
        return TeaModel.build(map, self);
    }

    public ListSettledsRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ListSettledsRequest setApplicant(String applicant) {
        this.applicant = applicant;
        return this;
    }
    public String getApplicant() {
        return this.applicant;
    }

    public ListSettledsRequest setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
        return this;
    }
    public String getEnterpriseName() {
        return this.enterpriseName;
    }

    public ListSettledsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
