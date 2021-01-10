// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckDWSTaskParamResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<CheckDWSTaskParamResponseBodyData> data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CheckDWSTaskParamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckDWSTaskParamResponseBody self = new CheckDWSTaskParamResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckDWSTaskParamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckDWSTaskParamResponseBody setData(java.util.List<CheckDWSTaskParamResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CheckDWSTaskParamResponseBodyData> getData() {
        return this.data;
    }

    public CheckDWSTaskParamResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CheckDWSTaskParamResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class CheckDWSTaskParamResponseBodyData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CheckDWSTaskParamResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckDWSTaskParamResponseBodyData self = new CheckDWSTaskParamResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckDWSTaskParamResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CheckDWSTaskParamResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
