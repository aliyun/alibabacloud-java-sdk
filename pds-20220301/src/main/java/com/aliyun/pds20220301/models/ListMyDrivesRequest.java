// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListMyDrivesRequest extends TeaModel {
    /**
     * <p>The maximum number of results to return. Valid values: 1 to 100. Default: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The pagination token used to retrieve the next page of results. This parameter is not required for the first request. For subsequent requests, set this parameter to the <code>next_marker</code> value from the previous response. If this parameter is omitted, the query starts from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
     */
    @NameInMap("marker")
    public String marker;

    public static ListMyDrivesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMyDrivesRequest self = new ListMyDrivesRequest();
        return TeaModel.build(map, self);
    }

    public ListMyDrivesRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListMyDrivesRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

}
