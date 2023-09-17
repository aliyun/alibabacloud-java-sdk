// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class MLDataParamAnnotationsValue extends TeaModel {
    @NameInMap("annotatedBy")
    public String annotatedBy;

    @NameInMap("updateTime")
    public Long updateTime;

    @NameInMap("results")
    public java.util.List<java.util.Map<String, String>> results;

    public static MLDataParamAnnotationsValue build(java.util.Map<String, ?> map) throws Exception {
        MLDataParamAnnotationsValue self = new MLDataParamAnnotationsValue();
        return TeaModel.build(map, self);
    }

    public MLDataParamAnnotationsValue setAnnotatedBy(String annotatedBy) {
        this.annotatedBy = annotatedBy;
        return this;
    }
    public String getAnnotatedBy() {
        return this.annotatedBy;
    }

    public MLDataParamAnnotationsValue setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public MLDataParamAnnotationsValue setResults(java.util.List<java.util.Map<String, String>> results) {
        this.results = results;
        return this;
    }
    public java.util.List<java.util.Map<String, String>> getResults() {
        return this.results;
    }

}
