// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateSlsResourceResponse extends TeaModel {
    @NameInMap("logStore")
    public String logStore;

    @NameInMap("project")
    public String project;

    @NameInMap("requestId")
    public String requestId;

    public static CreateSlsResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSlsResourceResponse self = new CreateSlsResourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateSlsResourceResponse setLogStore(String logStore) {
        this.logStore = logStore;
        return this;
    }
    public String getLogStore() {
        return this.logStore;
    }

    public CreateSlsResourceResponse setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public CreateSlsResourceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
