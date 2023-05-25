// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class SwitchoverInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public SwitchoverInstanceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static SwitchoverInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchoverInstanceResponseBody self = new SwitchoverInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchoverInstanceResponseBody setData(SwitchoverInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SwitchoverInstanceResponseBodyData getData() {
        return this.data;
    }

    public SwitchoverInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SwitchoverInstanceResponseBodyData extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static SwitchoverInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SwitchoverInstanceResponseBodyData self = new SwitchoverInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SwitchoverInstanceResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SwitchoverInstanceResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
