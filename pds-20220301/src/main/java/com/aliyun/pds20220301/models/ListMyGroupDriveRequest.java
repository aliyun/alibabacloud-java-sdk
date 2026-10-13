// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListMyGroupDriveRequest extends TeaModel {
    /**
     * <p>The name of the drive.</p>
     */
    @NameInMap("drive_name")
    public String driveName;

    /**
     * <p>The maximum number of group drives to return. The maximum value is 100. If you do not specify this parameter, the default value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>A pagination token. Set this parameter to the value of <code>next_marker</code> from a previous response to retrieve the next page of results. If you do not set this parameter, the query starts from the beginning of the collection.</p>
     * 
     * <strong>example:</strong>
     * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
     */
    @NameInMap("marker")
    public String marker;

    public static ListMyGroupDriveRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMyGroupDriveRequest self = new ListMyGroupDriveRequest();
        return TeaModel.build(map, self);
    }

    public ListMyGroupDriveRequest setDriveName(String driveName) {
        this.driveName = driveName;
        return this;
    }
    public String getDriveName() {
        return this.driveName;
    }

    public ListMyGroupDriveRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListMyGroupDriveRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

}
