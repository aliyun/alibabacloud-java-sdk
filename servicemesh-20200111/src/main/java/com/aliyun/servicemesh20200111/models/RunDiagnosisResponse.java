// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class RunDiagnosisResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Result")
    @Validation(required = true)
    public String result;

    public static RunDiagnosisResponse build(java.util.Map<String, ?> map) throws Exception {
        RunDiagnosisResponse self = new RunDiagnosisResponse();
        return TeaModel.build(map, self);
    }

}
