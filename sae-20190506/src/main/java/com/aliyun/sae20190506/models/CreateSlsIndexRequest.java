// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateSlsIndexRequest extends TeaModel {
    @NameInMap("logstore")
    public String logstore;

    @NameInMap("project")
    public String project;

    public static CreateSlsIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSlsIndexRequest self = new CreateSlsIndexRequest();
        return TeaModel.build(map, self);
    }

    public CreateSlsIndexRequest setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public CreateSlsIndexRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

}
