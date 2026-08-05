// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class DeleteConfigResponseBody extends TeaModel {
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
    public DeleteConfigResponseBodyResult result;

    public static DeleteConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigResponseBody self = new DeleteConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteConfigResponseBody setResult(DeleteConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteConfigResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteConfigResponseBodyResult extends TeaModel {
        /**
         * <p>The configuration type.</p>
         * <ul>
         * <li><p>prompt</p>
         * </li>
         * <li><p>lark</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>prompt</p>
         */
        @NameInMap("configType")
        public String configType;

        /**
         * <p>Indicates whether the configuration is deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("deleted")
        public Boolean deleted;

        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a1b2c3</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1200827</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static DeleteConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteConfigResponseBodyResult self = new DeleteConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteConfigResponseBodyResult setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public DeleteConfigResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public DeleteConfigResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DeleteConfigResponseBodyResult setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
