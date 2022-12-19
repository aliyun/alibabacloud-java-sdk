// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyRiskSingleResultStatusRequest extends TeaModel {
    // The IDs of the affected assets.
    @NameInMap("Ids")
    public java.util.List<String> ids;

    // The language of the content within the request and response. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The method to handle the risk item. Valid values:
    // 
    // *   **ignored**: ignores the risk item.
    // *   **failed**: cancels the ignore operation on the risk item.
    @NameInMap("Status")
    public String status;

    // The ID of the check task to which the affected asset belongs.
    @NameInMap("TaskId")
    public Long taskId;

    public static ModifyRiskSingleResultStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRiskSingleResultStatusRequest self = new ModifyRiskSingleResultStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRiskSingleResultStatusRequest setIds(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<String> getIds() {
        return this.ids;
    }

    public ModifyRiskSingleResultStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyRiskSingleResultStatusRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyRiskSingleResultStatusRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
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

}
