// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListScriptVariablesResponseBody extends TeaModel {
    /**
     * <p>The API status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The list of variables.</p>
     */
    @NameInMap("Variables")
    public java.util.List<ListScriptVariablesResponseBodyVariables> variables;

    public static ListScriptVariablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScriptVariablesResponseBody self = new ListScriptVariablesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScriptVariablesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListScriptVariablesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListScriptVariablesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListScriptVariablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScriptVariablesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListScriptVariablesResponseBody setVariables(java.util.List<ListScriptVariablesResponseBodyVariables> variables) {
        this.variables = variables;
        return this;
    }
    public java.util.List<ListScriptVariablesResponseBodyVariables> getVariables() {
        return this.variables;
    }

    public static class ListScriptVariablesResponseBodyVariables extends TeaModel {
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>表示客户的真实姓名</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The display name of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>姓名</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The name of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListScriptVariablesResponseBodyVariables build(java.util.Map<String, ?> map) throws Exception {
            ListScriptVariablesResponseBodyVariables self = new ListScriptVariablesResponseBodyVariables();
            return TeaModel.build(map, self);
        }

        public ListScriptVariablesResponseBodyVariables setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListScriptVariablesResponseBodyVariables setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListScriptVariablesResponseBodyVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
