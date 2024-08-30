// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class UpdateTrainingJobLabelsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F082BD0D-21E1-5F9B-81A0-AB07485B03CD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateTrainingJobLabelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrainingJobLabelsResponseBody self = new UpdateTrainingJobLabelsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTrainingJobLabelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
