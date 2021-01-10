// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetCASAppgrayconfigsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<GetCASAppgrayconfigsResponseBodyData> data;

    public static GetCASAppgrayconfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCASAppgrayconfigsResponseBody self = new GetCASAppgrayconfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCASAppgrayconfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCASAppgrayconfigsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetCASAppgrayconfigsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetCASAppgrayconfigsResponseBody setData(java.util.List<GetCASAppgrayconfigsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetCASAppgrayconfigsResponseBodyData> getData() {
        return this.data;
    }

    public static class GetCASAppgrayconfigsResponseBodyData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public Boolean value;

        public static GetCASAppgrayconfigsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCASAppgrayconfigsResponseBodyData self = new GetCASAppgrayconfigsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCASAppgrayconfigsResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetCASAppgrayconfigsResponseBodyData setValue(Boolean value) {
            this.value = value;
            return this;
        }
        public Boolean getValue() {
            return this.value;
        }

    }

}
