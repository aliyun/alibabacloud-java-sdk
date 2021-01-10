// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasDiagnosisGraphnodeRequest extends TeaModel {
    @NameInMap("Dummy")
    public String dummy;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static UpdateHasDiagnosisGraphnodeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasDiagnosisGraphnodeRequest self = new UpdateHasDiagnosisGraphnodeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHasDiagnosisGraphnodeRequest setDummy(String dummy) {
        this.dummy = dummy;
        return this;
    }
    public String getDummy() {
        return this.dummy;
    }

    public UpdateHasDiagnosisGraphnodeRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
