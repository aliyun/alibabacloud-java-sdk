// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111.models;

import com.aliyun.tea.*;

public class HelloResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public HelloResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("msg")
    public String msg;

    @NameInMap("requestId")
    public String requestId;

    public static HelloResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HelloResponseBody self = new HelloResponseBody();
        return TeaModel.build(map, self);
    }

    public HelloResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HelloResponseBody setData(HelloResponseBodyData data) {
        this.data = data;
        return this;
    }
    public HelloResponseBodyData getData() {
        return this.data;
    }

    public HelloResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public HelloResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class HelloResponseBodyData extends TeaModel {
        @NameInMap("date")
        public String date;

        /**
         * <strong>example:</strong>
         * <p>ack1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("success")
        public Boolean success;

        public static HelloResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            HelloResponseBodyData self = new HelloResponseBodyData();
            return TeaModel.build(map, self);
        }

        public HelloResponseBodyData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public HelloResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HelloResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
