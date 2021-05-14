// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyRiskSingleResultStatusRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Status")
    public String status;

    @NameInMap("TaskId")
    public Long taskId;

    @NameInMap("Ids")
    public java.util.List<String> ids;

    public static ModifyRiskSingleResultStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRiskSingleResultStatusRequest self = new ModifyRiskSingleResultStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRiskSingleResultStatusRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyRiskSingleResultStatusRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyRiskSingleResultStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyRiskSingleResultStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ModifyRiskSingleResultStatusRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public ModifyRiskSingleResultStatusRequest setIds(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<String> getIds() {
        return this.ids;
    }

}
