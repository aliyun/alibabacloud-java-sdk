// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteClriskProductSceneRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static DeleteClriskProductSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClriskProductSceneRequest self = new DeleteClriskProductSceneRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClriskProductSceneRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
