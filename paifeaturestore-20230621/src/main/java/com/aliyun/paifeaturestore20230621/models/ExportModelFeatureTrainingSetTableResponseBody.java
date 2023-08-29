// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ExportModelFeatureTrainingSetTableResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ExportModelFeatureTrainingSetTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportModelFeatureTrainingSetTableResponseBody self = new ExportModelFeatureTrainingSetTableResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportModelFeatureTrainingSetTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
