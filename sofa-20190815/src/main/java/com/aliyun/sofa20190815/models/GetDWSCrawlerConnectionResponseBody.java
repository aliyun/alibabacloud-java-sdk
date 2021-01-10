// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSCrawlerConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<GetDWSCrawlerConnectionResponseBodyData> data;

    public static GetDWSCrawlerConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDWSCrawlerConnectionResponseBody self = new GetDWSCrawlerConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDWSCrawlerConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDWSCrawlerConnectionResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDWSCrawlerConnectionResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDWSCrawlerConnectionResponseBody setData(java.util.List<GetDWSCrawlerConnectionResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDWSCrawlerConnectionResponseBodyData> getData() {
        return this.data;
    }

    public static class GetDWSCrawlerConnectionResponseBodyData extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static GetDWSCrawlerConnectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDWSCrawlerConnectionResponseBodyData self = new GetDWSCrawlerConnectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDWSCrawlerConnectionResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetDWSCrawlerConnectionResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
