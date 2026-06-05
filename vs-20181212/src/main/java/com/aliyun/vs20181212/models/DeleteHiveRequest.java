// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteHiveRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>g-xxxx</p>
     */
    @NameInMap("HiveId")
    public String hiveId;

    public static DeleteHiveRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHiveRequest self = new DeleteHiveRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHiveRequest setHiveId(String hiveId) {
        this.hiveId = hiveId;
        return this;
    }
    public String getHiveId() {
        return this.hiveId;
    }

}
