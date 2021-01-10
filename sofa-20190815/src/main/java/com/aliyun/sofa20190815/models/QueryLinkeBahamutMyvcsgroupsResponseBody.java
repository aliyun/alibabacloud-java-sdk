// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutMyvcsgroupsResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkeBahamutMyvcsgroupsResponseBodyResult> result;

    public static QueryLinkeBahamutMyvcsgroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutMyvcsgroupsResponseBody self = new QueryLinkeBahamutMyvcsgroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutMyvcsgroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutMyvcsgroupsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutMyvcsgroupsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutMyvcsgroupsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeBahamutMyvcsgroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutMyvcsgroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeBahamutMyvcsgroupsResponseBody setResult(java.util.List<QueryLinkeBahamutMyvcsgroupsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryLinkeBahamutMyvcsgroupsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QueryLinkeBahamutMyvcsgroupsResponseBodyResult extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Path")
        public String path;

        public static QueryLinkeBahamutMyvcsgroupsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutMyvcsgroupsResponseBodyResult self = new QueryLinkeBahamutMyvcsgroupsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutMyvcsgroupsResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryLinkeBahamutMyvcsgroupsResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeBahamutMyvcsgroupsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeBahamutMyvcsgroupsResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

}
