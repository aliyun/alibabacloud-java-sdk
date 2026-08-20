// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListUserVisibleKnowledgeBasesResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The result list.
     * Maximum size:
     *     50</p>
     */
    @NameInMap("items")
    public java.util.List<ListUserVisibleKnowledgeBasesResponseBodyItems> items;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>The current zone list is illegal.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListUserVisibleKnowledgeBasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserVisibleKnowledgeBasesResponseBody self = new ListUserVisibleKnowledgeBasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserVisibleKnowledgeBasesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUserVisibleKnowledgeBasesResponseBody setItems(java.util.List<ListUserVisibleKnowledgeBasesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListUserVisibleKnowledgeBasesResponseBodyItems> getItems() {
        return this.items;
    }

    public ListUserVisibleKnowledgeBasesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUserVisibleKnowledgeBasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserVisibleKnowledgeBasesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListUserVisibleKnowledgeBasesResponseBodyItems extends TeaModel {
        /**
         * <p>The user ID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("creatorId")
        public Long creatorId;

        /**
         * <p>The name of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>John</p>
         */
        @NameInMap("creatorName")
        public String creatorName;

        /**
         * <p>The description of the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>Product materials and usage instructions</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The directory ID of the enterprise knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>dir_example</p>
         */
        @NameInMap("directoryId")
        public String directoryId;

        /**
         * <p>The directory type.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("directoryKind")
        public String directoryKind;

        /**
         * <p>The directory type.</p>
         * 
         * <strong>example:</strong>
         * <p>TENANT</p>
         */
        @NameInMap("directoryType")
        public String directoryType;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <p>The last modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>Product Knowledge Base</p>
         */
        @NameInMap("name")
        public String name;

        public static ListUserVisibleKnowledgeBasesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListUserVisibleKnowledgeBasesResponseBodyItems self = new ListUserVisibleKnowledgeBasesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListUserVisibleKnowledgeBasesResponseBodyItems setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public ListUserVisibleKnowledgeBasesResponseBodyItems setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListUserVisibleKnowledgeBasesResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUserVisibleKnowledgeBasesResponseBodyItems setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public ListUserVisibleKnowledgeBasesResponseBodyItems setDirectoryKind(String directoryKind) {
            this.directoryKind = directoryKind;
            return this;
        }
        public String getDirectoryKind() {
            return this.directoryKind;
        }

        public ListUserVisibleKnowledgeBasesResponseBodyItems setDirectoryType(String directoryType) {
            this.directoryType = directoryType;
            return this;
        }
        public String getDirectoryType() {
            return this.directoryType;
        }

        public ListUserVisibleKnowledgeBasesResponseBodyItems setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListUserVisibleKnowledgeBasesResponseBodyItems setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListUserVisibleKnowledgeBasesResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
