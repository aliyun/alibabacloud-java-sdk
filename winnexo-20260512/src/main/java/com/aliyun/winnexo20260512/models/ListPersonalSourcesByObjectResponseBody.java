// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListPersonalSourcesByObjectResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>错误描述，成功时为 success</p>
     * 
     * <strong>example:</strong>
     * <p>请求的资源不存在</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>当前页码</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>每页条数</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>当前页资源列表；空数组表示当前页没有可见匹配资源</p>
     */
    @NameInMap("sources")
    public java.util.List<ListPersonalSourcesByObjectResponseBodySources> sources;

    /**
     * <p>权限过滤并按 Source ID 去重后的匹配总数</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListPersonalSourcesByObjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPersonalSourcesByObjectResponseBody self = new ListPersonalSourcesByObjectResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPersonalSourcesByObjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPersonalSourcesByObjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPersonalSourcesByObjectResponseBody setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListPersonalSourcesByObjectResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListPersonalSourcesByObjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPersonalSourcesByObjectResponseBody setSources(java.util.List<ListPersonalSourcesByObjectResponseBodySources> sources) {
        this.sources = sources;
        return this;
    }
    public java.util.List<ListPersonalSourcesByObjectResponseBodySources> getSources() {
        return this.sources;
    }

    public ListPersonalSourcesByObjectResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListPersonalSourcesByObjectResponseBodySources extends TeaModel {
        /**
         * <p>资源描述，可为空</p>
         * 
         * <strong>example:</strong>
         * <p>user-data test user_data_test fa6c967-20260928141235</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>权限过滤后选择的代表目录 ID；不暴露不可读目录</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("directoryId")
        public String directoryId;

        /**
         * <p>资源名称</p>
         * 
         * <strong>example:</strong>
         * <p>openapi-personal-public-url-7vw69qzc</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>资源范围，固定为 PERSONAL</p>
         * 
         * <strong>example:</strong>
         * <p>read:user,read:repo,write:repo,read:org,read:group</p>
         */
        @NameInMap("scope")
        public String scope;

        /**
         * <p>资源 ID</p>
         * 
         * <strong>example:</strong>
         * <p>src-da170aem1hkj8qfor7ig</p>
         */
        @NameInMap("sourceId")
        public String sourceId;

        /**
         * <p>资源类型，如 TEXT、FILE、ONLINE_DOC、VOICE_MEETING 等</p>
         * 
         * <strong>example:</strong>
         * <p>BUILTIN</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>资源实际处理状态，如 READY、RUNNING、PENDING、FAILED 等</p>
         * 
         * <strong>example:</strong>
         * <p>Stopped</p>
         */
        @NameInMap("status")
        public String status;

        public static ListPersonalSourcesByObjectResponseBodySources build(java.util.Map<String, ?> map) throws Exception {
            ListPersonalSourcesByObjectResponseBodySources self = new ListPersonalSourcesByObjectResponseBodySources();
            return TeaModel.build(map, self);
        }

        public ListPersonalSourcesByObjectResponseBodySources setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPersonalSourcesByObjectResponseBodySources setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public ListPersonalSourcesByObjectResponseBodySources setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPersonalSourcesByObjectResponseBodySources setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListPersonalSourcesByObjectResponseBodySources setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public ListPersonalSourcesByObjectResponseBodySources setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListPersonalSourcesByObjectResponseBodySources setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
