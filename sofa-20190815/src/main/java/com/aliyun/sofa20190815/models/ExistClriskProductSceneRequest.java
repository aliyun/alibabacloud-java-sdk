// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExistClriskProductSceneRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("Name")
    public String name;

    public static ExistClriskProductSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        ExistClriskProductSceneRequest self = new ExistClriskProductSceneRequest();
        return TeaModel.build(map, self);
    }

    public ExistClriskProductSceneRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ExistClriskProductSceneRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
