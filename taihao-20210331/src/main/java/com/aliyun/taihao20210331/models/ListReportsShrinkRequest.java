// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListReportsShrinkRequest extends TeaModel {
    @NameInMap("listReportsParam")
    public String listReportsParamShrink;

    public static ListReportsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListReportsShrinkRequest self = new ListReportsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListReportsShrinkRequest setListReportsParamShrink(String listReportsParamShrink) {
        this.listReportsParamShrink = listReportsParamShrink;
        return this;
    }
    public String getListReportsParamShrink() {
        return this.listReportsParamShrink;
    }

}
