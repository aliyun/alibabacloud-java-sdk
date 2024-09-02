// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateSummariesRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public java.util.List<UpdateSummariesRequestBody> body;

    /**
     * <p>Specifies whether the request is a dry run.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static UpdateSummariesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSummariesRequest self = new UpdateSummariesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSummariesRequest setBody(java.util.List<UpdateSummariesRequestBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<UpdateSummariesRequestBody> getBody() {
        return this.body;
    }

    public UpdateSummariesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static class UpdateSummariesRequestBody extends TeaModel {
        /**
         * <p>The HTML tag that is used to highlight terms in red.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;em&quot;</p>
         */
        @NameInMap("element")
        public String element;

        /**
         * <p>The connector that is used to connect segments.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;...&quot;</p>
         */
        @NameInMap("ellipsis")
        public String ellipsis;

        /**
         * <p>The field.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;title&quot;</p>
         */
        @NameInMap("field")
        public String field;

        /**
         * <p>The length of a segment.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("len")
        public Integer len;

        /**
         * <p>The number of segments.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("snippet")
        public Integer snippet;

        public static UpdateSummariesRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateSummariesRequestBody self = new UpdateSummariesRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateSummariesRequestBody setElement(String element) {
            this.element = element;
            return this;
        }
        public String getElement() {
            return this.element;
        }

        public UpdateSummariesRequestBody setEllipsis(String ellipsis) {
            this.ellipsis = ellipsis;
            return this;
        }
        public String getEllipsis() {
            return this.ellipsis;
        }

        public UpdateSummariesRequestBody setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public UpdateSummariesRequestBody setLen(Integer len) {
            this.len = len;
            return this;
        }
        public Integer getLen() {
            return this.len;
        }

        public UpdateSummariesRequestBody setSnippet(Integer snippet) {
            this.snippet = snippet;
            return this;
        }
        public Integer getSnippet() {
            return this.snippet;
        }

    }

}
