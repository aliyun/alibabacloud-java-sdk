// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DeleteClusterUserShrinkRequest extends TeaModel {
    @NameInMap("deleteClusterUserParam")
    public String deleteClusterUserParamShrink;

    public static DeleteClusterUserShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterUserShrinkRequest self = new DeleteClusterUserShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClusterUserShrinkRequest setDeleteClusterUserParamShrink(String deleteClusterUserParamShrink) {
        this.deleteClusterUserParamShrink = deleteClusterUserParamShrink;
        return this;
    }
    public String getDeleteClusterUserParamShrink() {
        return this.deleteClusterUserParamShrink;
    }

}
