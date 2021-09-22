// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class UpdatePipelinePrivilegesRequest extends TeaModel {
    @NameInMap("Users")
    public java.util.List<String> users;

    public static UpdatePipelinePrivilegesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelinePrivilegesRequest self = new UpdatePipelinePrivilegesRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePipelinePrivilegesRequest setUsers(java.util.List<String> users) {
        this.users = users;
        return this;
    }
    public java.util.List<String> getUsers() {
        return this.users;
    }

}
