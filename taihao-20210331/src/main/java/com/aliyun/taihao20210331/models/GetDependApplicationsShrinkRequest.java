// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetDependApplicationsShrinkRequest extends TeaModel {
    // listApplicationsParam
    @NameInMap("getDependApplicationsParam")
    public String getDependApplicationsParamShrink;

    public static GetDependApplicationsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDependApplicationsShrinkRequest self = new GetDependApplicationsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetDependApplicationsShrinkRequest setGetDependApplicationsParamShrink(String getDependApplicationsParamShrink) {
        this.getDependApplicationsParamShrink = getDependApplicationsParamShrink;
        return this;
    }
    public String getGetDependApplicationsParamShrink() {
        return this.getDependApplicationsParamShrink;
    }

}
