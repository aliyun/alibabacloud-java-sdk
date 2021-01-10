// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisMhstaskdetailRequest extends TeaModel {
    @NameInMap("ExecutionId")
    public String executionId;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static QueryHasDiagnosisMhstaskdetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisMhstaskdetailRequest self = new QueryHasDiagnosisMhstaskdetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisMhstaskdetailRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public QueryHasDiagnosisMhstaskdetailRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
