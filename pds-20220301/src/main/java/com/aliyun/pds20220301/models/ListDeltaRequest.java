// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListDeltaRequest extends TeaModel {
    /**
     * <p>The cursor of the incremental information.</p>
     */
    @NameInMap("cursor")
    public String cursor;

    /**
     * <p>The drive ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The maximum number of results to return. Valid values: 0 to 100. Default value: 100.</p>
     * <br>
     * <p>The number of returned results must be less than or equal to the specified number.</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The ID of the root file of the synced folder.</p>
     */
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
