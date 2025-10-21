// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class DeleteModelInstanceRequest extends TeaModel {
    @NameInMap("ModelInstanceIdList")
    public java.util.List<Long> modelInstanceIdList;

    public static DeleteModelInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelInstanceRequest self = new DeleteModelInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteModelInstanceRequest setModelInstanceIdList(java.util.List<Long> modelInstanceIdList) {
        this.modelInstanceIdList = modelInstanceIdList;
        return this;
    }
    public java.util.List<Long> getModelInstanceIdList() {
        return this.modelInstanceIdList;
    }

}
