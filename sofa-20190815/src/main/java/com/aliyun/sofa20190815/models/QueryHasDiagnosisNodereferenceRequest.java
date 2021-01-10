// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisNodereferenceRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static QueryHasDiagnosisNodereferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisNodereferenceRequest self = new QueryHasDiagnosisNodereferenceRequest();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisNodereferenceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
