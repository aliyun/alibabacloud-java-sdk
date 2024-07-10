// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebApplicationWithStatus extends TeaModel {
    @NameInMap("Status")
    public WebApplicationStatus status;

    @NameInMap("WebApplication")
    public WebApplication webApplication;

    public static WebApplicationWithStatus build(java.util.Map<String, ?> map) throws Exception {
        WebApplicationWithStatus self = new WebApplicationWithStatus();
        return TeaModel.build(map, self);
    }

    public WebApplicationWithStatus setStatus(WebApplicationStatus status) {
        this.status = status;
        return this;
    }
    public WebApplicationStatus getStatus() {
        return this.status;
    }

    public WebApplicationWithStatus setWebApplication(WebApplication webApplication) {
        this.webApplication = webApplication;
        return this;
    }
    public WebApplication getWebApplication() {
        return this.webApplication;
    }

}
