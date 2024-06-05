// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListMyGroupDriveResponseBody extends TeaModel {
    /**
     * <p>The information about the team drives.</p>
     */
    @NameInMap("items")
    public java.util.List<Drive> items;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If next_marker is empty, no next page exists.</p>
     */
    @NameInMap("next_marker")
    public String nextMarker;

    @NameInMap("root_group_drive")
    public Drive rootGroupDrive;

    public static ListMyGroupDriveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMyGroupDriveResponseBody self = new ListMyGroupDriveResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMyGroupDriveResponseBody setItems(java.util.List<Drive> items) {
        this.items = items;
        return this;
    }
    public java.util.List<Drive> getItems() {
        return this.items;
    }

    public ListMyGroupDriveResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

    public ListMyGroupDriveResponseBody setRootGroupDrive(Drive rootGroupDrive) {
        this.rootGroupDrive = rootGroupDrive;
        return this;
    }
    public Drive getRootGroupDrive() {
        return this.rootGroupDrive;
    }

}
