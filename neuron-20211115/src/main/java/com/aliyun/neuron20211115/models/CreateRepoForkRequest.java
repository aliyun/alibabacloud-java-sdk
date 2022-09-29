// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateRepoForkRequest extends TeaModel {
    @NameInMap("body")
    public ReposForkCreateCmd body;

    public static CreateRepoForkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRepoForkRequest self = new CreateRepoForkRequest();
        return TeaModel.build(map, self);
    }

    public CreateRepoForkRequest setBody(ReposForkCreateCmd body) {
        this.body = body;
        return this;
    }
    public ReposForkCreateCmd getBody() {
        return this.body;
    }

}
