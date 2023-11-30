// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListMyGroupDriveRequest extends TeaModel {
    /**
     * <p>The maximum number of results to return. Valid values: 1 to 100. Default value: 100.</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of marker. By default, this parameter is left empty.</p>
     */
    @NameInMap("marker")
    public String marker;

    public static ListMyGroupDriveRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMyGroupDriveRequest self = new ListMyGroupDriveRequest();
        return TeaModel.build(map, self);
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
