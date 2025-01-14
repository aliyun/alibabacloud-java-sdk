// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class UpdateVideoAnalysisConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("asyncConcurrency")
    public Integer asyncConcurrency;

    public static UpdateVideoAnalysisConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoAnalysisConfigRequest self = new UpdateVideoAnalysisConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVideoAnalysisConfigRequest setAsyncConcurrency(Integer asyncConcurrency) {
        this.asyncConcurrency = asyncConcurrency;
        return this;
    }
    public Integer getAsyncConcurrency() {
        return this.asyncConcurrency;
    }

}
