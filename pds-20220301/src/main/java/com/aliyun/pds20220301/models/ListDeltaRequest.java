// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListDeltaRequest extends TeaModel {
    @NameInMap("cursor")
    public String cursor;

    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("limit")
    public Integer limit;

    @NameInMap("sync_root_id")
    public String syncRootId;

    public static ListDeltaRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeltaRequest self = new ListDeltaRequest();
        return TeaModel.build(map, self);
    }

    public ListDeltaRequest setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    public String getCursor() {
        return this.cursor;
    }

    public ListDeltaRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public ListDeltaRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListDeltaRequest setSyncRootId(String syncRootId) {
        this.syncRootId = syncRootId;
        return this;
    }
    public String getSyncRootId() {
        return this.syncRootId;
    }

}
