// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListIndexesRequest extends TeaModel {
    /**
     * <p>Specifies whether the OpenSearch Vector Search Edition instance is of the new version.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("newMode")
    public Boolean newMode;

    public static ListIndexesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIndexesRequest self = new ListIndexesRequest();
        return TeaModel.build(map, self);
    }

    public ListIndexesRequest setNewMode(Boolean newMode) {
        this.newMode = newMode;
        return this;
    }
    public Boolean getNewMode() {
        return this.newMode;
    }

}
