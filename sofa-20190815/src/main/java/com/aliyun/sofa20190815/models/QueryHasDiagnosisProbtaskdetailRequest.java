// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisProbtaskdetailRequest extends TeaModel {
    @NameInMap("ExecutionId")
    public String executionId;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static QueryHasDiagnosisProbtaskdetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisProbtaskdetailRequest self = new QueryHasDiagnosisProbtaskdetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisProbtaskdetailRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public QueryHasDiagnosisProbtaskdetailRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
