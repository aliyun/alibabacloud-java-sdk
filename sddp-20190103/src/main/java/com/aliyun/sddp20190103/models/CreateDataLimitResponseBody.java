// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class CreateDataLimitResponseBody extends TeaModel {
    /**
     * <p>The ID of the data asset.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Id")
    public Integer id;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7C3AC882-E5A8-4855-BE77-B6837B695EF1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDataLimitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataLimitResponseBody self = new CreateDataLimitResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataLimitResponseBody setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public CreateDataLimitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
