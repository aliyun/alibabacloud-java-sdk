// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openagent20260801.models;

import com.aliyun.tea.*;

public class DeleteSessionResponseBody extends TeaModel {
    /**
     * <p>Returns an empty object {} upon successful deletion.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public DeleteSessionResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>00000000-0000-4000-8000-000000000001</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static DeleteSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSessionResponseBody self = new DeleteSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSessionResponseBody setData(DeleteSessionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteSessionResponseBodyData getData() {
        return this.data;
    }

    public DeleteSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSessionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteSessionResponseBodyData extends TeaModel {
        public static DeleteSessionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteSessionResponseBodyData self = new DeleteSessionResponseBodyData();
            return TeaModel.build(map, self);
        }

    }

}
