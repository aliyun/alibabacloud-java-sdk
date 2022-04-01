// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DeleteStackApplicationRequest extends TeaModel {
    @NameInMap("deleteStackApplicationParam")
    public DeleteStackApplicationParam deleteStackApplicationParam;

    public static DeleteStackApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStackApplicationRequest self = new DeleteStackApplicationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStackApplicationRequest setDeleteStackApplicationParam(DeleteStackApplicationParam deleteStackApplicationParam) {
        this.deleteStackApplicationParam = deleteStackApplicationParam;
        return this;
    }
    public DeleteStackApplicationParam getDeleteStackApplicationParam() {
        return this.deleteStackApplicationParam;
    }

}
