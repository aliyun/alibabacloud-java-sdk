// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class ListParentsRequest extends TeaModel {
    @NameInMap("ChildId")
    public String childId;

    public static ListParentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListParentsRequest self = new ListParentsRequest();
        return TeaModel.build(map, self);
    }

    public ListParentsRequest setChildId(String childId) {
        this.childId = childId;
        return this;
    }
    public String getChildId() {
        return this.childId;
    }

}
