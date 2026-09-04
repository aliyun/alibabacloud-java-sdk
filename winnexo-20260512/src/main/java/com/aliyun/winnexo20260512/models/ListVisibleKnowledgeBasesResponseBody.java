// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListVisibleKnowledgeBasesResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The file information.</p>
     */
    @NameInMap("items")
    public java.util.List<ListVisibleKnowledgeBasesResponseBodyItems> items;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>190F5425-A145-5BBA-980F-082ADB0CA6AF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListVisibleKnowledgeBasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVisibleKnowledgeBasesResponseBody self = new ListVisibleKnowledgeBasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVisibleKnowledgeBasesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListVisibleKnowledgeBasesResponseBody setItems(java.util.List<ListVisibleKnowledgeBasesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListVisibleKnowledgeBasesResponseBodyItems> getItems() {
        return this.items;
    }

    public ListVisibleKnowledgeBasesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVisibleKnowledgeBasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVisibleKnowledgeBasesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListVisibleKnowledgeBasesResponseBodyItems extends TeaModel {
        /**
         * <p>The creator.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("creatorName")
        public String creatorName;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>{{7*7}}</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The directory ID. You can obtain this value by calling the API operation for retrieving the knowledge base directory.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleDirectoryId</p>
         */
        @NameInMap("directoryId")
        public String directoryId;

        /**
         * <p>The creation time. The value is a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1763086707000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1774533462</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <p>The skill name.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-default-umodel-1785637207863_k8s.metric.k8s_csi_node_pv_node_cn-heyuan-acdr-1/c80cf3a4f9d6c496781591bd17d006c6f</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The file directory information.</p>
         * 
         * <strong>example:</strong>
         * <p>/test-folder-path1_1773194924773</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>The number of resources in the FAILED state. This parameter is returned only when the top-level knowledge base directory list is queried.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sourceFailedCount")
        public Long sourceFailedCount;

        /**
         * <p>The number of resources in the READY state. This parameter is returned only when the top-level knowledge base directory list is queried.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sourceReadyCount")
        public Long sourceReadyCount;

        /**
         * <p>The total number of resources in the directory and its subdirectories. This parameter is returned only when the top-level knowledge base directory list is queried.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sourceTotalCount")
        public Long sourceTotalCount;

        public static ListVisibleKnowledgeBasesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListVisibleKnowledgeBasesResponseBodyItems self = new ListVisibleKnowledgeBasesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListVisibleKnowledgeBasesResponseBodyItems setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListVisibleKnowledgeBasesResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListVisibleKnowledgeBasesResponseBodyItems setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public ListVisibleKnowledgeBasesResponseBodyItems setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListVisibleKnowledgeBasesResponseBodyItems setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListVisibleKnowledgeBasesResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListVisibleKnowledgeBasesResponseBodyItems setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListVisibleKnowledgeBasesResponseBodyItems setSourceFailedCount(Long sourceFailedCount) {
            this.sourceFailedCount = sourceFailedCount;
            return this;
        }
        public Long getSourceFailedCount() {
            return this.sourceFailedCount;
        }

        public ListVisibleKnowledgeBasesResponseBodyItems setSourceReadyCount(Long sourceReadyCount) {
            this.sourceReadyCount = sourceReadyCount;
            return this;
        }
        public Long getSourceReadyCount() {
            return this.sourceReadyCount;
        }

        public ListVisibleKnowledgeBasesResponseBodyItems setSourceTotalCount(Long sourceTotalCount) {
            this.sourceTotalCount = sourceTotalCount;
            return this;
        }
        public Long getSourceTotalCount() {
            return this.sourceTotalCount;
        }

    }

}
