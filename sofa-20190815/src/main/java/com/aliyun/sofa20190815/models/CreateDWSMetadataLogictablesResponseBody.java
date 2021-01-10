// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDWSMetadataLogictablesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<CreateDWSMetadataLogictablesResponseBodyData> data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CreateDWSMetadataLogictablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDWSMetadataLogictablesResponseBody self = new CreateDWSMetadataLogictablesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDWSMetadataLogictablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDWSMetadataLogictablesResponseBody setData(java.util.List<CreateDWSMetadataLogictablesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CreateDWSMetadataLogictablesResponseBodyData> getData() {
        return this.data;
    }

    public CreateDWSMetadataLogictablesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateDWSMetadataLogictablesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class CreateDWSMetadataLogictablesResponseBodyData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateDWSMetadataLogictablesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDWSMetadataLogictablesResponseBodyData self = new CreateDWSMetadataLogictablesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDWSMetadataLogictablesResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDWSMetadataLogictablesResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
