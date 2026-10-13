// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListFacegroupsRequest extends TeaModel {
    /**
     * <p>The drive ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The maximum number of results to return. Valid values: 1 to 100. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The pagination token. The results are returned in alphabetical order, starting from the item that follows the specified token. If you omit this parameter, the query starts from the beginning.<br>Default value: None<br></p>
     * 
     * <strong>example:</strong>
     * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
     */
    @NameInMap("marker")
    public String marker;

    /**
     * <p>Filters query results by exactly matching the remarks. The maximum length is 128 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>John Doe</p>
     */
    @NameInMap("remarks")
    public String remarks;

    /**
     * <p>Specifies whether to return the total count of face groups found.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
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
