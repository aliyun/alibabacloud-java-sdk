// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListApplicationMetaShrinkRequest extends TeaModel {
    // listApplicationMetaParam
    @NameInMap("listApplicationMetaParam")
    public String listApplicationMetaParamShrink;

    public static ListApplicationMetaShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationMetaShrinkRequest self = new ListApplicationMetaShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationMetaShrinkRequest setListApplicationMetaParamShrink(String listApplicationMetaParamShrink) {
        this.listApplicationMetaParamShrink = listApplicationMetaParamShrink;
        return this;
    }
    public String getListApplicationMetaParamShrink() {
        return this.listApplicationMetaParamShrink;
    }

}
