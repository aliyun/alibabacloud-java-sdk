// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class DeleteServiceResponseBody extends TeaModel {
    @NameInMap("Data")
    public DeleteServiceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceResponseBody self = new DeleteServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteServiceResponseBody setData(DeleteServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteServiceResponseBodyData getData() {
        return this.data;
    }

    public DeleteServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteServiceResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public Long id;

        public static DeleteServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteServiceResponseBodyData self = new DeleteServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteServiceResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
