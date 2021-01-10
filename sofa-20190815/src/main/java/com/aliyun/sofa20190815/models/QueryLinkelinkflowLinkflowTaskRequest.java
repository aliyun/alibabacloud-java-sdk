// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkelinkflowLinkflowTaskRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProcessInstanceId")
    public String processInstanceId;

    @NameInMap("UserId")
    public String userId;

    public static QueryLinkelinkflowLinkflowTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkelinkflowLinkflowTaskRequest self = new QueryLinkelinkflowLinkflowTaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkelinkflowLinkflowTaskRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryLinkelinkflowLinkflowTaskRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public QueryLinkelinkflowLinkflowTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryLinkelinkflowLinkflowTaskRequest setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }
    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

    public QueryLinkelinkflowLinkflowTaskRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
