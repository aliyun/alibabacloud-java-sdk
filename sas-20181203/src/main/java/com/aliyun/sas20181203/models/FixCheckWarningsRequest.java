// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class FixCheckWarningsRequest extends TeaModel {
    /**
     * <p>The parameters of the baseline check items to fix. The following parameters are included:</p>
     * <ul>
     * <li><strong>checkId</strong>: The ID of the check item.</li>
     * <li><strong>rules</strong>: The fix rules (in array format).<ul>
     * <li><strong>value</strong>: Specifies whether the fix method is selected. Valid values: <strong>0</strong> (not selected), <strong>1</strong> (selected).</li>
     * <li><strong>ruleId</strong>: The ID of the fix method.</li>
     * <li><strong>paramList</strong>: The list of fix methods (in array format).<br>      • <strong>paramName</strong>: The name of the fix method.<br>      • <strong>value</strong>: The value of the fix method.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;checkId&quot;:8,&quot;rules&quot;:[{&quot;ruleId&quot;:&quot;rule.ssh_Idle.interval&quot;,&quot;value&quot;:1,&quot;paramList&quot;:[{&quot;paramName&quot;:&quot;range_val&quot;,&quot;value&quot;:&quot;600&quot;},{&quot;paramName&quot;:&quot;range_val&quot;,&quot;value&quot;:&quot;600&quot;}]},{&quot;ruleId&quot;:&quot;rule.ssh_Idle.count&quot;,&quot;value&quot;:1,&quot;paramList&quot;:[{&quot;paramName&quot;:&quot;range_val&quot;,&quot;value&quot;:&quot;3&quot;}]}]}]</p>
     */
    @NameInMap("CheckParams")
    public String checkParams;

    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The retention period of the snapshot to create when performing the baseline fix operation. Valid values: 1 to 365. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RetentionDays")
    public Integer retentionDays;

    /**
     * <p>The ID of the risk item.</p>
     * <blockquote>
     * <p>To query the check item information for a specified risk item and a specified server, you must provide the risk item ID. You can call the <a href="~~DescribeCheckWarningSummary~~">DescribeCheckWarningSummary</a> operation to obtain the ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10354</p>
     */
    @NameInMap("RiskId")
    public Long riskId;

    /**
     * <p>The name of the snapshot to create when performing the baseline fix operation.</p>
     * 
     * <strong>example:</strong>
     * <p>sas_fix_2024-12-04</p>
     */
    @NameInMap("SnapshotName")
    public String snapshotName;

    /**
     * <p>The IP address of the access source.</p>
     * 
     * <strong>example:</strong>
     * <p>165.225.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The unique ID of the asset instance to fix. You can call the <a href="~~DescribeWarningMachines~~">DescribeWarningMachines</a> operation to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75a417dda5f25edb5bed8f208a9a****,c7e10fd794262a1510d5648f9e5d****</p>
     */
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

    public FixCheckWarningsRequest setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    public FixCheckWarningsRequest setRiskId(Long riskId) {
        this.riskId = riskId;
        return this;
    }
    public Long getRiskId() {
        return this.riskId;
    }

    public FixCheckWarningsRequest setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }
    public String getSnapshotName() {
        return this.snapshotName;
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
