// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210804_144622100.models;

import com.aliyun.tea.*;

public class ArrayOutputRequest extends TeaModel {
    @NameInMap("input")
    public ArrayOutputRequestInput input;

    public static ArrayOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        ArrayOutputRequest self = new ArrayOutputRequest();
        return TeaModel.build(map, self);
    }

    public ArrayOutputRequest setInput(ArrayOutputRequestInput input) {
        this.input = input;
        return this;
    }
    public ArrayOutputRequestInput getInput() {
        return this.input;
    }

    public static class ArrayOutputRequestInput extends TeaModel {
        @NameInMap("request")
        public String request;

        @NameInMap("requestId")
        public String requestId;

        public static ArrayOutputRequestInput build(java.util.Map<String, ?> map) throws Exception {
            ArrayOutputRequestInput self = new ArrayOutputRequestInput();
            return TeaModel.build(map, self);
        }

        public ArrayOutputRequestInput setRequest(String request) {
            this.request = request;
            return this;
        }
        public String getRequest() {
            return this.request;
        }

        public ArrayOutputRequestInput setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
