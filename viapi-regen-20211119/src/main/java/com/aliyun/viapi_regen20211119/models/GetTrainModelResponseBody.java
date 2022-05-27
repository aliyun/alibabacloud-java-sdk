// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class GetTrainModelResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetTrainModelResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetTrainModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrainModelResponseBody self = new GetTrainModelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrainModelResponseBody setData(GetTrainModelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTrainModelResponseBodyData getData() {
        return this.data;
    }

    public GetTrainModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTrainModelResponseBodyData extends TeaModel {
        @NameInMap("SimpleEvaluate")
        public Long simpleEvaluate;

        public static GetTrainModelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTrainModelResponseBodyData self = new GetTrainModelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTrainModelResponseBodyData setSimpleEvaluate(Long simpleEvaluate) {
            this.simpleEvaluate = simpleEvaluate;
            return this;
        }
        public Long getSimpleEvaluate() {
            return this.simpleEvaluate;
        }

    }

}
