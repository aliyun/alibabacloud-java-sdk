// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListIndexesRequest extends TeaModel {
    /**
     * <p>是否为新版本控制台页面</p>
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
