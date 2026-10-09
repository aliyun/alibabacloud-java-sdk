// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyOperateVulRequest extends TeaModel {
    /**
     * <p>The client token used to ensure request idempotence. Use a different token for each request. Only ASCII characters are supported. The value can be up to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-0016e04115b</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run for this request. Valid values: true: performs only a dry run without executing the actual operation. false: sends the request normally. Default value: false.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The source identifier of the request. Set this parameter to <strong>sas</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The information about the vulnerability to handle. This parameter is in JSON format and contains the following fields:</p>
     * <ul>
     * <li><strong>name</strong>: The name of the vulnerability.</li>
     * <li><strong>uuid</strong>: The UUID of the server that has the vulnerability.</li>
     * <li><strong>tag</strong>: The label of the vulnerability. Valid values:<ul>
     * <li><strong>oval</strong>: Linux software vulnerability</li>
     * <li><strong>system</strong>: Windows system vulnerability</li>
     * <li><strong>cms</strong>: Web-CMS vulnerability</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>For other vulnerability types, call the <a href="~~DescribeVulList~~">DescribeVulList</a> operation to obtain vulnerability information.</p>
     * </blockquote>
     * <ul>
     * <li><strong>isFront</strong>: Specifies whether the Windows patch is a prerequisite patch. Set this parameter only when handling Windows system vulnerabilities. You can ignore this parameter for other vulnerability types. Valid values:<ul>
     * <li><strong>0</strong>: No.</li>
     * <li><strong>1</strong>: Yes.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Batch processing is supported. Separate multiple vulnerability entries with commas (,). Call the <a href="~~DescribeVulList~~">DescribeVulList</a> operation to obtain vulnerability information.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;alilinux2:2.1903:ALINUX2-SA-2022:0007&quot;,&quot;uuid&quot;:&quot;a3bb82a8-a3bd-4546-acce-45ac34af****&quot;,&quot;tag&quot;:&quot;oval&quot;,&quot;isFront&quot;:0},{&quot;name&quot;:&quot;alilinux2:2.1903:ALINUX2-SA-2022:0007&quot;,&quot;uuid&quot;:&quot;98a6fecc-88cd-46f2-8e35-f808a388****&quot;,&quot;tag&quot;:&quot;oval&quot;,&quot;isFront&quot;:0}]</p>
     */
    @NameInMap("Info")
    public String info;

    /**
     * <p>The operation to perform on the vulnerability. Valid values:</p>
     * <ul>
     * <li><strong>vul_fix</strong>: Fix the vulnerability.</li>
     * <li><strong>vul_verify</strong>: Verify the vulnerability.</li>
     * <li><strong>vul_ignore</strong>: Ignore the vulnerability.</li>
     * <li><strong>vul_undo_ignore</strong>: Cancel ignoring the vulnerability.</li>
     * <li><strong>vul_delete</strong>: Delete the vulnerability.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vul_fix</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    /**
     * <p>The reason for ignoring the vulnerability. This parameter is required only when the operation is set to <strong>ignore</strong> (that is, <strong>OperateType</strong> is set to <strong>vul_ignore</strong>).</p>
     * 
     * <strong>example:</strong>
     * <p>not operate</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The ID of the Alibaba Cloud account associated with a member account in the resource directory.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The type of vulnerability to handle. Valid values:</p>
     * <ul>
     * <li><strong>cve</strong>: Linux software vulnerability</li>
     * <li><strong>sys</strong>: Windows system vulnerability</li>
     * <li><strong>cms</strong>: Web-CMS vulnerability</li>
     * <li><strong>emg</strong>: Emergency vulnerability</li>
     * <li><strong>app</strong>: Application vulnerability</li>
     * <li><strong>sca</strong>: Software constituency parsing vulnerability</li>
     * </ul>
     * <blockquote>
     * <p>Fix operations are not supported for emergency vulnerabilities (emg), application vulnerabilities (app), or software constituency parsing vulnerabilities (sca). These vulnerability types do not support the execute vulnerability fix operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cve</p>
     */
    @NameInMap("Type")
    public String type;

    public static ModifyOperateVulRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyOperateVulRequest self = new ModifyOperateVulRequest();
        return TeaModel.build(map, self);
    }

    public ModifyOperateVulRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyOperateVulRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyOperateVulRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public ModifyOperateVulRequest setInfo(String info) {
        this.info = info;
        return this;
    }
    public String getInfo() {
        return this.info;
    }

    public ModifyOperateVulRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public ModifyOperateVulRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public ModifyOperateVulRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public ModifyOperateVulRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
