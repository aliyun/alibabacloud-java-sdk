// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListPodsOfInstanceResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B149FD9C-ED5C-5765-B3AD-05AA4A4D64D7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ListPodsOfInstanceResponseBodyData> data;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>instance not exists</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>42</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListPodsOfInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPodsOfInstanceResponseBody self = new ListPodsOfInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPodsOfInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPodsOfInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPodsOfInstanceResponseBody setData(java.util.List<ListPodsOfInstanceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPodsOfInstanceResponseBodyData> getData() {
        return this.data;
    }

    public ListPodsOfInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPodsOfInstanceResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListPodsOfInstanceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <strong>example:</strong>
         * <p>test-pod</p>
         */
        @NameInMap("pod")
        public String pod;

        public static ListPodsOfInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPodsOfInstanceResponseBodyData self = new ListPodsOfInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPodsOfInstanceResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListPodsOfInstanceResponseBodyData setPod(String pod) {
            this.pod = pod;
            return this;
        }
        public String getPod() {
            return this.pod;
        }

    }

}
