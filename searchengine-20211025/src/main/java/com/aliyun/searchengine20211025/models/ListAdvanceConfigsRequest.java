// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListAdvanceConfigsRequest extends TeaModel {
    @NameInMap("type")
    public String type;

    public static ListAdvanceConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAdvanceConfigsRequest self = new ListAdvanceConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListAdvanceConfigsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
