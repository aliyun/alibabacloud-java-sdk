// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListConfigHistoryShrinkRequest extends TeaModel {
    // listConfigHistoryParam
    @NameInMap("listConfigHistoryParam")
    public String listConfigHistoryParamShrink;

    public static ListConfigHistoryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConfigHistoryShrinkRequest self = new ListConfigHistoryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListConfigHistoryShrinkRequest setListConfigHistoryParamShrink(String listConfigHistoryParamShrink) {
        this.listConfigHistoryParamShrink = listConfigHistoryParamShrink;
        return this;
    }
    public String getListConfigHistoryParamShrink() {
        return this.listConfigHistoryParamShrink;
    }

}
