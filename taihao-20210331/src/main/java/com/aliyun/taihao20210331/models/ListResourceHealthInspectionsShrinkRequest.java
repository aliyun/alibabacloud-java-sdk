// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListResourceHealthInspectionsShrinkRequest extends TeaModel {
    // listResourceHealthInspectionsParam
    @NameInMap("listResourceHealthInspectionsParam")
    public String listResourceHealthInspectionsParamShrink;

    public static ListResourceHealthInspectionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceHealthInspectionsShrinkRequest self = new ListResourceHealthInspectionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceHealthInspectionsShrinkRequest setListResourceHealthInspectionsParamShrink(String listResourceHealthInspectionsParamShrink) {
        this.listResourceHealthInspectionsParamShrink = listResourceHealthInspectionsParamShrink;
        return this;
    }
    public String getListResourceHealthInspectionsParamShrink() {
        return this.listResourceHealthInspectionsParamShrink;
    }

}
