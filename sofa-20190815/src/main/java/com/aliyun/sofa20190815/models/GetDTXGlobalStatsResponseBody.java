// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDTXGlobalStatsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public GetDTXGlobalStatsResponseBodyData data;

    public static GetDTXGlobalStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDTXGlobalStatsResponseBody self = new GetDTXGlobalStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDTXGlobalStatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDTXGlobalStatsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDTXGlobalStatsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDTXGlobalStatsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDTXGlobalStatsResponseBody setData(GetDTXGlobalStatsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDTXGlobalStatsResponseBodyData getData() {
        return this.data;
    }

    public static class GetDTXGlobalStatsResponseBodyData extends TeaModel {
        @NameInMap("Activity")
        public Long activity;

        @NameInMap("Exception")
        public Long exception;

        @NameInMap("Today")
        public Long today;

        public static GetDTXGlobalStatsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDTXGlobalStatsResponseBodyData self = new GetDTXGlobalStatsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDTXGlobalStatsResponseBodyData setActivity(Long activity) {
            this.activity = activity;
            return this;
        }
        public Long getActivity() {
            return this.activity;
        }

        public GetDTXGlobalStatsResponseBodyData setException(Long exception) {
            this.exception = exception;
            return this;
        }
        public Long getException() {
            return this.exception;
        }

        public GetDTXGlobalStatsResponseBodyData setToday(Long today) {
            this.today = today;
            return this;
        }
        public Long getToday() {
            return this.today;
        }

    }

}
