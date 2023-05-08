// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockProcessStatusRequest extends TeaModel {
    @NameInMap("DealAll")
    public Integer dealAll;

    @NameInMap("OperateInfo")
    public String operateInfo;

    @NameInMap("ProcessPath")
    public java.util.List<String> processPath;

    @NameInMap("Status")
    public Integer status;

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
