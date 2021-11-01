// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class UpdateProjectRequest extends TeaModel {
    // 业务Id
    @NameInMap("BusinessId")
    public String businessId;

    // 项目id
    @NameInMap("Id")
    public String id;

    // 项目名称
    @NameInMap("Name")
    public String name;

    public static UpdateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectRequest self = new UpdateProjectRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProjectRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public UpdateProjectRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateProjectRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
