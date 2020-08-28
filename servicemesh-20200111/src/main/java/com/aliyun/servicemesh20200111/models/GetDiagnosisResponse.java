// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetDiagnosisResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Result")
    @Validation(required = true)
    public String result;

    public static GetDiagnosisResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDiagnosisResponse self = new GetDiagnosisResponse();
        return TeaModel.build(map, self);
    }

}
