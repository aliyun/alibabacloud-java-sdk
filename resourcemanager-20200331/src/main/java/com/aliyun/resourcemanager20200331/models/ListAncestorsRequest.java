// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListAncestorsRequest extends TeaModel {
    /**
     * <p>The ID of the child folder.</p>
     */
    @NameInMap("ChildId")
    public String childId;

    public static ListAncestorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAncestorsRequest self = new ListAncestorsRequest();
        return TeaModel.build(map, self);
    }

    public ListAncestorsRequest setChildId(String childId) {
        this.childId = childId;
        return this;
    }
    public String getChildId() {
        return this.childId;
    }

}
