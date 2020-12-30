// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class ValidateVirtualClusterNameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ValidateVirtualClusterNameResponseBodyData data;

    public static ValidateVirtualClusterNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateVirtualClusterNameResponseBody self = new ValidateVirtualClusterNameResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateVirtualClusterNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ValidateVirtualClusterNameResponseBody setData(ValidateVirtualClusterNameResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ValidateVirtualClusterNameResponseBodyData getData() {
        return this.data;
    }

    public static class ValidateVirtualClusterNameResponseBodyData extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Legal")
        public String legal;

        public static ValidateVirtualClusterNameResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ValidateVirtualClusterNameResponseBodyData self = new ValidateVirtualClusterNameResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ValidateVirtualClusterNameResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ValidateVirtualClusterNameResponseBodyData setLegal(String legal) {
            this.legal = legal;
            return this;
        }
        public String getLegal() {
            return this.legal;
        }

    }

}
