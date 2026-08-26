// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeKnowledgeBasesResponseBody extends TeaModel {
    /**
     * <p>The list of knowledge bases.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeKnowledgeBasesResponseBodyItems> items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: <strong>30</strong>, <strong>50</strong>, and <strong>100</strong>.</p>
     * <p>Default value: <strong>30</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CDB3258F-B5DE-43C4-8935-CBA0CA******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeKnowledgeBasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKnowledgeBasesResponseBody self = new DescribeKnowledgeBasesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKnowledgeBasesResponseBody setItems(java.util.List<DescribeKnowledgeBasesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeKnowledgeBasesResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeKnowledgeBasesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeKnowledgeBasesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeKnowledgeBasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeKnowledgeBasesResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeKnowledgeBasesResponseBodyItems extends TeaModel {
        /**
         * <p>The number of AI applications bound to the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("BindingAppCount")
        public Integer bindingAppCount;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-25T09:37:10Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>testDesc</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The unique identifier of the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>pkb-xxxxxx</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>The ID of the knowledge space.</p>
         * 
         * <strong>example:</strong>
         * <p>pks-xxxxxx</p>
         */
        @NameInMap("KnowledgeSpaceId")
        public String knowledgeSpaceId;

        /**
         * <p>The name of the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>Activation</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The total number of documents.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalDocs")
        public Integer totalDocs;

        /**
         * <p>The total size in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>231984</p>
         */
        @NameInMap("TotalSizeBytes")
        public Long totalSizeBytes;

        public static DescribeKnowledgeBasesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeKnowledgeBasesResponseBodyItems self = new DescribeKnowledgeBasesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeKnowledgeBasesResponseBodyItems setBindingAppCount(Integer bindingAppCount) {
            this.bindingAppCount = bindingAppCount;
            return this;
        }
        public Integer getBindingAppCount() {
            return this.bindingAppCount;
        }

        public DescribeKnowledgeBasesResponseBodyItems setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeKnowledgeBasesResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeKnowledgeBasesResponseBodyItems setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public DescribeKnowledgeBasesResponseBodyItems setKnowledgeSpaceId(String knowledgeSpaceId) {
            this.knowledgeSpaceId = knowledgeSpaceId;
            return this;
        }
        public String getKnowledgeSpaceId() {
            return this.knowledgeSpaceId;
        }

        public DescribeKnowledgeBasesResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeKnowledgeBasesResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeKnowledgeBasesResponseBodyItems setTotalDocs(Integer totalDocs) {
            this.totalDocs = totalDocs;
            return this;
        }
        public Integer getTotalDocs() {
            return this.totalDocs;
        }

        public DescribeKnowledgeBasesResponseBodyItems setTotalSizeBytes(Long totalSizeBytes) {
            this.totalSizeBytes = totalSizeBytes;
            return this;
        }
        public Long getTotalSizeBytes() {
            return this.totalSizeBytes;
        }

    }

}
