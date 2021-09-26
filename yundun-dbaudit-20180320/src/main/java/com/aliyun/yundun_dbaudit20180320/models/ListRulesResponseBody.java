// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServerData")
    public ListRulesResponseBodyServerData serverData;

    public static ListRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRulesResponseBody self = new ListRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRulesResponseBody setServerData(ListRulesResponseBodyServerData serverData) {
        this.serverData = serverData;
        return this;
    }
    public ListRulesResponseBodyServerData getServerData() {
        return this.serverData;
    }

    public static class ListRulesResponseBodyServerData extends TeaModel {
        @NameInMap("JsonResult")
        public String jsonResult;

        public static ListRulesResponseBodyServerData build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyServerData self = new ListRulesResponseBodyServerData();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyServerData setJsonResult(String jsonResult) {
            this.jsonResult = jsonResult;
            return this;
        }
        public String getJsonResult() {
            return this.jsonResult;
        }

    }

}
