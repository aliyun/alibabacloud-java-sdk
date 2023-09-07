// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListQueryRaspAppInfoResponseBody extends TeaModel {
    /**
     * <p>The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The installation information of the RASP-enabled application.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListQueryRaspAppInfoResponseBodyData> data;

    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The additional information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListQueryRaspAppInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQueryRaspAppInfoResponseBody self = new ListQueryRaspAppInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQueryRaspAppInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListQueryRaspAppInfoResponseBody setData(java.util.List<ListQueryRaspAppInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListQueryRaspAppInfoResponseBodyData> getData() {
        return this.data;
    }

    public ListQueryRaspAppInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListQueryRaspAppInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListQueryRaspAppInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQueryRaspAppInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListQueryRaspAppInfoResponseBodyData extends TeaModel {
        /**
         * <p>The name of the RASP-enabled application.</p>
         */
        @NameInMap("RaspAppName")
        public String raspAppName;

        /**
         * <p>The online status of the RASP-enabled applications. Valid values:</p>
         * <br>
         * <p>*   **0**: All RASP-enabled applications are online.</p>
         * <p>*   **1**: Part of the RASP-enabled applications are online.</p>
         * <p>*   **2**: All RASP-enabled applications are offline.</p>
         */
        @NameInMap("RaspOnlineStatus")
        public Integer raspOnlineStatus;

        /**
         * <p>The installation status of the RASP-enabled application. Valid values:</p>
         * <br>
         * <p>*   **SUCCESS**: The RASP-enabled application is installed.</p>
         * <p>*   **FAIL**: The RASP-enabled application fails to be installed.</p>
         * <p>*   **INSTALL**: The RASP-enabled application is being installed.</p>
         */
        @NameInMap("RaspStatus")
        public String raspStatus;

        /**
         * <p>The result returned if the push fails.</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The UUID of the asset.</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static ListQueryRaspAppInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListQueryRaspAppInfoResponseBodyData self = new ListQueryRaspAppInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListQueryRaspAppInfoResponseBodyData setRaspAppName(String raspAppName) {
            this.raspAppName = raspAppName;
            return this;
        }
        public String getRaspAppName() {
            return this.raspAppName;
        }

        public ListQueryRaspAppInfoResponseBodyData setRaspOnlineStatus(Integer raspOnlineStatus) {
            this.raspOnlineStatus = raspOnlineStatus;
            return this;
        }
        public Integer getRaspOnlineStatus() {
            return this.raspOnlineStatus;
        }

        public ListQueryRaspAppInfoResponseBodyData setRaspStatus(String raspStatus) {
            this.raspStatus = raspStatus;
            return this;
        }
        public String getRaspStatus() {
            return this.raspStatus;
        }

        public ListQueryRaspAppInfoResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public ListQueryRaspAppInfoResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
