// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteBuildpacksRequest extends TeaModel {
    @NameInMap("IdRepeatList")
    public java.util.List<String> idRepeatList;

    public static DeleteBuildpacksRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBuildpacksRequest self = new DeleteBuildpacksRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBuildpacksRequest setIdRepeatList(java.util.List<String> idRepeatList) {
        this.idRepeatList = idRepeatList;
        return this;
    }
    public java.util.List<String> getIdRepeatList() {
        return this.idRepeatList;
    }

}
