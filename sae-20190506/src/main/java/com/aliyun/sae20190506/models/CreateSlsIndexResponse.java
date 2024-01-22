// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateSlsIndexResponse extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("logStore")
    public String logStore;

    @NameInMap("project")
    public String project;

    public static CreateSlsIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSlsIndexResponse self = new CreateSlsIndexResponse();
        return TeaModel.build(map, self);
    }

    public CreateSlsIndexResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSlsIndexResponse setLogStore(String logStore) {
        this.logStore = logStore;
        return this;
    }
    public String getLogStore() {
        return this.logStore;
    }

    public CreateSlsIndexResponse setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

}
