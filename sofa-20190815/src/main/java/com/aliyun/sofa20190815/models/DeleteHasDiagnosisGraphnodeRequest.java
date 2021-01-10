// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasDiagnosisGraphnodeRequest extends TeaModel {
    @NameInMap("Dummy")
    public String dummy;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static DeleteHasDiagnosisGraphnodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasDiagnosisGraphnodeRequest self = new DeleteHasDiagnosisGraphnodeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHasDiagnosisGraphnodeRequest setDummy(String dummy) {
        this.dummy = dummy;
        return this;
    }
    public String getDummy() {
        return this.dummy;
    }

    public DeleteHasDiagnosisGraphnodeRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
