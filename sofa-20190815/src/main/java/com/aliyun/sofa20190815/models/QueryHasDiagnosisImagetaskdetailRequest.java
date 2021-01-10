// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisImagetaskdetailRequest extends TeaModel {
    @NameInMap("ExecutionId")
    public String executionId;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static QueryHasDiagnosisImagetaskdetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisImagetaskdetailRequest self = new QueryHasDiagnosisImagetaskdetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisImagetaskdetailRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public QueryHasDiagnosisImagetaskdetailRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
