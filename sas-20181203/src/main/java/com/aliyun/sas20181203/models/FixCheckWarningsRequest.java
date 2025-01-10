// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class FixCheckWarningsRequest extends TeaModel {
    /**
     * <p>The parameters for the baseline risk item that you want to fix.</p>
     * <ul>
     * <li><p><strong>checkId</strong>: the ID of the check item that corresponds to the baseline risk item.</p>
     * </li>
     * <li><p><strong>rules</strong>: an array that consists of the rules applied to fixes.</p>
     * <ul>
     * <li><strong>value</strong>: specifies whether a fix method is selected. Valid values: <strong>0</strong> and <strong>1</strong>. The value 0 indicates that no fix method is selected and the value 1 indicates that a fix method is selected.</li>
     * <li><strong>ruleId</strong>: the ID of the fix method.</li>
     * <li><strong>paramList</strong>: an array that consists of the details about the fix method.\
     * • <strong>paramName</strong>: the name of the fix method.\
     * • <strong>value</strong>: the value of the fix method.</li>
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
     * <p>The language of the content within the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The retention period of the snapshot that is created when you fix the baseline risk. Valid values: 1 to 365. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RetentionDays")
    public Integer retentionDays;

    /**
     * <p>The ID of the risk item.</p>
     * <blockquote>
     * <p> To query the information about the risk items and check items of a server, you must specify the IDs of the risk items. You can call the <a href="~~DescribeCheckWarningSummary~~">DescribeCheckWarningSummary</a> operation to query the IDs of risk items.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10354</p>
     */
    @NameInMap("RiskId")
    public Long riskId;

    /**
     * <p>The name of the snapshot that is created when you fix the baseline risk.</p>
     * 
     * <strong>example:</strong>
     * <p>sas_fix_2024-12-04</p>
     */
    @NameInMap("SnapshotName")
    public String snapshotName;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>165.225.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The UUID of the asset for which you want to fix the baseline risk item. You can call the <a href="~~DescribeWarningMachines~~">DescribeWarningMachines</a> operation to query the UUIDs of assets.</p>
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
