// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListRecyclebinRequest extends TeaModel {
    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("fields")
    public String fields;

    @NameInMap("limit")
    public Integer limit;

    @NameInMap("marker")
    public String marker;

    public static ListRecyclebinRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRecyclebinRequest self = new ListRecyclebinRequest();
        return TeaModel.build(map, self);
    }

    public ListRecyclebinRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public ListRecyclebinRequest setFields(String fields) {
        this.fields = fields;
        return this;
    }
    public String getFields() {
        return this.fields;
    }

    public ListRecyclebinRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListRecyclebinRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

}
