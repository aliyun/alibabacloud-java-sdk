// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class CreateDataSetRequest extends TeaModel {
    @NameInMap("name")
    public String name;

    @NameInMap("type")
    public String type;

    public static CreateDataSetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataSetRequest self = new CreateDataSetRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataSetRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDataSetRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
