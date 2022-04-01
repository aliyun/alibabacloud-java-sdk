// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DeleteStackApplicationShrinkRequest extends TeaModel {
    @NameInMap("deleteStackApplicationParam")
    public String deleteStackApplicationParamShrink;

    public static DeleteStackApplicationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStackApplicationShrinkRequest self = new DeleteStackApplicationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStackApplicationShrinkRequest setDeleteStackApplicationParamShrink(String deleteStackApplicationParamShrink) {
        this.deleteStackApplicationParamShrink = deleteStackApplicationParamShrink;
        return this;
    }
    public String getDeleteStackApplicationParamShrink() {
        return this.deleteStackApplicationParamShrink;
    }

}
