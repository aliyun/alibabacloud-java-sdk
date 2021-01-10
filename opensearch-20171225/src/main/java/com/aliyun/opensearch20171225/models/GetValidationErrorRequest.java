// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetValidationErrorRequest extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    public static GetValidationErrorRequest build(java.util.Map<String, ?> map) throws Exception {
        GetValidationErrorRequest self = new GetValidationErrorRequest();
        return TeaModel.build(map, self);
    }

    public GetValidationErrorRequest setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

}
