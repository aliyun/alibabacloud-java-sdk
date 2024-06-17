// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListTablesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("newMode")
    public Boolean newMode;

    public static ListTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTablesRequest self = new ListTablesRequest();
        return TeaModel.build(map, self);
    }

    public ListTablesRequest setNewMode(Boolean newMode) {
        this.newMode = newMode;
        return this;
    }
    public Boolean getNewMode() {
        return this.newMode;
    }

}
