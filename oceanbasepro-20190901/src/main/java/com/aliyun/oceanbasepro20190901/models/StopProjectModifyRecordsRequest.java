// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class StopProjectModifyRecordsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>344000005</p>
     */
    @NameInMap("Id")
    public String id;

    public static StopProjectModifyRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        StopProjectModifyRecordsRequest self = new StopProjectModifyRecordsRequest();
        return TeaModel.build(map, self);
    }

    public StopProjectModifyRecordsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
