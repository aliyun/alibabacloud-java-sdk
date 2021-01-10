// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasDiagnosisPlantriggerRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static CreateHasDiagnosisPlantriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHasDiagnosisPlantriggerRequest self = new CreateHasDiagnosisPlantriggerRequest();
        return TeaModel.build(map, self);
    }

    public CreateHasDiagnosisPlantriggerRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateHasDiagnosisPlantriggerRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
