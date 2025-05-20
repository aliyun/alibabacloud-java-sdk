// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadNumGroupByClassResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ReadNumGroupByClassResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ReadNumGroupByClassResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReadNumGroupByClassResponseBody self = new ReadNumGroupByClassResponseBody();
        return TeaModel.build(map, self);
    }

    public ReadNumGroupByClassResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReadNumGroupByClassResponseBody setData(java.util.List<ReadNumGroupByClassResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ReadNumGroupByClassResponseBodyData> getData() {
        return this.data;
    }

    public ReadNumGroupByClassResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReadNumGroupByClassResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReadNumGroupByClassResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ReadNumGroupByClassResponseBodyData extends TeaModel {
        @NameInMap("ClassId")
        public Long classId;

        @NameInMap("MsgCount")
        public Long msgCount;

        public static ReadNumGroupByClassResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReadNumGroupByClassResponseBodyData self = new ReadNumGroupByClassResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReadNumGroupByClassResponseBodyData setClassId(Long classId) {
            this.classId = classId;
            return this;
        }
        public Long getClassId() {
            return this.classId;
        }

        public ReadNumGroupByClassResponseBodyData setMsgCount(Long msgCount) {
            this.msgCount = msgCount;
            return this;
        }
        public Long getMsgCount() {
            return this.msgCount;
        }

    }

}
