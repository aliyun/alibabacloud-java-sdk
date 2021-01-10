// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSCrawlerIosResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<GetDWSCrawlerIosResponseBodyData> data;

    public static GetDWSCrawlerIosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDWSCrawlerIosResponseBody self = new GetDWSCrawlerIosResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDWSCrawlerIosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDWSCrawlerIosResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDWSCrawlerIosResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDWSCrawlerIosResponseBody setData(java.util.List<GetDWSCrawlerIosResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDWSCrawlerIosResponseBodyData> getData() {
        return this.data;
    }

    public static class GetDWSCrawlerIosResponseBodyData extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static GetDWSCrawlerIosResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDWSCrawlerIosResponseBodyData self = new GetDWSCrawlerIosResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDWSCrawlerIosResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetDWSCrawlerIosResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
