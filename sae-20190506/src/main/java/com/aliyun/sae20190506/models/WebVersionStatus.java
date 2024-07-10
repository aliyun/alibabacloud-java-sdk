// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebVersionStatus extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Status")
    public String status;

    public static WebVersionStatus build(java.util.Map<String, ?> map) throws Exception {
        WebVersionStatus self = new WebVersionStatus();
        return TeaModel.build(map, self);
    }

    public WebVersionStatus setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public WebVersionStatus setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
