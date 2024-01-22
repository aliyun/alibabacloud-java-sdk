// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class VersionStatus extends TeaModel {
    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("status")
    public String status;

    public static VersionStatus build(java.util.Map<String, ?> map) throws Exception {
        VersionStatus self = new VersionStatus();
        return TeaModel.build(map, self);
    }

    public VersionStatus setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public VersionStatus setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
