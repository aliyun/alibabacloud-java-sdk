// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasDiagnosisPlanRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static DeleteHasDiagnosisPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasDiagnosisPlanRequest self = new DeleteHasDiagnosisPlanRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHasDiagnosisPlanRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
