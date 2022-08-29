// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class WalkFileRequest extends TeaModel {
    @NameInMap("category")
    public String category;

    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("fields")
    public String fields;

    @NameInMap("limit")
    public Integer limit;

    @NameInMap("marker")
    public String marker;

    @NameInMap("order_by")
    public String orderBy;

    @NameInMap("order_direction")
    public String orderDirection;

    @NameInMap("parent_file_id")
    public String parentFileId;

    @NameInMap("status")
    public String status;

    @NameInMap("type")
    public String type;

    public static WalkFileRequest build(java.util.Map<String, ?> map) throws Exception {
        WalkFileRequest self = new WalkFileRequest();
        return TeaModel.build(map, self);
    }

    public WalkFileRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public WalkFileRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public WalkFileRequest setFields(String fields) {
        this.fields = fields;
        return this;
    }
    public String getFields() {
        return this.fields;
    }

    public WalkFileRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public WalkFileRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public WalkFileRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public WalkFileRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public WalkFileRequest setParentFileId(String parentFileId) {
        this.parentFileId = parentFileId;
        return this;
    }
    public String getParentFileId() {
        return this.parentFileId;
    }

    public WalkFileRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public WalkFileRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
