// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class GetTableColumnsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CC93E65-6734-5060-BEF7-0EB0A4862BCF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public java.util.List<GetTableColumnsResponseBodyResult> result;

    public static GetTableColumnsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTableColumnsResponseBody self = new GetTableColumnsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTableColumnsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTableColumnsResponseBody setResult(java.util.List<GetTableColumnsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetTableColumnsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetTableColumnsResponseBodyResult extends TeaModel {
        /**
         * <p>The field description.</p>
         * 
         * <strong>example:</strong>
         * <p>主键字段</p>
         */
        @NameInMap("comment")
        public String comment;

        /**
         * <p>The field name.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Indicates whether the field is a primary key.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("primary")
        public Boolean primary;

        /**
         * <p>The field type.</p>
         * 
         * <strong>example:</strong>
         * <p>BIGINT</p>
         */
        @NameInMap("type")
        public String type;

        public static GetTableColumnsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetTableColumnsResponseBodyResult self = new GetTableColumnsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetTableColumnsResponseBodyResult setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetTableColumnsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTableColumnsResponseBodyResult setPrimary(Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Boolean getPrimary() {
            return this.primary;
        }

        public GetTableColumnsResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
