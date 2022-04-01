// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListApplicationsShrinkRequest extends TeaModel {
    // listApplicationsParam
    @NameInMap("listApplicationsParam")
    public String listApplicationsParamShrink;

    public static ListApplicationsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsShrinkRequest self = new ListApplicationsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationsShrinkRequest setListApplicationsParamShrink(String listApplicationsParamShrink) {
        this.listApplicationsParamShrink = listApplicationsParamShrink;
        return this;
    }
    public String getListApplicationsParamShrink() {
        return this.listApplicationsParamShrink;
    }

}
