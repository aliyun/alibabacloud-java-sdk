// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class FixCheckWarningsRequest extends TeaModel {
    // The parameters for the baseline risk item that you want to fix.
    // 
    // *   **checkId**: the ID of the check item that corresponds to the baseline risk item.
    // 
    // *   **rules**: an array that consists of the rules applied to fixes.
    // 
    //     *   **value**: specifies whether a fix method is selected. Valid values: **0** and **1**. The value 0 indicates that no fix method is selected and the value 1 indicates that a fix method is selected.
    //     *   **ruleId**: the ID of the fix method.
    //     *   **paramList**: an array that consists of the details about the fix method.\
    //         • **paramName**: the name of the fix method.\
    //         • **value**: the value of the fix method.
    @NameInMap("CheckParams")
    public String checkParams;

    // The language of the content within the request and response. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The ID of the baseline risk item.
    // 
    // >  To query specified baseline risk items and the check items of a specified server, you must provide the IDs of the baseline risk items. You can call the [DescribeCheckWarningSummary](~~DescribeCheckWarningSummary~~) operation to query the IDs.
    @NameInMap("RiskId")
    public Long riskId;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The UUID of the asset for which you want to fix the baseline risk item. You can call the [DescribeWarningMachines](~~DescribeWarningMachines~~) operation to query the UUIDs of assets.
    @NameInMap("Uuids")
    public String uuids;

    public static FixCheckWarningsRequest build(java.util.Map<String, ?> map) throws Exception {
        FixCheckWarningsRequest self = new FixCheckWarningsRequest();
        return TeaModel.build(map, self);
    }

    public FixCheckWarningsRequest setCheckParams(String checkParams) {
        this.checkParams = checkParams;
        return this;
    }
    public String getCheckParams() {
        return this.checkParams;
    }

    public FixCheckWarningsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public FixCheckWarningsRequest setRiskId(Long riskId) {
        this.riskId = riskId;
        return this;
    }
    public Long getRiskId() {
        return this.riskId;
    }

    public FixCheckWarningsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public FixCheckWarningsRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
