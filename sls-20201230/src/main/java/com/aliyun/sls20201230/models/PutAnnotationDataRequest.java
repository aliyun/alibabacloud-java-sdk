// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class PutAnnotationDataRequest extends TeaModel {
    @NameInMap("annotationdataId")
    public String annotationdataId;

    @NameInMap("mlDataParam")
    public MLDataParam mlDataParam;

    @NameInMap("rawLog")
    public java.util.List<java.util.Map<String, String>> rawLog;

    public static PutAnnotationDataRequest build(java.util.Map<String, ?> map) throws Exception {
        PutAnnotationDataRequest self = new PutAnnotationDataRequest();
        return TeaModel.build(map, self);
    }

    public PutAnnotationDataRequest setAnnotationdataId(String annotationdataId) {
        this.annotationdataId = annotationdataId;
        return this;
    }
    public String getAnnotationdataId() {
        return this.annotationdataId;
    }

    public PutAnnotationDataRequest setMlDataParam(MLDataParam mlDataParam) {
        this.mlDataParam = mlDataParam;
        return this;
    }
    public MLDataParam getMlDataParam() {
        return this.mlDataParam;
    }

    public PutAnnotationDataRequest setRawLog(java.util.List<java.util.Map<String, String>> rawLog) {
        this.rawLog = rawLog;
        return this;
    }
    public java.util.List<java.util.Map<String, String>> getRawLog() {
        return this.rawLog;
    }

}
