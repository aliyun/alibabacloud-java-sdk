// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListFacegroupsRequest extends TeaModel {
    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("limit")
    public Integer limit;

    @NameInMap("marker")
    public String marker;

    @NameInMap("remarks")
    public String remarks;

    @NameInMap("return_total_count")
    public Boolean returnTotalCount;

    public static ListFacegroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFacegroupsRequest self = new ListFacegroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListFacegroupsRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public ListFacegroupsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListFacegroupsRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListFacegroupsRequest setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }
    public String getRemarks() {
        return this.remarks;
    }

    public ListFacegroupsRequest setReturnTotalCount(Boolean returnTotalCount) {
        this.returnTotalCount = returnTotalCount;
        return this;
    }
    public Boolean getReturnTotalCount() {
        return this.returnTotalCount;
    }

}
