// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListDataSourceTablesRequest extends TeaModel {
    /**
     * <p>N/A</p>
     */
    @NameInMap("params")
    public String params;

    public static ListDataSourceTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceTablesRequest self = new ListDataSourceTablesRequest();
        return TeaModel.build(map, self);
    }

    public ListDataSourceTablesRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
