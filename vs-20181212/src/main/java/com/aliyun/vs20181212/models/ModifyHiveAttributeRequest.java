// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyHiveAttributeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>gb-test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hive-3b506f0868a7451ba15e0e890706033a</p>
     */
    @NameInMap("HiveId")
    public String hiveId;

    /**
     * <strong>example:</strong>
     * <p>yy-test2</p>
     */
    @NameInMap("Name")
    public String name;

    public static ModifyHiveAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHiveAttributeRequest self = new ModifyHiveAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHiveAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyHiveAttributeRequest setHiveId(String hiveId) {
        this.hiveId = hiveId;
        return this;
    }
    public String getHiveId() {
        return this.hiveId;
    }

    public ModifyHiveAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
