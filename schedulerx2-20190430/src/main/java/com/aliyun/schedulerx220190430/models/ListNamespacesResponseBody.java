// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ListNamespacesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The list of namespaces.</p>
     */
    @NameInMap("Data")
    public ListNamespacesResponseBodyData data;

    /**
     * <p>The additional information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The call is successful.</p>
     * <p>*   **false**: The call fails.</p>
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
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the namespace.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the namespace.</p>
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
         * <p>The list and details of the namespaces.</p>
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
