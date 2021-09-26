// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListAssociatedRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServerData")
    public ListAssociatedRulesResponseBodyServerData serverData;

    public static ListAssociatedRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAssociatedRulesResponseBody self = new ListAssociatedRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAssociatedRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAssociatedRulesResponseBody setServerData(ListAssociatedRulesResponseBodyServerData serverData) {
        this.serverData = serverData;
        return this;
    }
    public ListAssociatedRulesResponseBodyServerData getServerData() {
        return this.serverData;
    }

    public static class ListAssociatedRulesResponseBodyServerData extends TeaModel {
        @NameInMap("JsonResult")
        public String jsonResult;

        public static ListAssociatedRulesResponseBodyServerData build(java.util.Map<String, ?> map) throws Exception {
            ListAssociatedRulesResponseBodyServerData self = new ListAssociatedRulesResponseBodyServerData();
            return TeaModel.build(map, self);
        }

        public ListAssociatedRulesResponseBodyServerData setJsonResult(String jsonResult) {
            this.jsonResult = jsonResult;
            return this;
        }
        public String getJsonResult() {
            return this.jsonResult;
        }

    }

}
