// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class EndPenetrationTestRequest extends TeaModel {
    /**
     * <p>The unique identity sequence of the application record.</p>
     * <blockquote>
     * <p>The field type is Long. Precision loss may occur during the procedure to serialize or deserialize. Make sure that the value does not exceed 9007199254740991.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2398</p>
     */
    @NameInMap("Id")
    public Long id;

    public static EndPenetrationTestRequest build(java.util.Map<String, ?> map) throws Exception {
        EndPenetrationTestRequest self = new EndPenetrationTestRequest();
        return TeaModel.build(map, self);
    }

    public EndPenetrationTestRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
