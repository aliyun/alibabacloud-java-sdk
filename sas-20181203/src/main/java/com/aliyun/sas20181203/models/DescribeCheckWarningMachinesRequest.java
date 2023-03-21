// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckWarningMachinesRequest extends TeaModel {
    @NameInMap("CheckId")
    public Long checkId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("RiskId")
    public Long riskId;

    @NameInMap("Status")
    public Integer status;

    public static DescribeCheckWarningMachinesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckWarningMachinesRequest self = new DescribeCheckWarningMachinesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCheckWarningMachinesRequest setCheckId(Long checkId) {
        this.checkId = checkId;
        return this;
    }
    public Long getCheckId() {
        return this.checkId;
    }

    public DescribeCheckWarningMachinesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeCheckWarningMachinesRequest setRiskId(Long riskId) {
        this.riskId = riskId;
        return this;
    }
    public Long getRiskId() {
        return this.riskId;
    }

    public DescribeCheckWarningMachinesRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
