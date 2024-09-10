// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyOperateVulRequest extends TeaModel {
    /**
     * <p>The request ID. Set the value to <strong>sas</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The details of the vulnerability. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <ul>
     * <li><p><strong>name</strong>: the name of the vulnerability.</p>
     * </li>
     * <li><p><strong>uuid</strong>: the UUID of the server on which the vulnerability is detected.</p>
     * </li>
     * <li><p><strong>tag</strong>: the tag that is added to the vulnerability. Valid values:</p>
     * <ul>
     * <li><strong>oval</strong>: Linux software vulnerability</li>
     * <li><strong>system</strong>: Windows system vulnerability</li>
     * <li><strong>cms</strong>: Web-CMS vulnerability</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeVulList~~">DescribeVulList</a> operation to query the tags that are added to vulnerabilities of other types.</p>
     * </blockquote>
     * <ul>
     * <li><p><strong>isFront</strong>: specifies whether a pre-patch is required to fix the Windows system vulnerability. This field is required only for Windows system vulnerabilities. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: no</li>
     * <li><strong>1</strong>: yes</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p> You can fix multiple vulnerabilities at a time. Separate the details of multiple vulnerabilities with commas (,). You can call the <a href="~~DescribeVulList~~">DescribeVulLIst</a> operation to query the details of vulnerabilities.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;alilinux2:2.1903:ALINUX2-SA-2022:0007&quot;,&quot;uuid&quot;:&quot;a3bb82a8-a3bd-4546-acce-45ac34af****&quot;,&quot;tag&quot;:&quot;oval&quot;,&quot;isFront&quot;:0},{&quot;name&quot;:&quot;alilinux2:2.1903:ALINUX2-SA-2022:0007&quot;,&quot;uuid&quot;:&quot;98a6fecc-88cd-46f2-8e35-f808a388****&quot;,&quot;tag&quot;:&quot;oval&quot;,&quot;isFront&quot;:0}]</p>
     */
    @NameInMap("Info")
    public String info;

    /**
     * <p>The operation that you want to perform on the vulnerability. Valid values:</p>
     * <ul>
     * <li><strong>vul_fix</strong>: fixes the vulnerability.</li>
     * <li><strong>vul_verify</strong>: verifies the vulnerability fix.</li>
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
     * <p>The reason why the vulnerability is <strong>ignored</strong>.</p>
     * <blockquote>
     * <p> This parameter is required only when you set <strong>OperateType</strong> to <strong>vul_ignore</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>not operate</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The type of the vulnerability. Valid values:</p>
     * <ul>
     * <li><strong>cve</strong>: Linux software vulnerability</li>
     * <li><strong>sys</strong>: Windows system vulnerability</li>
     * <li><strong>cms</strong>: Web-CMS vulnerability</li>
     * <li><strong>emg</strong>: urgent vulnerability</li>
     * <li><strong>app</strong>: application vulnerability</li>
     * <li><strong>sca</strong>: vulnerability that is detected based on software component analysis</li>
     * </ul>
     * <blockquote>
     * <p> You cannot fix the urgent vulnerabilities, application vulnerabilities, or vulnerabilities that are detected based on software component analysis.</p>
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

    public ModifyOperateVulRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
