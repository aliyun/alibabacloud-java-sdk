// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateDWSMetadataLogictablesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<UpdateDWSMetadataLogictablesResponseBodyData> data;

    public static UpdateDWSMetadataLogictablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDWSMetadataLogictablesResponseBody self = new UpdateDWSMetadataLogictablesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDWSMetadataLogictablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDWSMetadataLogictablesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateDWSMetadataLogictablesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateDWSMetadataLogictablesResponseBody setData(java.util.List<UpdateDWSMetadataLogictablesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<UpdateDWSMetadataLogictablesResponseBodyData> getData() {
        return this.data;
    }

    public static class UpdateDWSMetadataLogictablesResponseBodyData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateDWSMetadataLogictablesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateDWSMetadataLogictablesResponseBodyData self = new UpdateDWSMetadataLogictablesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateDWSMetadataLogictablesResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateDWSMetadataLogictablesResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
