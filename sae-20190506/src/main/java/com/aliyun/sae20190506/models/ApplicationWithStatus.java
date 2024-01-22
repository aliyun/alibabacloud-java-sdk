// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ApplicationWithStatus extends TeaModel {
    @NameInMap("application")
    public Application application;

    @NameInMap("status")
    public ApplicationStatus status;

    public static ApplicationWithStatus build(java.util.Map<String, ?> map) throws Exception {
        ApplicationWithStatus self = new ApplicationWithStatus();
        return TeaModel.build(map, self);
    }

    public ApplicationWithStatus setApplication(Application application) {
        this.application = application;
        return this;
    }
    public Application getApplication() {
        return this.application;
    }

    public ApplicationWithStatus setStatus(ApplicationStatus status) {
        this.status = status;
        return this;
    }
    public ApplicationStatus getStatus() {
        return this.status;
    }

}
