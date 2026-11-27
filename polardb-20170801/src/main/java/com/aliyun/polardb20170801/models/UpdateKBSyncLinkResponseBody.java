// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdateKBSyncLinkResponseBody extends TeaModel {
    /**
     * <p>The ID of the synchronization link.</p>
     * 
     * <strong>example:</strong>
     * <p>pkbl-xxxxx</p>
     */
    @NameInMap("LinkId")
    public String linkId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EBEAA83D-1734-42E3-85E3-E25F6E******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returns the current configuration, which does not indicate that the synchronization is complete. This parameter may not be returned if it is not set.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECTED</p>
     */
    @NameInMap("SelectionMode")
    public String selectionMode;

    /**
     * <p>Returns the current configuration, which does not indicate that the synchronization is complete. This parameter may not be returned if it is not set.</p>
     */
    @NameInMap("SelectionRules")
    public String selectionRules;

    /**
     * <p>The scheduled time of the synchronization task.</p>
     */
    @NameInMap("SyncSchedule")
    public String syncSchedule;

    /**
     * <p>The ID of the asynchronous configuration task.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("TaskId")
    public Integer taskId;

    public static UpdateKBSyncLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateKBSyncLinkResponseBody self = new UpdateKBSyncLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateKBSyncLinkResponseBody setLinkId(String linkId) {
        this.linkId = linkId;
        return this;
    }
    public String getLinkId() {
        return this.linkId;
    }

    public UpdateKBSyncLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateKBSyncLinkResponseBody setSelectionMode(String selectionMode) {
        this.selectionMode = selectionMode;
        return this;
    }
    public String getSelectionMode() {
        return this.selectionMode;
    }

    public UpdateKBSyncLinkResponseBody setSelectionRules(String selectionRules) {
        this.selectionRules = selectionRules;
        return this;
    }
    public String getSelectionRules() {
        return this.selectionRules;
    }

    public UpdateKBSyncLinkResponseBody setSyncSchedule(String syncSchedule) {
        this.syncSchedule = syncSchedule;
        return this;
    }
    public String getSyncSchedule() {
        return this.syncSchedule;
    }

    public UpdateKBSyncLinkResponseBody setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

}
