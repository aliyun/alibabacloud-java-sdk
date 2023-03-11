// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyRiskCheckStatusRequest extends TeaModel {
    /**
     * <p>The ID of the check item.</p>
     */
    @NameInMap("ItemId")
    public Long itemId;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The method to handle the check item. Valid values:</p>
     * <br>
     * <p>*   **ignored**: ignores the check item</p>
     * <p>*   **reset**: cancels ignoring the check item</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the check task to which the check item belongs.</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static ModifyRiskCheckStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRiskCheckStatusRequest self = new ModifyRiskCheckStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRiskCheckStatusRequest setItemId(Long itemId) {
        this.itemId = itemId;
        return this;
    }
    public Long getItemId() {
        return this.itemId;
    }

    public ModifyRiskCheckStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyRiskCheckStatusRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyRiskCheckStatusRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyRiskCheckStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ModifyRiskCheckStatusRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
