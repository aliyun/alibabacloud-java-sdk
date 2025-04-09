// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SaveAnnotationMissionTagInfoListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SaveAnnotationMissionTagInfoListResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1B356EDC-F69A-53B0-B4AF-2AC42200684E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SaveAnnotationMissionTagInfoListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveAnnotationMissionTagInfoListResponseBody self = new SaveAnnotationMissionTagInfoListResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveAnnotationMissionTagInfoListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SaveAnnotationMissionTagInfoListResponseBody setData(SaveAnnotationMissionTagInfoListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SaveAnnotationMissionTagInfoListResponseBodyData getData() {
        return this.data;
    }

    public SaveAnnotationMissionTagInfoListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SaveAnnotationMissionTagInfoListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SaveAnnotationMissionTagInfoListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveAnnotationMissionTagInfoListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SaveAnnotationMissionTagInfoListResponseBodyData extends TeaModel {
        @NameInMap("ExecCount")
        public Integer execCount;

        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static SaveAnnotationMissionTagInfoListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SaveAnnotationMissionTagInfoListResponseBodyData self = new SaveAnnotationMissionTagInfoListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SaveAnnotationMissionTagInfoListResponseBodyData setExecCount(Integer execCount) {
            this.execCount = execCount;
            return this;
        }
        public Integer getExecCount() {
            return this.execCount;
        }

        public SaveAnnotationMissionTagInfoListResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SaveAnnotationMissionTagInfoListResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
