// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class CreateConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AAD430CC-D016-10BF-B837-8DA1EED87E94</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The result object.</p>
     */
    @NameInMap("result")
    public CreateConfigResponseBodyResult result;

    public static CreateConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigResponseBody self = new CreateConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateConfigResponseBody setResult(CreateConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateConfigResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateConfigResponseBodyResult extends TeaModel {
        /**
         * <p>The configuration content.</p>
         */
        @NameInMap("configData")
        public java.util.Map<String, ?> configData;

        /**
         * <p>The configuration type.</p>
         * 
         * <strong>example:</strong>
         * <p>prompt</p>
         */
        @NameInMap("configType")
        public String configType;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-18T07:04:42.877040</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-18T07:04:42.877040</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-001</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static CreateConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateConfigResponseBodyResult self = new CreateConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateConfigResponseBodyResult setConfigData(java.util.Map<String, ?> configData) {
            this.configData = configData;
            return this;
        }
        public java.util.Map<String, ?> getConfigData() {
            return this.configData;
        }

        public CreateConfigResponseBodyResult setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public CreateConfigResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateConfigResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateConfigResponseBodyResult setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
