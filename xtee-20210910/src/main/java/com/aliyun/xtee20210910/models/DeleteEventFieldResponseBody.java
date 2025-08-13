// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DeleteEventFieldResponseBody extends TeaModel {
    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Result object</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("resuleObject")
    public Boolean resuleObject;

    public static DeleteEventFieldResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventFieldResponseBody self = new DeleteEventFieldResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEventFieldResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteEventFieldResponseBody setResuleObject(Boolean resuleObject) {
        this.resuleObject = resuleObject;
        return this;
    }
    public Boolean getResuleObject() {
        return this.resuleObject;
    }

}
