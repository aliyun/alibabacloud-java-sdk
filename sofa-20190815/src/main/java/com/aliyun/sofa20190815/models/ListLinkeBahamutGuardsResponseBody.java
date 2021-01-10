// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutGuardsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<ListLinkeBahamutGuardsResponseBodyResult> result;

    public static ListLinkeBahamutGuardsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutGuardsResponseBody self = new ListLinkeBahamutGuardsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutGuardsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLinkeBahamutGuardsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLinkeBahamutGuardsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLinkeBahamutGuardsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListLinkeBahamutGuardsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLinkeBahamutGuardsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListLinkeBahamutGuardsResponseBody setResult(java.util.List<ListLinkeBahamutGuardsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListLinkeBahamutGuardsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListLinkeBahamutGuardsResponseBodyResult extends TeaModel {
        @NameInMap("Created")
        public Long created;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Description")
        public String description;

        @NameInMap("Expression")
        public String expression;

        @NameInMap("Id")
        public String id;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("TenantId")
        public String tenantId;

        public static ListLinkeBahamutGuardsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeBahamutGuardsResponseBodyResult self = new ListLinkeBahamutGuardsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListLinkeBahamutGuardsResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public ListLinkeBahamutGuardsResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ListLinkeBahamutGuardsResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListLinkeBahamutGuardsResponseBodyResult setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public ListLinkeBahamutGuardsResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListLinkeBahamutGuardsResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public ListLinkeBahamutGuardsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLinkeBahamutGuardsResponseBodyResult setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
