// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class AddProjectRequest extends TeaModel {
    // 业务id
    @NameInMap("BusinessId")
    public Long businessId;

    // 项目名称
    @NameInMap("Name")
    public String name;

    public static AddProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        AddProjectRequest self = new AddProjectRequest();
        return TeaModel.build(map, self);
    }

    public AddProjectRequest setBusinessId(Long businessId) {
        this.businessId = businessId;
        return this;
    }
    public Long getBusinessId() {
        return this.businessId;
    }

    public AddProjectRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
