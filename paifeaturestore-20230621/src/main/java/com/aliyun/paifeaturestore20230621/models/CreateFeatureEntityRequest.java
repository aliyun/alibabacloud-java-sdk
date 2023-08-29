// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class CreateFeatureEntityRequest extends TeaModel {
    @NameInMap("JoinId")
    public String joinId;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProjectId")
    public String projectId;

    public static CreateFeatureEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFeatureEntityRequest self = new CreateFeatureEntityRequest();
        return TeaModel.build(map, self);
    }

    public CreateFeatureEntityRequest setJoinId(String joinId) {
        this.joinId = joinId;
        return this;
    }
    public String getJoinId() {
        return this.joinId;
    }

    public CreateFeatureEntityRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateFeatureEntityRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
