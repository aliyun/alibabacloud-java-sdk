// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210803_112546244.models;

import com.aliyun.tea.*;

public class PrimitiveOutputStringRequest extends TeaModel {
    @NameInMap("input")
    public PrimitiveOutputStringRequestInput input;

    public static PrimitiveOutputStringRequest build(java.util.Map<String, ?> map) throws Exception {
        PrimitiveOutputStringRequest self = new PrimitiveOutputStringRequest();
        return TeaModel.build(map, self);
    }

    public PrimitiveOutputStringRequest setInput(PrimitiveOutputStringRequestInput input) {
        this.input = input;
        return this;
    }
    public PrimitiveOutputStringRequestInput getInput() {
        return this.input;
    }

    public static class PrimitiveOutputStringRequestInput extends TeaModel {
        @NameInMap("request")
        public String request;

        @NameInMap("requestId")
        public String requestId;

        public static PrimitiveOutputStringRequestInput build(java.util.Map<String, ?> map) throws Exception {
            PrimitiveOutputStringRequestInput self = new PrimitiveOutputStringRequestInput();
            return TeaModel.build(map, self);
        }

        public PrimitiveOutputStringRequestInput setRequest(String request) {
            this.request = request;
            return this;
        }
        public String getRequest() {
            return this.request;
        }

        public PrimitiveOutputStringRequestInput setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
