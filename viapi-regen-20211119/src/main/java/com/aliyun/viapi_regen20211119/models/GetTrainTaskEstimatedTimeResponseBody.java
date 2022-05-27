// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class GetTrainTaskEstimatedTimeResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetTrainTaskEstimatedTimeResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetTrainTaskEstimatedTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrainTaskEstimatedTimeResponseBody self = new GetTrainTaskEstimatedTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrainTaskEstimatedTimeResponseBody setData(GetTrainTaskEstimatedTimeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTrainTaskEstimatedTimeResponseBodyData getData() {
        return this.data;
    }

    public GetTrainTaskEstimatedTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTrainTaskEstimatedTimeResponseBodyData extends TeaModel {
        @NameInMap("EstimatedTime")
        public String estimatedTime;

        public static GetTrainTaskEstimatedTimeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTrainTaskEstimatedTimeResponseBodyData self = new GetTrainTaskEstimatedTimeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTrainTaskEstimatedTimeResponseBodyData setEstimatedTime(String estimatedTime) {
            this.estimatedTime = estimatedTime;
            return this;
        }
        public String getEstimatedTime() {
            return this.estimatedTime;
        }

    }

}
