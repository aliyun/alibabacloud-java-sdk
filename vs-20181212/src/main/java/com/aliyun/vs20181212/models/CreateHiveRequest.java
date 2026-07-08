// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateHiveRequest extends TeaModel {
    /**
     * <p>A description of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>G49单卡集群</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("Name")
    public String name;

    public static CreateHiveRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHiveRequest self = new CreateHiveRequest();
        return TeaModel.build(map, self);
    }

    public CreateHiveRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateHiveRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
