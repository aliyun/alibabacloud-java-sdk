// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class AddProjectRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5432****</p>
     */
    @NameInMap("BusinessId")
    public Long businessId;

    /**
     * <p>This parameter is required.</p>
     */
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
