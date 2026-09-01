// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdateKBSyncLinkResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pkbl-xxxxx</p>
     */
    @NameInMap("LinkId")
    public String linkId;

    /**
     * <strong>example:</strong>
     * <p>EBEAA83D-1734-42E3-85E3-E25F6E******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SyncSchedule")
    public String syncSchedule;

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

    public UpdateKBSyncLinkResponseBody setSyncSchedule(String syncSchedule) {
        this.syncSchedule = syncSchedule;
        return this;
    }
    public String getSyncSchedule() {
        return this.syncSchedule;
    }

}
