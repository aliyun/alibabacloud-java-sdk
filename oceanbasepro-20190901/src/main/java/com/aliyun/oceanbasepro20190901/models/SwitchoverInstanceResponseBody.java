// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class SwitchoverInstanceResponseBody extends TeaModel {
    /**
     * <p>The list of data for the switchover.</p>
     */
    @NameInMap("Data")
    public SwitchoverInstanceResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469**-AA6F-4D**-B3DB-A***********</p>
     */
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
        /**
         * <p>The message of the switchover.</p>
         * 
         * <strong>example:</strong>
         * <p>delete tag-value success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Whether the switchover is successful.</p>
         * <ul>
         * <li>true: the switchover succeeded.</li>
         * <li>false: the switchover failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
