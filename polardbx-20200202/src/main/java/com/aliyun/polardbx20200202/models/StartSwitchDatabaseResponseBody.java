// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class StartSwitchDatabaseResponseBody extends TeaModel {
    @NameInMap("Data")
    public StartSwitchDatabaseResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9B2F3840-5C98-475C-B269-2D5C3A31797C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static StartSwitchDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartSwitchDatabaseResponseBody self = new StartSwitchDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public StartSwitchDatabaseResponseBody setData(StartSwitchDatabaseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StartSwitchDatabaseResponseBodyData getData() {
        return this.data;
    }

    public StartSwitchDatabaseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartSwitchDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartSwitchDatabaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class StartSwitchDatabaseResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>etx-szr2rr6i*****</p>
         */
        @NameInMap("SlinkTaskId")
        public String slinkTaskId;

        public static StartSwitchDatabaseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StartSwitchDatabaseResponseBodyData self = new StartSwitchDatabaseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StartSwitchDatabaseResponseBodyData setSlinkTaskId(String slinkTaskId) {
            this.slinkTaskId = slinkTaskId;
            return this;
        }
        public String getSlinkTaskId() {
            return this.slinkTaskId;
        }

    }

}
