// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class ListPipelinePrivilegesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PipelineId")
    public String pipelineId;

    // [ "*" ]
    @NameInMap("Users")
    public java.util.List<String> users;

    // [     "DescribeRun",     "PutRun",     "ListPipeline",     "GetPipeline"  ]
    @NameInMap("Actions")
    public java.util.List<String> actions;

    public static ListPipelinePrivilegesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPipelinePrivilegesResponseBody self = new ListPipelinePrivilegesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPipelinePrivilegesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPipelinePrivilegesResponseBody setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public ListPipelinePrivilegesResponseBody setUsers(java.util.List<String> users) {
        this.users = users;
        return this;
    }
    public java.util.List<String> getUsers() {
        return this.users;
    }

    public ListPipelinePrivilegesResponseBody setActions(java.util.List<String> actions) {
        this.actions = actions;
        return this;
    }
    public java.util.List<String> getActions() {
        return this.actions;
    }

}
