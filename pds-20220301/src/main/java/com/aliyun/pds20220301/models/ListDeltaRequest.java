// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListDeltaRequest extends TeaModel {
    /**
     * <p>The cursor.</p>
     * 
     * <strong>example:</strong>
     * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
     */
    @NameInMap("cursor")
    public String cursor;

    /**
     * <p>The space ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The maximum number of resources to return. Valid values: 0 to 100. Default value: 100.</p>
     * <p>The number of returned results can be less than the specified number but cannot exceed it.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The file ID of the root node of the sync folder.</p>
     * 
     * <strong>example:</strong>
     * <p>622fb09598ae66777c7040109a16f49381f6abe1</p>
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
