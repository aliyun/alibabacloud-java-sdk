// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class AddClusterApplicationRequest extends TeaModel {
    @NameInMap("addApplicationParam")
    public AddApplicationParam addApplicationParam;

    public static AddClusterApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        AddClusterApplicationRequest self = new AddClusterApplicationRequest();
        return TeaModel.build(map, self);
    }

    public AddClusterApplicationRequest setAddApplicationParam(AddApplicationParam addApplicationParam) {
        this.addApplicationParam = addApplicationParam;
        return this;
    }
    public AddApplicationParam getAddApplicationParam() {
        return this.addApplicationParam;
    }

}
