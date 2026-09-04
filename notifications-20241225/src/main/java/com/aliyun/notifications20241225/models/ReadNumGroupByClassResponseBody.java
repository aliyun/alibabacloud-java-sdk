// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadNumGroupByClassResponseBody extends TeaModel {
    /**
     * <p>The error code returned when the call fails. For more information, see error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The execution result.</p>
     */
    @NameInMap("Data")
    public java.util.List<ReadNumGroupByClassResponseBodyData> data;

    /**
     * <p>The message returned when the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A5F62766-1C2F-1F56-A39D-63E3D30F0633</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li>true: The call was successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
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
        /**
         * <p>The message category ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ClassId")
        public Long classId;

        /**
         * <p>The number of unread messages in the category.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
