// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasDiagnosisNodebindruleRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static ExecHasDiagnosisNodebindruleRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecHasDiagnosisNodebindruleRequest self = new ExecHasDiagnosisNodebindruleRequest();
        return TeaModel.build(map, self);
    }

    public ExecHasDiagnosisNodebindruleRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ExecHasDiagnosisNodebindruleRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
