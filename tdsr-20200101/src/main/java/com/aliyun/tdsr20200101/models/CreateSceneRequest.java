// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class CreateSceneRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("ProjectId")
    public String projectId;

    public static CreateSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSceneRequest self = new CreateSceneRequest();
        return TeaModel.build(map, self);
    }

}
