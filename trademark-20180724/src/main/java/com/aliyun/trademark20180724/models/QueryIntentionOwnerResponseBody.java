// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryIntentionOwnerResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Module")
    public QueryIntentionOwnerResponseBodyModule module;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryIntentionOwnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryIntentionOwnerResponseBody self = new QueryIntentionOwnerResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryIntentionOwnerResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryIntentionOwnerResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryIntentionOwnerResponseBody setModule(QueryIntentionOwnerResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public QueryIntentionOwnerResponseBodyModule getModule() {
        return this.module;
    }

    public QueryIntentionOwnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryIntentionOwnerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryIntentionOwnerResponseBodyModule extends TeaModel {
        @NameInMap("OwnerId")
        public Float ownerId;

        @NameInMap("OwnerName")
        public String ownerName;

        public static QueryIntentionOwnerResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            QueryIntentionOwnerResponseBodyModule self = new QueryIntentionOwnerResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public QueryIntentionOwnerResponseBodyModule setOwnerId(Float ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Float getOwnerId() {
            return this.ownerId;
        }

        public QueryIntentionOwnerResponseBodyModule setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

    }

}
