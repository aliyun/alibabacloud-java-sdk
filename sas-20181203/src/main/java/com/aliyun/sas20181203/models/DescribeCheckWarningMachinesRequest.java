// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckWarningMachinesRequest extends TeaModel {
    /**
     * <p>The ID of the check item.</p>
     * <br>
     * <p>> You can call the [DescribeCheckWarningSummary](~~DescribeCheckWarningSummary~~) operation to query the IDs of check items.</p>
     */
    @NameInMap("CheckId")
    public Long checkId;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
     * <br>
     * <p>>  You can call the [DescribeMonitorAccounts](~~DescribeMonitorAccounts~~) operation to obtain the IDs.</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The ID of the baseline.</p>
     * <br>
     * <p>> You can call the [DescribeCheckWarningSummary](~~DescribeCheckWarningSummary~~) operation to query the IDs of baselines.</p>
     */
    @NameInMap("RiskId")
    public Long riskId;

    /**
     * <p>Specifies whether the check item passed the baseline check. Valid values:</p>
     * <p>*   **1**: no</p>
     * <p>*   **3**: yes</p>
     */
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

    public DescribeCheckWarningMachinesRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
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
