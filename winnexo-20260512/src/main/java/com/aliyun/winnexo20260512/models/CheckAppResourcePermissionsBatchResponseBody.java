// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CheckAppResourcePermissionsBatchResponseBody extends TeaModel {
    /**
     * <p>业务状态码；成功为 200</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>错误描述；成功时为空</p>
     * 
     * <strong>example:</strong>
     * <p>请求的资源不存在</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>与请求顺序一致的结果</p>
     */
    @NameInMap("results")
    public java.util.List<CheckAppResourcePermissionsBatchResponseBodyResults> results;

    public static CheckAppResourcePermissionsBatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckAppResourcePermissionsBatchResponseBody self = new CheckAppResourcePermissionsBatchResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckAppResourcePermissionsBatchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckAppResourcePermissionsBatchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckAppResourcePermissionsBatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckAppResourcePermissionsBatchResponseBody setResults(java.util.List<CheckAppResourcePermissionsBatchResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<CheckAppResourcePermissionsBatchResponseBodyResults> getResults() {
        return this.results;
    }

    public static class CheckAppResourcePermissionsBatchResponseBodyResults extends TeaModel {
        /**
         * <p>是否有权限</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("allowed")
        public Boolean allowed;

        /**
         * <p>目标权限点</p>
         * 
         * <strong>example:</strong>
         * <p>APP/VIEW</p>
         */
        @NameInMap("permission")
        public String permission;

        /**
         * <p>首段为 APP 应用键的点分资源键</p>
         * 
         * <strong>example:</strong>
         * <p>app.demo.resource_1</p>
         */
        @NameInMap("resourceKey")
        public String resourceKey;

        /**
         * <p>固定为 APP_RESOURCE</p>
         * 
         * <strong>example:</strong>
         * <p>APP_RESOURCE</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        public static CheckAppResourcePermissionsBatchResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            CheckAppResourcePermissionsBatchResponseBodyResults self = new CheckAppResourcePermissionsBatchResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public CheckAppResourcePermissionsBatchResponseBodyResults setAllowed(Boolean allowed) {
            this.allowed = allowed;
            return this;
        }
        public Boolean getAllowed() {
            return this.allowed;
        }

        public CheckAppResourcePermissionsBatchResponseBodyResults setPermission(String permission) {
            this.permission = permission;
            return this;
        }
        public String getPermission() {
            return this.permission;
        }

        public CheckAppResourcePermissionsBatchResponseBodyResults setResourceKey(String resourceKey) {
            this.resourceKey = resourceKey;
            return this;
        }
        public String getResourceKey() {
            return this.resourceKey;
        }

        public CheckAppResourcePermissionsBatchResponseBodyResults setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
