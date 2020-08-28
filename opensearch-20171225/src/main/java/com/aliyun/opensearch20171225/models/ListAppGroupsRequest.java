// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListAppGroupsRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    public ListAppGroupsQuery query;

    public static ListAppGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppGroupsRequest self = new ListAppGroupsRequest();
        return TeaModel.build(map, self);
    }

}
