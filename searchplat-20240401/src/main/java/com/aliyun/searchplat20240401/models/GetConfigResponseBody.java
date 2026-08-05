// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class GetConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7CC54C38-D721-4C55-A410-2A94B5A6BE0F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public GetConfigResponseBodyResult result;

    public static GetConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConfigResponseBody self = new GetConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConfigResponseBody setResult(GetConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetConfigResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetConfigResponseBodyResult extends TeaModel {
        /**
         * <p>The configuration content.</p>
         */
        @NameInMap("configData")
        public java.util.Map<String, ?> configData;

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
         * <p>lark</p>
         */
        @NameInMap("configType")
        public String configType;

        /**
         * <p>The time when the configuration was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-18T07:04:42.877040</p>
         */
        @NameInMap("createdAt")
        public Long createdAt;

        /**
         * <p>The time when the configuration was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-18T07:04:42.877040</p>
         */
        @NameInMap("updatedAt")
        public Long updatedAt;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1201721</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static GetConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetConfigResponseBodyResult self = new GetConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetConfigResponseBodyResult setConfigData(java.util.Map<String, ?> configData) {
            this.configData = configData;
            return this;
        }
        public java.util.Map<String, ?> getConfigData() {
            return this.configData;
        }

        public GetConfigResponseBodyResult setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public GetConfigResponseBodyResult setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public GetConfigResponseBodyResult setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public GetConfigResponseBodyResult setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
