// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyOperateVulRequest extends TeaModel {
    /**
     * <p>The request ID. Set the value to **sas**.</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The details of the vulnerability. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <br>
     * <p>*   **name**: the name of the vulnerability.</p>
     * <br>
     * <p>*   **uuid**: the UUID of the server on which the vulnerability is detected.</p>
     * <br>
     * <p>*   **tag**: the tag that is added to the vulnerability. Valid values:</p>
     * <br>
     * <p>    *   **oval**: Linux software vulnerability</p>
     * <p>    *   **system**: Windows system vulnerability</p>
     * <p>    *   **cms**: Web-CMS vulnerability</p>
     * <br>
     * <p>>  You can call the [DescribeVulList](~~DescribeVulList~~) operation to query the tags that are added to vulnerabilities of other types.</p>
     * <br>
     * <p>*   **isFront**: specifies whether a pre-patch is required to fix the Windows system vulnerability. This field is required only for Windows system vulnerabilities. Valid values:</p>
     * <br>
     * <p>    *   **0**: no</p>
     * <p>    *   **1**: yes</p>
     * <br>
     * <p>>  You can fix multiple vulnerabilities at a time. Separate the details of multiple vulnerabilities with commas (,). You can call the [DescribeVulLIst](~~DescribeVulList~~) operation to query the details of vulnerabilities.</p>
     */
    @NameInMap("Info")
    public String info;

    /**
     * <p>The operation that you want to perform on the vulnerability. Valid values:</p>
     * <br>
     * <p>*   **vul_fix**: fixes the vulnerability.</p>
     * <p>*   **vul_verify**: verifies the vulnerability fix.</p>
     * <p>*   **vul_ignore**: ignores the vulnerability.</p>
     * <p>*   **vul\_undo_ignore**: cancels ignoring the vulnerability.</p>
     * <p>*   **vul_delete**: deletes the vulnerability.</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    /**
     * <p>The reason why the vulnerability is **ignored**.</p>
     * <br>
     * <p>>  This parameter is required only when you set **OperateType** to **vul_ignore**.</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The type of the vulnerability. Valid values:</p>
     * <br>
     * <p>*   **cve**: Linux software vulnerability</p>
     * <p>*   **sys**: Windows system vulnerability</p>
     * <p>*   **cms**: Web-CMS vulnerability</p>
     * <p>*   **emg**: urgent vulnerability</p>
     * <p>*   **app**: application vulnerability</p>
     * <p>*   **sca**: vulnerability that is detected based on software component analysis</p>
     * <br>
     * <p>>  You cannot fix the urgent vulnerabilities, application vulnerabilities, or vulnerabilities that are detected based on software component analysis.</p>
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
