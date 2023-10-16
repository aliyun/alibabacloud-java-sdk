// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileUploadLimitResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetFileUploadLimitResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetFileUploadLimitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileUploadLimitResponseBody self = new GetFileUploadLimitResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileUploadLimitResponseBody setData(GetFileUploadLimitResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFileUploadLimitResponseBodyData getData() {
        return this.data;
    }

    public GetFileUploadLimitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetFileUploadLimitResponseBodyData extends TeaModel {
        @NameInMap("Limit")
        public String limit;

        public static GetFileUploadLimitResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFileUploadLimitResponseBodyData self = new GetFileUploadLimitResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFileUploadLimitResponseBodyData setLimit(String limit) {
            this.limit = limit;
            return this;
        }
        public String getLimit() {
            return this.limit;
        }

    }

}
