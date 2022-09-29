// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePbcInvokeResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CreatePbcInvokeResponseBodyResult result;

    public static CreatePbcInvokeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePbcInvokeResponseBody self = new CreatePbcInvokeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePbcInvokeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePbcInvokeResponseBody setResult(CreatePbcInvokeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreatePbcInvokeResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreatePbcInvokeResponseBodyResult extends TeaModel {
        @NameInMap("pbcInvokeId")
        public Long pbcInvokeId;

        public static CreatePbcInvokeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreatePbcInvokeResponseBodyResult self = new CreatePbcInvokeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreatePbcInvokeResponseBodyResult setPbcInvokeId(Long pbcInvokeId) {
            this.pbcInvokeId = pbcInvokeId;
            return this;
        }
        public Long getPbcInvokeId() {
            return this.pbcInvokeId;
        }

    }

}
