// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListKnowledgeBaseSourcesByObjectResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>The current zone list is illegal.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>The subject type filter.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The referenced sources. The key is the project name, and the value is the list of selected Logstores under the project, which is consistent with the structure submitted during creation. <code>[&quot;*&quot;]</code> indicates all Logstores under the project. Otherwise, it is a list of exact Logstore names. If no sources are referenced, an empty object <code>{}</code> is returned.</p>
     */
    @NameInMap("sources")
    public java.util.List<ListKnowledgeBaseSourcesByObjectResponseBodySources> sources;

    /**
     * <p>The total number of results.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListKnowledgeBaseSourcesByObjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeBaseSourcesByObjectResponseBody self = new ListKnowledgeBaseSourcesByObjectResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeBaseSourcesByObjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListKnowledgeBaseSourcesByObjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListKnowledgeBaseSourcesByObjectResponseBody setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListKnowledgeBaseSourcesByObjectResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListKnowledgeBaseSourcesByObjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListKnowledgeBaseSourcesByObjectResponseBody setSources(java.util.List<ListKnowledgeBaseSourcesByObjectResponseBodySources> sources) {
        this.sources = sources;
        return this;
    }
    public java.util.List<ListKnowledgeBaseSourcesByObjectResponseBodySources> getSources() {
        return this.sources;
    }

    public ListKnowledgeBaseSourcesByObjectResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListKnowledgeBaseSourcesByObjectResponseBodySources extends TeaModel {
        /**
         * <p>The description of the to-do card type.</p>
         * 
         * <strong>example:</strong>
         * <p>user-data test user_data_test fa6c967-20260928141235</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The directory ID.</p>
         * 
         * <strong>example:</strong>
         * <p>oort</p>
         */
        @NameInMap("directoryId")
        public String directoryId;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>openapi-feishu-personal-2ec49p76</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The permission scope.</p>
         * 
         * <strong>example:</strong>
         * <p>read:user,read:repo,write:repo,read:org,read:group</p>
         */
        @NameInMap("scope")
        public String scope;

        /**
         * <p>The ID of the enterprise knowledge base FILE data source to be replaced.</p>
         * 
         * <strong>example:</strong>
         * <p>2001188</p>
         */
        @NameInMap("sourceId")
        public String sourceId;

        /**
         * <p>The data source type.</p>
         * 
         * <strong>example:</strong>
         * <p>BUILTIN</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>The data source status after re-parsing.</p>
         * 
         * <strong>example:</strong>
         * <p>Stopped</p>
         */
        @NameInMap("status")
        public String status;

        public static ListKnowledgeBaseSourcesByObjectResponseBodySources build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeBaseSourcesByObjectResponseBodySources self = new ListKnowledgeBaseSourcesByObjectResponseBodySources();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeBaseSourcesByObjectResponseBodySources setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListKnowledgeBaseSourcesByObjectResponseBodySources setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public ListKnowledgeBaseSourcesByObjectResponseBodySources setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListKnowledgeBaseSourcesByObjectResponseBodySources setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListKnowledgeBaseSourcesByObjectResponseBodySources setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public ListKnowledgeBaseSourcesByObjectResponseBodySources setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListKnowledgeBaseSourcesByObjectResponseBodySources setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
