// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetAgentConfigResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public java.util.List<GetAgentConfigResponseBodyData> data;

    /**
     * <p>The error message.</p>
     * <ul>
     * <li>If <code>code == Success</code>, this field is empty.</li>
     * <li>Otherwise, this field contains the error message of the request.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SysomOpenAPIAssumeRoleException: EntityNotExist.Role The role not exists: acs:ram::xxxxx:role/aliyunserviceroleforsysom</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The number of returned records.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("total")
    public Long total;

    public static GetAgentConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentConfigResponseBody self = new GetAgentConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgentConfigResponseBody setData(java.util.List<GetAgentConfigResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetAgentConfigResponseBodyData> getData() {
        return this.data;
    }

    public GetAgentConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAgentConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentConfigResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class GetAgentConfigResponseBodyDataResource extends TeaModel {
        /**
         * <p>The number of clusters to which the configuration is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("cluster")
        public Integer cluster;

        /**
         * <p>The number of nodes to which the configuration is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("node")
        public Integer node;

        public static GetAgentConfigResponseBodyDataResource build(java.util.Map<String, ?> map) throws Exception {
            GetAgentConfigResponseBodyDataResource self = new GetAgentConfigResponseBodyDataResource();
            return TeaModel.build(map, self);
        }

        public GetAgentConfigResponseBodyDataResource setCluster(Integer cluster) {
            this.cluster = cluster;
            return this;
        }
        public Integer getCluster() {
            return this.cluster;
        }

        public GetAgentConfigResponseBodyDataResource setNode(Integer node) {
            this.node = node;
            return this;
        }
        public Integer getNode() {
            return this.node;
        }

    }

    public static class GetAgentConfigResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the component configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>4d5ecf02-3d01-11f0-8c90-00163e1029af</p>
         */
        @NameInMap("configId")
        public String configId;

        /**
         * <p>The name of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>Configuration-x</p>
         */
        @NameInMap("configName")
        public String configName;

        /**
         * <p>The type of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("configType")
        public String configType;

        /**
         * <p>The text of the chat content.</p>
         * 
         * <strong>example:</strong>
         * <p>The specific content of the copilot reply</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-10T17:57:10</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The information about the resources to which the configuration is applied.</p>
         */
        @NameInMap("resource")
        public GetAgentConfigResponseBodyDataResource resource;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-10T17:57:10</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        public static GetAgentConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentConfigResponseBodyData self = new GetAgentConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentConfigResponseBodyData setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public GetAgentConfigResponseBodyData setConfigName(String configName) {
            this.configName = configName;
            return this;
        }
        public String getConfigName() {
            return this.configName;
        }

        public GetAgentConfigResponseBodyData setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public GetAgentConfigResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetAgentConfigResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetAgentConfigResponseBodyData setResource(GetAgentConfigResponseBodyDataResource resource) {
            this.resource = resource;
            return this;
        }
        public GetAgentConfigResponseBodyDataResource getResource() {
            return this.resource;
        }

        public GetAgentConfigResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
