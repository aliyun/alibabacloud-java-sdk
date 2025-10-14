// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ConfirmNoConnectionResponseBody extends TeaModel {
    @NameInMap("Data")
    public ConfirmNoConnectionResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>6BA32080EEA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ConfirmNoConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfirmNoConnectionResponseBody self = new ConfirmNoConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfirmNoConnectionResponseBody setData(ConfirmNoConnectionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ConfirmNoConnectionResponseBodyData getData() {
        return this.data;
    }

    public ConfirmNoConnectionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ConfirmNoConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConfirmNoConnectionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ConfirmNoConnectionResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>etx-szr2rr6i*****</p>
         */
        @NameInMap("SlinkTaskId")
        public String slinkTaskId;

        public static ConfirmNoConnectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ConfirmNoConnectionResponseBodyData self = new ConfirmNoConnectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ConfirmNoConnectionResponseBodyData setSlinkTaskId(String slinkTaskId) {
            this.slinkTaskId = slinkTaskId;
            return this;
        }
        public String getSlinkTaskId() {
            return this.slinkTaskId;
        }

    }

}
