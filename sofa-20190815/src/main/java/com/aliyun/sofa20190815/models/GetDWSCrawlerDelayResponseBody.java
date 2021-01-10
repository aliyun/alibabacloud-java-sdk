// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSCrawlerDelayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<GetDWSCrawlerDelayResponseBodyData> data;

    public static GetDWSCrawlerDelayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDWSCrawlerDelayResponseBody self = new GetDWSCrawlerDelayResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDWSCrawlerDelayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDWSCrawlerDelayResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDWSCrawlerDelayResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDWSCrawlerDelayResponseBody setData(java.util.List<GetDWSCrawlerDelayResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDWSCrawlerDelayResponseBodyData> getData() {
        return this.data;
    }

    public static class GetDWSCrawlerDelayResponseBodyData extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static GetDWSCrawlerDelayResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDWSCrawlerDelayResponseBodyData self = new GetDWSCrawlerDelayResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDWSCrawlerDelayResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetDWSCrawlerDelayResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
