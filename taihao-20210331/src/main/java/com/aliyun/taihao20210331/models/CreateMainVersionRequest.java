// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateMainVersionRequest extends TeaModel {
    // CreateMainVersionParam
    @NameInMap("CreateMainVersionParam")
    public CreateMainVersionParam createMainVersionParam;

    public static CreateMainVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMainVersionRequest self = new CreateMainVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateMainVersionRequest setCreateMainVersionParam(CreateMainVersionParam createMainVersionParam) {
        this.createMainVersionParam = createMainVersionParam;
        return this;
    }
    public CreateMainVersionParam getCreateMainVersionParam() {
        return this.createMainVersionParam;
    }

}
