// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateStackApplicationRequest extends TeaModel {
    // createApplicationParam
    @NameInMap("createStackApplicationParam")
    public CreateStackApplicationParam createStackApplicationParam;

    public static CreateStackApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStackApplicationRequest self = new CreateStackApplicationRequest();
        return TeaModel.build(map, self);
    }

    public CreateStackApplicationRequest setCreateStackApplicationParam(CreateStackApplicationParam createStackApplicationParam) {
        this.createStackApplicationParam = createStackApplicationParam;
        return this;
    }
    public CreateStackApplicationParam getCreateStackApplicationParam() {
        return this.createStackApplicationParam;
    }

}
