// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class GetLabelDetailResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetLabelDetailResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetLabelDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLabelDetailResponseBody self = new GetLabelDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLabelDetailResponseBody setData(GetLabelDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLabelDetailResponseBodyData getData() {
        return this.data;
    }

    public GetLabelDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetLabelDetailResponseBodyData extends TeaModel {
        @NameInMap("LabelInfo")
        public String labelInfo;

        public static GetLabelDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLabelDetailResponseBodyData self = new GetLabelDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLabelDetailResponseBodyData setLabelInfo(String labelInfo) {
            this.labelInfo = labelInfo;
            return this;
        }
        public String getLabelInfo() {
            return this.labelInfo;
        }

    }

}
