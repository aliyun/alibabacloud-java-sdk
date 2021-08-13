// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class CreateTaskShrinkRequest extends TeaModel {
    @NameInMap("DigTaskInfoParam")
    public String digTaskInfoParamShrink;

    public static CreateTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskShrinkRequest self = new CreateTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateTaskShrinkRequest setDigTaskInfoParamShrink(String digTaskInfoParamShrink) {
        this.digTaskInfoParamShrink = digTaskInfoParamShrink;
        return this;
    }
    public String getDigTaskInfoParamShrink() {
        return this.digTaskInfoParamShrink;
    }

}
