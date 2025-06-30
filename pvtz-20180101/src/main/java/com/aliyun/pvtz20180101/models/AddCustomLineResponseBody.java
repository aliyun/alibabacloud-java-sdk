// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class AddCustomLineResponseBody extends TeaModel {
    /**
     * <p>The unique ID of the custom line.</p>
     * 
     * <strong>example:</strong>
     * <p>1065001</p>
     */
    @NameInMap("LineId")
    public String lineId;

    /**
     * <p>The name of the custom line.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AF7D4DCE-0776-47F2-A9B2-6FB85A87AA60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddCustomLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCustomLineResponseBody self = new AddCustomLineResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCustomLineResponseBody setLineId(String lineId) {
        this.lineId = lineId;
        return this;
    }
    public String getLineId() {
        return this.lineId;
    }

    public AddCustomLineResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddCustomLineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
