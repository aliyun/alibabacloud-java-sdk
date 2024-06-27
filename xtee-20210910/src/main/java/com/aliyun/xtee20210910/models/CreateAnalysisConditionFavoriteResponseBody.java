// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateAnalysisConditionFavoriteResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("resultObject")
    public Boolean resultObject;

    public static CreateAnalysisConditionFavoriteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAnalysisConditionFavoriteResponseBody self = new CreateAnalysisConditionFavoriteResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAnalysisConditionFavoriteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAnalysisConditionFavoriteResponseBody setResultObject(Boolean resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Boolean getResultObject() {
        return this.resultObject;
    }

}
