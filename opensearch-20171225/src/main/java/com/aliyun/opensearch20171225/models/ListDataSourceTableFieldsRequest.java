// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListDataSourceTableFieldsRequest extends TeaModel {
    @NameInMap("params")
    public String params;

    public static ListDataSourceTableFieldsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceTableFieldsRequest self = new ListDataSourceTableFieldsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataSourceTableFieldsRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
