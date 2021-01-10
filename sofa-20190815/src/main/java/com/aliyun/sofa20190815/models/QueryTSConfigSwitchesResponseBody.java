// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSConfigSwitchesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public QueryTSConfigSwitchesResponseBodyData data;

    public static QueryTSConfigSwitchesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTSConfigSwitchesResponseBody self = new QueryTSConfigSwitchesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTSConfigSwitchesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTSConfigSwitchesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTSConfigSwitchesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryTSConfigSwitchesResponseBody setData(QueryTSConfigSwitchesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTSConfigSwitchesResponseBodyData getData() {
        return this.data;
    }

    public static class QueryTSConfigSwitchesResponseBodyData extends TeaModel {
        @NameInMap("UseMsgSwitch")
        public Boolean useMsgSwitch;

        public static QueryTSConfigSwitchesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTSConfigSwitchesResponseBodyData self = new QueryTSConfigSwitchesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTSConfigSwitchesResponseBodyData setUseMsgSwitch(Boolean useMsgSwitch) {
            this.useMsgSwitch = useMsgSwitch;
            return this;
        }
        public Boolean getUseMsgSwitch() {
            return this.useMsgSwitch;
        }

    }

}
