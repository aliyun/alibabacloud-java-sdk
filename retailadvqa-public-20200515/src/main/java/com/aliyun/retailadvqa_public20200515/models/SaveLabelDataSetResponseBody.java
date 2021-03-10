// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class SaveLabelDataSetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorDesc")
    public String errorDesc;

    @NameInMap("TraceId")
    public String traceId;

    @NameInMap("Data")
    public SaveLabelDataSetResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public String success;

    public static SaveLabelDataSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveLabelDataSetResponseBody self = new SaveLabelDataSetResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveLabelDataSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveLabelDataSetResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public SaveLabelDataSetResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public SaveLabelDataSetResponseBody setData(SaveLabelDataSetResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SaveLabelDataSetResponseBodyData getData() {
        return this.data;
    }

    public SaveLabelDataSetResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SaveLabelDataSetResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class SaveLabelDataSetResponseBodyData extends TeaModel {
        @NameInMap("CubeId")
        public String cubeId;

        public static SaveLabelDataSetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SaveLabelDataSetResponseBodyData self = new SaveLabelDataSetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SaveLabelDataSetResponseBodyData setCubeId(String cubeId) {
            this.cubeId = cubeId;
            return this;
        }
        public String getCubeId() {
            return this.cubeId;
        }

    }

}
