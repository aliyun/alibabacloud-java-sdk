// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ListNamespacesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The information about the namespaces.</p>
     */
    @NameInMap("Data")
    public ListNamespacesResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>71BCC0E3-64B2-4B63-A870-AFB64EBCB58C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListNamespacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNamespacesResponseBody self = new ListNamespacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNamespacesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListNamespacesResponseBody setData(ListNamespacesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListNamespacesResponseBodyData getData() {
        return this.data;
    }

    public ListNamespacesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListNamespacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNamespacesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListNamespacesResponseBodyDataNamespaces extends TeaModel {
        /**
         * <p>The description of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>doc</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1a72ecb1-b4cc-400a-a71b-20cdec9b****</p>
         */
        @NameInMap("UId")
        public String UId;

        public static ListNamespacesResponseBodyDataNamespaces build(java.util.Map<String, ?> map) throws Exception {
            ListNamespacesResponseBodyDataNamespaces self = new ListNamespacesResponseBodyDataNamespaces();
            return TeaModel.build(map, self);
        }

        public ListNamespacesResponseBodyDataNamespaces setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListNamespacesResponseBodyDataNamespaces setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListNamespacesResponseBodyDataNamespaces setUId(String UId) {
            this.UId = UId;
            return this;
        }
        public String getUId() {
            return this.UId;
        }

    }

    public static class ListNamespacesResponseBodyData extends TeaModel {
        /**
         * <p>The namespaces and their details.</p>
         */
        @NameInMap("Namespaces")
        public java.util.List<ListNamespacesResponseBodyDataNamespaces> namespaces;

        public static ListNamespacesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListNamespacesResponseBodyData self = new ListNamespacesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListNamespacesResponseBodyData setNamespaces(java.util.List<ListNamespacesResponseBodyDataNamespaces> namespaces) {
            this.namespaces = namespaces;
            return this;
        }
        public java.util.List<ListNamespacesResponseBodyDataNamespaces> getNamespaces() {
            return this.namespaces;
        }

    }

}
