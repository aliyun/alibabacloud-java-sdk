// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class ValidateVirtualClusterNameResponseBody extends TeaModel {
    @NameInMap("Data")
    public ValidateVirtualClusterNameResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>C039FD4D-2F3C-4556-AF09-864D3A6485B2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ValidateVirtualClusterNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateVirtualClusterNameResponseBody self = new ValidateVirtualClusterNameResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateVirtualClusterNameResponseBody setData(ValidateVirtualClusterNameResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ValidateVirtualClusterNameResponseBodyData getData() {
        return this.data;
    }

    public ValidateVirtualClusterNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ValidateVirtualClusterNameResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Legal")
        public String legal;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Message")
        public String message;

        public static ValidateVirtualClusterNameResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ValidateVirtualClusterNameResponseBodyData self = new ValidateVirtualClusterNameResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ValidateVirtualClusterNameResponseBodyData setLegal(String legal) {
            this.legal = legal;
            return this;
        }
        public String getLegal() {
            return this.legal;
        }

        public ValidateVirtualClusterNameResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
