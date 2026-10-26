// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserTagValueListResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the request for a list of user tags and their values.</p>
     */
    @NameInMap("Result")
    public java.util.List<QueryUserTagValueListResponseBodyResult> result;

    /**
     * <p>Indicates whether the request was successful. Possible values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryUserTagValueListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUserTagValueListResponseBody self = new QueryUserTagValueListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUserTagValueListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUserTagValueListResponseBody setResult(java.util.List<QueryUserTagValueListResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryUserTagValueListResponseBodyResult> getResult() {
        return this.result;
    }

    public QueryUserTagValueListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryUserTagValueListResponseBodyResult extends TeaModel {
        /**
         * <p>Tag ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pop_001</p>
         */
        @NameInMap("TagId")
        public String tagId;

        /**
         * <p>Tag name.</p>
         * 
         * <strong>example:</strong>
         * <p>Position</p>
         */
        @NameInMap("TagName")
        public String tagName;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>Supervisor</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static QueryUserTagValueListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryUserTagValueListResponseBodyResult self = new QueryUserTagValueListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryUserTagValueListResponseBodyResult setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

        public QueryUserTagValueListResponseBodyResult setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public QueryUserTagValueListResponseBodyResult setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
