// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210803_112546244.models;

import com.aliyun.tea.*;

public class VoidOutputRequest extends TeaModel {
    @NameInMap("input")
    public VoidOutputRequestInput input;

    public static VoidOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        VoidOutputRequest self = new VoidOutputRequest();
        return TeaModel.build(map, self);
    }

    public VoidOutputRequest setInput(VoidOutputRequestInput input) {
        this.input = input;
        return this;
    }
    public VoidOutputRequestInput getInput() {
        return this.input;
    }

    public static class VoidOutputRequestInput extends TeaModel {
        @NameInMap("request")
        public String request;

        @NameInMap("requestId")
        public String requestId;

        public static VoidOutputRequestInput build(java.util.Map<String, ?> map) throws Exception {
            VoidOutputRequestInput self = new VoidOutputRequestInput();
            return TeaModel.build(map, self);
        }

        public VoidOutputRequestInput setRequest(String request) {
            this.request = request;
            return this;
        }
        public String getRequest() {
            return this.request;
        }

        public VoidOutputRequestInput setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
