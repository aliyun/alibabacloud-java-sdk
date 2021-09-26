// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetRuleDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServerData")
    public GetRuleDetailResponseBodyServerData serverData;

    public static GetRuleDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRuleDetailResponseBody self = new GetRuleDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRuleDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRuleDetailResponseBody setServerData(GetRuleDetailResponseBodyServerData serverData) {
        this.serverData = serverData;
        return this;
    }
    public GetRuleDetailResponseBodyServerData getServerData() {
        return this.serverData;
    }

    public static class GetRuleDetailResponseBodyServerData extends TeaModel {
        @NameInMap("JsonResult")
        public String jsonResult;

        public static GetRuleDetailResponseBodyServerData build(java.util.Map<String, ?> map) throws Exception {
            GetRuleDetailResponseBodyServerData self = new GetRuleDetailResponseBodyServerData();
            return TeaModel.build(map, self);
        }

        public GetRuleDetailResponseBodyServerData setJsonResult(String jsonResult) {
            this.jsonResult = jsonResult;
            return this;
        }
        public String getJsonResult() {
            return this.jsonResult;
        }

    }

}
