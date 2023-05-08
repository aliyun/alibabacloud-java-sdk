// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyOperateVulRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform on the vulnerability. Valid values:</p>
     * <br>
     * <p>*   **vul_fix**: fixes the vulnerability.</p>
     * <p>*   **vul_verify**: verifies the vulnerability fix.</p>
     * <p>*   **vul_ignore**: ignores the vulnerability.</p>
     * <p>*   **vul_undo_ignore**: cancels ignoring the vulnerability.</p>
     * <p>*   **vul_delete**: deletes the vulnerability.</p>
     */
    @NameInMap("Info")
    public String info;

    /**
     * <p>Handles detected vulnerabilities. You can fix or ignore vulnerabilities. You can also verify the vulnerability fixes.</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    @NameInMap("Reason")
    public String reason;

    /**
     * <p>ModifyOperateVul</p>
     */
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
