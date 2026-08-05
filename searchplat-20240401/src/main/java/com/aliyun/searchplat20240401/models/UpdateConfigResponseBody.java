// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class UpdateConfigResponseBody extends TeaModel {
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
    public UpdateConfigResponseBodyResult result;

    public static UpdateConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigResponseBody self = new UpdateConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateConfigResponseBody setResult(UpdateConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateConfigResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateConfigResponseBodyResult extends TeaModel {
        /**
         * <p>The configuration content.</p>
         */
        @NameInMap("configData")
        public java.util.Map<String, ?> configData;

        /**
         * <p>The configuration category.</p>
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

        public static UpdateConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateConfigResponseBodyResult self = new UpdateConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateConfigResponseBodyResult setConfigData(java.util.Map<String, ?> configData) {
            this.configData = configData;
            return this;
        }
        public java.util.Map<String, ?> getConfigData() {
            return this.configData;
        }

        public UpdateConfigResponseBodyResult setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public UpdateConfigResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateConfigResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateConfigResponseBodyResult setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
