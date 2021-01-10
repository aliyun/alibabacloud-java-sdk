// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectImagetaskdetailRequest extends TeaModel {
    @NameInMap("ExecutionId")
    public String executionId;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static QueryHasInspectImagetaskdetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectImagetaskdetailRequest self = new QueryHasInspectImagetaskdetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectImagetaskdetailRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public QueryHasInspectImagetaskdetailRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
