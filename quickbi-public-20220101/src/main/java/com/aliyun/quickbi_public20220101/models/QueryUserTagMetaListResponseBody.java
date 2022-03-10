// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserTagMetaListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<QueryUserTagMetaListResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static QueryUserTagMetaListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUserTagMetaListResponseBody self = new QueryUserTagMetaListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUserTagMetaListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUserTagMetaListResponseBody setResult(java.util.List<QueryUserTagMetaListResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryUserTagMetaListResponseBodyResult> getResult() {
        return this.result;
    }

    public QueryUserTagMetaListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryUserTagMetaListResponseBodyResult extends TeaModel {
        @NameInMap("TagDescription")
        public String tagDescription;

        @NameInMap("TagId")
        public String tagId;

        @NameInMap("TagName")
        public String tagName;

        public static QueryUserTagMetaListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryUserTagMetaListResponseBodyResult self = new QueryUserTagMetaListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryUserTagMetaListResponseBodyResult setTagDescription(String tagDescription) {
            this.tagDescription = tagDescription;
            return this;
        }
        public String getTagDescription() {
            return this.tagDescription;
        }

        public QueryUserTagMetaListResponseBodyResult setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

        public QueryUserTagMetaListResponseBodyResult setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

}
