// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListProjectModifyRecordsRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static ListProjectModifyRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectModifyRecordsRequest self = new ListProjectModifyRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectModifyRecordsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
