// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasDiagnosisNodeRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static DeleteHasDiagnosisNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasDiagnosisNodeRequest self = new DeleteHasDiagnosisNodeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHasDiagnosisNodeRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
