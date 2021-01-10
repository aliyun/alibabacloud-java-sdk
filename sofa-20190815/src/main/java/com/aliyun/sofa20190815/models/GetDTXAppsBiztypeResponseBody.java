// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDTXAppsBiztypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("StatemachineJson")
    public String statemachineJson;

    @NameInMap("Data")
    public java.util.List<GetDTXAppsBiztypeResponseBodyData> data;

    public static GetDTXAppsBiztypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDTXAppsBiztypeResponseBody self = new GetDTXAppsBiztypeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDTXAppsBiztypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDTXAppsBiztypeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDTXAppsBiztypeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDTXAppsBiztypeResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetDTXAppsBiztypeResponseBody setStatemachineJson(String statemachineJson) {
        this.statemachineJson = statemachineJson;
        return this;
    }
    public String getStatemachineJson() {
        return this.statemachineJson;
    }

    public GetDTXAppsBiztypeResponseBody setData(java.util.List<GetDTXAppsBiztypeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDTXAppsBiztypeResponseBodyData> getData() {
        return this.data;
    }

    public static class GetDTXAppsBiztypeResponseBodyData extends TeaModel {
        @NameInMap("ActionMode")
        public String actionMode;

        @NameInMap("ActionName")
        public String actionName;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("Commit")
        public String commit;

        @NameInMap("Rollback")
        public String rollback;

        @NameInMap("WsTr")
        public String wsTr;

        public static GetDTXAppsBiztypeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDTXAppsBiztypeResponseBodyData self = new GetDTXAppsBiztypeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDTXAppsBiztypeResponseBodyData setActionMode(String actionMode) {
            this.actionMode = actionMode;
            return this;
        }
        public String getActionMode() {
            return this.actionMode;
        }

        public GetDTXAppsBiztypeResponseBodyData setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public GetDTXAppsBiztypeResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetDTXAppsBiztypeResponseBodyData setCommit(String commit) {
            this.commit = commit;
            return this;
        }
        public String getCommit() {
            return this.commit;
        }

        public GetDTXAppsBiztypeResponseBodyData setRollback(String rollback) {
            this.rollback = rollback;
            return this;
        }
        public String getRollback() {
            return this.rollback;
        }

        public GetDTXAppsBiztypeResponseBodyData setWsTr(String wsTr) {
            this.wsTr = wsTr;
            return this;
        }
        public String getWsTr() {
            return this.wsTr;
        }

    }

}
