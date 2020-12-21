// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class ValidateVirtualClusterNameResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ValidateVirtualClusterNameResponseData data;

    public static ValidateVirtualClusterNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateVirtualClusterNameResponse self = new ValidateVirtualClusterNameResponse();
        return TeaModel.build(map, self);
    }

    public ValidateVirtualClusterNameResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ValidateVirtualClusterNameResponse setData(ValidateVirtualClusterNameResponseData data) {
        this.data = data;
        return this;
    }
    public ValidateVirtualClusterNameResponseData getData() {
        return this.data;
    }

    public static class ValidateVirtualClusterNameResponseData extends TeaModel {
        @NameInMap("Legal")
        @Validation(required = true)
        public String legal;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static ValidateVirtualClusterNameResponseData build(java.util.Map<String, ?> map) throws Exception {
            ValidateVirtualClusterNameResponseData self = new ValidateVirtualClusterNameResponseData();
            return TeaModel.build(map, self);
        }

        public ValidateVirtualClusterNameResponseData setLegal(String legal) {
            this.legal = legal;
            return this;
        }
        public String getLegal() {
            return this.legal;
        }

        public ValidateVirtualClusterNameResponseData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
