// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckWarningCountRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>103784262032****</p>
     */
    @NameInMap("AliUid")
    public Long aliUid;

    /**
     * <strong>example:</strong>
     * <p>926</p>
     */
    @NameInMap("CheckId")
    public Long checkId;

    /**
     * <strong>example:</strong>
     * <p>43</p>
     */
    @NameInMap("RiskId")
    public Long riskId;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static DescribeCheckWarningCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckWarningCountRequest self = new DescribeCheckWarningCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCheckWarningCountRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DescribeCheckWarningCountRequest setCheckId(Long checkId) {
        this.checkId = checkId;
        return this;
    }
    public Long getCheckId() {
        return this.checkId;
    }

    public DescribeCheckWarningCountRequest setRiskId(Long riskId) {
        this.riskId = riskId;
        return this;
    }
    public Long getRiskId() {
        return this.riskId;
    }

    public DescribeCheckWarningCountRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
