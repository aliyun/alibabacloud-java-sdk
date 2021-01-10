// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class OnlineBuildpackRequest extends TeaModel {
    @NameInMap("IdRepeatList")
    public java.util.List<String> idRepeatList;

    public static OnlineBuildpackRequest build(java.util.Map<String, ?> map) throws Exception {
        OnlineBuildpackRequest self = new OnlineBuildpackRequest();
        return TeaModel.build(map, self);
    }

    public OnlineBuildpackRequest setIdRepeatList(java.util.List<String> idRepeatList) {
        this.idRepeatList = idRepeatList;
        return this;
    }
    public java.util.List<String> getIdRepeatList() {
        return this.idRepeatList;
    }

}
