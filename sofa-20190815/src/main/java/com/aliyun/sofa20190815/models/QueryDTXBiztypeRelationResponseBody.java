// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryDTXBiztypeRelationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("AppAction")
    public java.util.List<QueryDTXBiztypeRelationResponseBodyAppAction> appAction;

    public static QueryDTXBiztypeRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDTXBiztypeRelationResponseBody self = new QueryDTXBiztypeRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDTXBiztypeRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDTXBiztypeRelationResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDTXBiztypeRelationResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryDTXBiztypeRelationResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryDTXBiztypeRelationResponseBody setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QueryDTXBiztypeRelationResponseBody setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public QueryDTXBiztypeRelationResponseBody setAppAction(java.util.List<QueryDTXBiztypeRelationResponseBodyAppAction> appAction) {
        this.appAction = appAction;
        return this;
    }
    public java.util.List<QueryDTXBiztypeRelationResponseBodyAppAction> getAppAction() {
        return this.appAction;
    }

    public static class QueryDTXBiztypeRelationResponseBodyAppAction extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("ActionArray")
        public java.util.List<String> actionArray;

        public static QueryDTXBiztypeRelationResponseBodyAppAction build(java.util.Map<String, ?> map) throws Exception {
            QueryDTXBiztypeRelationResponseBodyAppAction self = new QueryDTXBiztypeRelationResponseBodyAppAction();
            return TeaModel.build(map, self);
        }

        public QueryDTXBiztypeRelationResponseBodyAppAction setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryDTXBiztypeRelationResponseBodyAppAction setActionArray(java.util.List<String> actionArray) {
            this.actionArray = actionArray;
            return this;
        }
        public java.util.List<String> getActionArray() {
            return this.actionArray;
        }

    }

}
