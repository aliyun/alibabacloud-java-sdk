// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qweneduaisuite20261102.models;

import com.aliyun.tea.*;

public class CreateEduProblemSolveRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("query")
    public CreateEduProblemSolveRequestQuery query;

    /**
     * <strong>example:</strong>
     * <p>019F593F-D6EE-5F44-819A-6CDA127D1637</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateEduProblemSolveRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEduProblemSolveRequest self = new CreateEduProblemSolveRequest();
        return TeaModel.build(map, self);
    }

    public CreateEduProblemSolveRequest setQuery(CreateEduProblemSolveRequestQuery query) {
        this.query = query;
        return this;
    }
    public CreateEduProblemSolveRequestQuery getQuery() {
        return this.query;
    }

    public CreateEduProblemSolveRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateEduProblemSolveRequestQueryImage extends TeaModel {
        @NameInMap("base64")
        public String base64;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("format")
        public String format;

        @NameInMap("url")
        public String url;

        public static CreateEduProblemSolveRequestQueryImage build(java.util.Map<String, ?> map) throws Exception {
            CreateEduProblemSolveRequestQueryImage self = new CreateEduProblemSolveRequestQueryImage();
            return TeaModel.build(map, self);
        }

        public CreateEduProblemSolveRequestQueryImage setBase64(String base64) {
            this.base64 = base64;
            return this;
        }
        public String getBase64() {
            return this.base64;
        }

        public CreateEduProblemSolveRequestQueryImage setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public CreateEduProblemSolveRequestQueryImage setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class CreateEduProblemSolveRequestQuery extends TeaModel {
        @NameInMap("image")
        public CreateEduProblemSolveRequestQueryImage image;

        public static CreateEduProblemSolveRequestQuery build(java.util.Map<String, ?> map) throws Exception {
            CreateEduProblemSolveRequestQuery self = new CreateEduProblemSolveRequestQuery();
            return TeaModel.build(map, self);
        }

        public CreateEduProblemSolveRequestQuery setImage(CreateEduProblemSolveRequestQueryImage image) {
            this.image = image;
            return this;
        }
        public CreateEduProblemSolveRequestQueryImage getImage() {
            return this.image;
        }

    }

}
