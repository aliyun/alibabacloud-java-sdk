// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DeleteAnalysisConditionFavoriteResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("resultObject")
    public Boolean resultObject;

    public static DeleteAnalysisConditionFavoriteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAnalysisConditionFavoriteResponseBody self = new DeleteAnalysisConditionFavoriteResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAnalysisConditionFavoriteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteAnalysisConditionFavoriteResponseBody setResultObject(Boolean resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Boolean getResultObject() {
        return this.resultObject;
    }

}
