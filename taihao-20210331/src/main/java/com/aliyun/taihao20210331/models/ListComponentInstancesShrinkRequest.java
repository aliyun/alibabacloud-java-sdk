// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListComponentInstancesShrinkRequest extends TeaModel {
    // listComponentsParam
    @NameInMap("listComponentInstancesParam")
    public String listComponentInstancesParamShrink;

    public static ListComponentInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListComponentInstancesShrinkRequest self = new ListComponentInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListComponentInstancesShrinkRequest setListComponentInstancesParamShrink(String listComponentInstancesParamShrink) {
        this.listComponentInstancesParamShrink = listComponentInstancesParamShrink;
        return this;
    }
    public String getListComponentInstancesParamShrink() {
        return this.listComponentInstancesParamShrink;
    }

}
