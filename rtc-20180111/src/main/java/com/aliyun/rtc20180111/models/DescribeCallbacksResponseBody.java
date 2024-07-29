// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeCallbacksResponseBody extends TeaModel {
    @NameInMap("Callbacks")
    public java.util.List<DescribeCallbacksResponseBodyCallbacks> callbacks;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCallbacksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCallbacksResponseBody self = new DescribeCallbacksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCallbacksResponseBody setCallbacks(java.util.List<DescribeCallbacksResponseBodyCallbacks> callbacks) {
        this.callbacks = callbacks;
        return this;
    }
    public java.util.List<DescribeCallbacksResponseBodyCallbacks> getCallbacks() {
        return this.callbacks;
    }

    public DescribeCallbacksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCallbacksResponseBodyCallbacks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>RecordEvent</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CheckStatus")
        public String checkStatus;

        /**
         * <strong>example:</strong>
         * <p>RESPONSE_INVALID</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
         */
        @NameInMap("Conf")
        public String conf;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        @NameInMap("SubEvent")
        public java.util.List<Integer> subEvent;

        public static DescribeCallbacksResponseBodyCallbacks build(java.util.Map<String, ?> map) throws Exception {
            DescribeCallbacksResponseBodyCallbacks self = new DescribeCallbacksResponseBodyCallbacks();
            return TeaModel.build(map, self);
        }

        public DescribeCallbacksResponseBodyCallbacks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeCallbacksResponseBodyCallbacks setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public DescribeCallbacksResponseBodyCallbacks setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeCallbacksResponseBodyCallbacks setConf(String conf) {
            this.conf = conf;
            return this;
        }
        public String getConf() {
            return this.conf;
        }

        public DescribeCallbacksResponseBodyCallbacks setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public DescribeCallbacksResponseBodyCallbacks setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeCallbacksResponseBodyCallbacks setSubEvent(java.util.List<Integer> subEvent) {
            this.subEvent = subEvent;
            return this;
        }
        public java.util.List<Integer> getSubEvent() {
            return this.subEvent;
        }

    }

}
