// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisAtomicofnodeRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static QueryHasDiagnosisAtomicofnodeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisAtomicofnodeRequest self = new QueryHasDiagnosisAtomicofnodeRequest();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisAtomicofnodeRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryHasDiagnosisAtomicofnodeRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
