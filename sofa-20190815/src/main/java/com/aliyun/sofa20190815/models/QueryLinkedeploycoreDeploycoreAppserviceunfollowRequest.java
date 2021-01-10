// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreAppserviceunfollowRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("User")
    public String user;

    public static QueryLinkedeploycoreDeploycoreAppserviceunfollowRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreAppserviceunfollowRequest self = new QueryLinkedeploycoreDeploycoreAppserviceunfollowRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreAppserviceunfollowRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryLinkedeploycoreDeploycoreAppserviceunfollowRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

}
