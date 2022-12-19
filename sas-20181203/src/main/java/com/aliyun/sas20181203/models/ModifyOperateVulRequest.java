// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyOperateVulRequest extends TeaModel {
    // The details of the vulnerability. The value of this parameter is in the JSON format and contains the following fields:
    // 
    // *   **name**: the name of the vulnerability.
    // 
    // *   **uuid**: the UUID of the server on which the vulnerability is detected.
    // 
    // *   **tag**: the tag that is added to the vulnerability. Valid values:
    // 
    //     *   **oval**: Linux software vulnerability
    //     *   **system**: Windows system vulnerability
    //     *   **cms**: Web-CMS vulnerability
    // 
    // >  You can call the [DescribeVulList](~~DescribeVulList~~) operation to query the tags that are added to vulnerabilities of other types.
    // 
    // *   **isFront**: specifies whether a pre-patch is required to fix the Windows system vulnerability. This field is required only for Windows system vulnerabilities. Valid values:
    // 
    //     *   **0**: no
    //     *   **1**: yes
    // 
    // >  You can fix multiple vulnerabilities at a time. Separate the details of multiple vulnerabilities with commas (,). You can call the [DescribeVulLIst](~~DescribeVulList~~) operation to query the details of vulnerabilities.
    @NameInMap("Info")
    public String info;

    // The operation that you want to perform on the vulnerability. Valid values:
    // 
    // *   **vul_fix**: fixes the vulnerability.
    // *   **vul_verify**: verifies the vulnerability.
    // *   **vul_ignore**: ignores the vulnerability.
    // *   **vul\_undo_ignore**: cancels ignoring the vulnerability.
    // *   **vul_delete**: deletes the vulnerability.
    @NameInMap("OperateType")
    public String operateType;

    // The reason why the vulnerability is **ignored**.
    // 
    // >  This parameter is required only when you set **OperateType** to **vul_ignore**.
    @NameInMap("Reason")
    public String reason;

    // The type of the vulnerability. Valid values:
    // 
    // *   **cve**: Linux software vulnerability
    // *   **sys**: Windows system vulnerability
    // *   **cms**: Web-CMS vulnerability
    // *   **emg**: urgent vulnerability
    // *   **app**: application vulnerability
    // *   **sca**: vulnerability that is detected based on software component analysis
    // 
    // >  You cannot fix the urgent vulnerabilities, application vulnerabilities, or vulnerabilities that are detected based on software component analysis.
    @NameInMap("Type")
    public String type;

    public static ModifyOperateVulRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyOperateVulRequest self = new ModifyOperateVulRequest();
        return TeaModel.build(map, self);
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
