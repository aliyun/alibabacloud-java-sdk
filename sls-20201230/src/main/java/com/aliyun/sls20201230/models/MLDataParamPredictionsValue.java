// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class MLDataParamPredictionsValue extends TeaModel {
    @NameInMap("annotatedBy")
    public String annotatedBy;

    @NameInMap("updateTime")
    public Long updateTime;

    @NameInMap("results")
    public java.util.List<java.util.Map<String, String>> results;

    public static MLDataParamPredictionsValue build(java.util.Map<String, ?> map) throws Exception {
        MLDataParamPredictionsValue self = new MLDataParamPredictionsValue();
        return TeaModel.build(map, self);
    }

    public MLDataParamPredictionsValue setAnnotatedBy(String annotatedBy) {
        this.annotatedBy = annotatedBy;
        return this;
    }
    public String getAnnotatedBy() {
        return this.annotatedBy;
    }

    public MLDataParamPredictionsValue setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public MLDataParamPredictionsValue setResults(java.util.List<java.util.Map<String, String>> results) {
        this.results = results;
        return this;
    }
    public java.util.List<java.util.Map<String, String>> getResults() {
        return this.results;
    }

}
