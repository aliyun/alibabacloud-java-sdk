// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryDiscoverDatabaseRequest extends TeaModel {
    /**
     * <p>The ID of the scan task.</p>
     * <br>
     * <p>> You can call the [StartDiscoverDatabaseTask](~~StartDiscoverDatabaseTask~~) operation to query the ID of the task.</p>
     */
    @NameInMap("CreateMark")
    public String createMark;

    public static QueryDiscoverDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDiscoverDatabaseRequest self = new QueryDiscoverDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public QueryDiscoverDatabaseRequest setCreateMark(String createMark) {
        this.createMark = createMark;
        return this;
    }
    public String getCreateMark() {
        return this.createMark;
    }

}
