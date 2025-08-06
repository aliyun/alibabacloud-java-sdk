// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAIServiceResponseBody extends TeaModel {
    @NameInMap("AIList")
    public java.util.List<GetAIServiceResponseBodyAIList> AIList;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAIServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAIServiceResponseBody self = new GetAIServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAIServiceResponseBody setAIList(java.util.List<GetAIServiceResponseBodyAIList> AIList) {
        this.AIList = AIList;
        return this;
    }
    public java.util.List<GetAIServiceResponseBodyAIList> getAIList() {
        return this.AIList;
    }

    public GetAIServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAIServiceResponseBodyAIList extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static GetAIServiceResponseBodyAIList build(java.util.Map<String, ?> map) throws Exception {
            GetAIServiceResponseBodyAIList self = new GetAIServiceResponseBodyAIList();
            return TeaModel.build(map, self);
        }

        public GetAIServiceResponseBodyAIList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAIServiceResponseBodyAIList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
