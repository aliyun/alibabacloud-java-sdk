// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DeleteProjectsResponseBody extends TeaModel {
    /**
     * <p>The unique identifier that Alibaba Cloud generated for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The call results of the operation.</p>
     */
    @NameInMap("Results")
    public java.util.List<DeleteProjectsResponseBodyResults> results;

    public static DeleteProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteProjectsResponseBody self = new DeleteProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteProjectsResponseBody setResults(java.util.List<DeleteProjectsResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<DeleteProjectsResponseBodyResults> getResults() {
        return this.results;
    }

    public static class DeleteProjectsResponseBodyResults extends TeaModel {
        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        public static DeleteProjectsResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            DeleteProjectsResponseBodyResults self = new DeleteProjectsResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public DeleteProjectsResponseBodyResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeleteProjectsResponseBodyResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteProjectsResponseBodyResults setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

    }

}
