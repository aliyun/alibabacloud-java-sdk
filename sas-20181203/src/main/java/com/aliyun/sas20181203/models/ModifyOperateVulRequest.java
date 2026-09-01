// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyOperateVulRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. Use a different token for each request. The token supports only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The source identifier of the request. Set the value to <strong>sas</strong>.</p>
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
     * <li><strong>uuid</strong>: The UUID of the server on which the vulnerability is detected.</li>
     * <li><strong>tag</strong>: The tag of the vulnerability. Valid values:<ul>
     * <li><strong>oval</strong>: Linux software vulnerability.</li>
     * <li><strong>system</strong>: Windows system vulnerability.</li>
     * <li><strong>cms</strong>: Web-CMS vulnerability.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>For other vulnerability types, call the <a href="~~DescribeVulList~~">DescribeVulList</a> operation to obtain vulnerability information.</p>
     * </blockquote>
     * <ul>
     * <li><strong>isFront</strong>: Specifies whether the Windows patch is a prerequisite patch. This parameter is required only when you handle Windows system vulnerabilities. You can ignore this parameter for other vulnerability types. Valid values:<ul>
     * <li><strong>0</strong>: No.</li>
     * <li><strong>1</strong>: Yes.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Batch processing of vulnerabilities is supported. Separate multiple vulnerability entries with commas (,). Call the <a href="~~DescribeVulList~~">DescribeVulList</a> operation to obtain vulnerability information.</p>
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
     * <li><strong>vul_fix</strong>: fixes the vulnerability.</li>
     * <li><strong>vul_verify</strong>: verifies the vulnerability.</li>
     * <li><strong>vul_ignore</strong>: ignores the vulnerability.</li>
     * <li><strong>vul_undo_ignore</strong>: cancels ignoring the vulnerability.</li>
     * <li><strong>vul_delete</strong>: deletes the vulnerability.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vul_fix</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    /**
     * <p>The reason for ignoring the vulnerability.</p>
     * <blockquote>
     * <p>This parameter is required only when the operation type is <strong>ignore</strong> (OperateType is set to <strong>vul_ignore</strong>).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>not operate</p>
     */
    @NameInMap("Reason")
    public String reason;

    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The type of the vulnerability to handle. Valid values:</p>
     * <ul>
     * <li><strong>cve</strong>: Linux software vulnerability.</li>
     * <li><strong>sys</strong>: Windows system vulnerability.</li>
     * <li><strong>cms</strong>: Web-CMS vulnerability.</li>
     * <li><strong>emg</strong>: emergency vulnerability.</li>
     * <li><strong>app</strong>: application vulnerability.</li>
     * <li><strong>sca</strong>: software constituency parsing vulnerability.</li>
     * </ul>
     * <blockquote>
     * <p>Emergency vulnerabilities (emg), application vulnerabilities (app), and software constituency parsing vulnerabilities (sca) do not support the execute vulnerability fix operation.</p>
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
