// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockProcessStatusRequest extends TeaModel {
    /**
     * <p>Specifies whether to change the status of the process on multiple servers on which the process runs at the same time. Valid values:</p>
     * <br>
     * <p>*   **0**: no</p>
     * <p>*   **1**: yes</p>
     */
    @NameInMap("DealAll")
    public Integer dealAll;

    /**
     * <p>The parameters required to change the status of multiple processes at a time. The value is in the JSON format.</p>
     */
    @NameInMap("OperateInfo")
    public String operateInfo;

    /**
     * <p>The paths to the processes.</p>
     */
    @NameInMap("ProcessPath")
    public java.util.List<String> processPath;

    /**
     * <p>The status of the process. Valid values:</p>
     * <br>
     * <p>*   **0**: cancels adding the process to the process whitelist</p>
     * <p>*   **1**: adds the process to the process whitelist</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The UUID of the server.</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static ModifyWebLockProcessStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebLockProcessStatusRequest self = new ModifyWebLockProcessStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWebLockProcessStatusRequest setDealAll(Integer dealAll) {
        this.dealAll = dealAll;
        return this;
    }
    public Integer getDealAll() {
        return this.dealAll;
    }

    public ModifyWebLockProcessStatusRequest setOperateInfo(String operateInfo) {
        this.operateInfo = operateInfo;
        return this;
    }
    public String getOperateInfo() {
        return this.operateInfo;
    }

    public ModifyWebLockProcessStatusRequest setProcessPath(java.util.List<String> processPath) {
        this.processPath = processPath;
        return this;
    }
    public java.util.List<String> getProcessPath() {
        return this.processPath;
    }

    public ModifyWebLockProcessStatusRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ModifyWebLockProcessStatusRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
