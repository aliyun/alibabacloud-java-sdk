// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSMonitorEncodednameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<GetDWSMonitorEncodednameResponseBodyData> data;

    public static GetDWSMonitorEncodednameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDWSMonitorEncodednameResponseBody self = new GetDWSMonitorEncodednameResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDWSMonitorEncodednameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDWSMonitorEncodednameResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDWSMonitorEncodednameResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDWSMonitorEncodednameResponseBody setData(java.util.List<GetDWSMonitorEncodednameResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDWSMonitorEncodednameResponseBodyData> getData() {
        return this.data;
    }

    public static class GetDWSMonitorEncodednameResponseBodyData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetDWSMonitorEncodednameResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDWSMonitorEncodednameResponseBodyData self = new GetDWSMonitorEncodednameResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDWSMonitorEncodednameResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetDWSMonitorEncodednameResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
