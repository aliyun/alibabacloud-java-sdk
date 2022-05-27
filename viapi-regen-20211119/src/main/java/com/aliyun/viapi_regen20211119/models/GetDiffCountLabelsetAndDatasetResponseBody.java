// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class GetDiffCountLabelsetAndDatasetResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetDiffCountLabelsetAndDatasetResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDiffCountLabelsetAndDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDiffCountLabelsetAndDatasetResponseBody self = new GetDiffCountLabelsetAndDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDiffCountLabelsetAndDatasetResponseBody setData(GetDiffCountLabelsetAndDatasetResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDiffCountLabelsetAndDatasetResponseBodyData getData() {
        return this.data;
    }

    public GetDiffCountLabelsetAndDatasetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDiffCountLabelsetAndDatasetResponseBodyData extends TeaModel {
        @NameInMap("DiffCount")
        public Long diffCount;

        public static GetDiffCountLabelsetAndDatasetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDiffCountLabelsetAndDatasetResponseBodyData self = new GetDiffCountLabelsetAndDatasetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDiffCountLabelsetAndDatasetResponseBodyData setDiffCount(Long diffCount) {
            this.diffCount = diffCount;
            return this;
        }
        public Long getDiffCount() {
            return this.diffCount;
        }

    }

}
