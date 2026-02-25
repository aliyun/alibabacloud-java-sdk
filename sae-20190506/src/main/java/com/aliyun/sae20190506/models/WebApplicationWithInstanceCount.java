// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebApplicationWithInstanceCount extends TeaModel {
    /**
     * <p>The number of application instances.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InstanceCount")
    public Long instanceCount;

    /**
     * <p>The application information.</p>
     */
    @NameInMap("WebApplication")
    public WebApplication webApplication;

    public static WebApplicationWithInstanceCount build(java.util.Map<String, ?> map) throws Exception {
        WebApplicationWithInstanceCount self = new WebApplicationWithInstanceCount();
        return TeaModel.build(map, self);
    }

    public WebApplicationWithInstanceCount setInstanceCount(Long instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    public Long getInstanceCount() {
        return this.instanceCount;
    }

    public WebApplicationWithInstanceCount setWebApplication(WebApplication webApplication) {
        this.webApplication = webApplication;
        return this;
    }
    public WebApplication getWebApplication() {
        return this.webApplication;
    }

}
