// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSCrawlerTpsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<GetDWSCrawlerTpsResponseBodyData> data;

    public static GetDWSCrawlerTpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDWSCrawlerTpsResponseBody self = new GetDWSCrawlerTpsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDWSCrawlerTpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDWSCrawlerTpsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDWSCrawlerTpsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDWSCrawlerTpsResponseBody setData(java.util.List<GetDWSCrawlerTpsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDWSCrawlerTpsResponseBodyData> getData() {
        return this.data;
    }

    public static class GetDWSCrawlerTpsResponseBodyData extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static GetDWSCrawlerTpsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDWSCrawlerTpsResponseBodyData self = new GetDWSCrawlerTpsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDWSCrawlerTpsResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetDWSCrawlerTpsResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
