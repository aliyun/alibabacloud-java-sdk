// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDataProcessJobTemplatesResponseBody extends TeaModel {
    /**
     * <p>The list of data processing task templates.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeDataProcessJobTemplatesResponseBodyItems> items;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of templates returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of templates that meet the specified conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeDataProcessJobTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataProcessJobTemplatesResponseBody self = new DescribeDataProcessJobTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataProcessJobTemplatesResponseBody setItems(java.util.List<DescribeDataProcessJobTemplatesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeDataProcessJobTemplatesResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeDataProcessJobTemplatesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDataProcessJobTemplatesResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeDataProcessJobTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataProcessJobTemplatesResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeDataProcessJobTemplatesResponseBodyItems extends TeaModel {
        /**
         * <p>Specifies whether it is required to fetch the summary or video synopsis.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Captioning")
        public Boolean captioning;

        /**
         * <p>The prompt used when extracting captions.</p>
         * 
         * <strong>example:</strong>
         * <p>Summarize the image content</p>
         */
        @NameInMap("CaptioningPrompt")
        public String captioningPrompt;

        /**
         * <p>The time when the task template was created, in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01T00:00:00Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>Specifies whether to convert content into vectors.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Embedding")
        public Boolean embedding;

        /**
         * <p>The output dimension of the vector.</p>
         * 
         * <strong>example:</strong>
         * <p>768</p>
         */
        @NameInMap("EmbeddingDimension")
        public Integer embeddingDimension;

        /**
         * <p>The task template status.</p>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The JSON configuration string of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ETL_TEMPLATE_STR&quot;:&quot;config&quot;}</p>
         */
        @NameInMap("TemplateConfig")
        public String templateConfig;

        /**
         * <p>The task template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tpl-123456</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The task template name.</p>
         * 
         * <strong>example:</strong>
         * <p>template1</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The node templatetype. Valid value: image.</p>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        @NameInMap("TemplateType")
        public String templateType;

        public static DescribeDataProcessJobTemplatesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataProcessJobTemplatesResponseBodyItems self = new DescribeDataProcessJobTemplatesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDataProcessJobTemplatesResponseBodyItems setCaptioning(Boolean captioning) {
            this.captioning = captioning;
            return this;
        }
        public Boolean getCaptioning() {
            return this.captioning;
        }

        public DescribeDataProcessJobTemplatesResponseBodyItems setCaptioningPrompt(String captioningPrompt) {
            this.captioningPrompt = captioningPrompt;
            return this;
        }
        public String getCaptioningPrompt() {
            return this.captioningPrompt;
        }

        public DescribeDataProcessJobTemplatesResponseBodyItems setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDataProcessJobTemplatesResponseBodyItems setEmbedding(Boolean embedding) {
            this.embedding = embedding;
            return this;
        }
        public Boolean getEmbedding() {
            return this.embedding;
        }

        public DescribeDataProcessJobTemplatesResponseBodyItems setEmbeddingDimension(Integer embeddingDimension) {
            this.embeddingDimension = embeddingDimension;
            return this;
        }
        public Integer getEmbeddingDimension() {
            return this.embeddingDimension;
        }

        public DescribeDataProcessJobTemplatesResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDataProcessJobTemplatesResponseBodyItems setTemplateConfig(String templateConfig) {
            this.templateConfig = templateConfig;
            return this;
        }
        public String getTemplateConfig() {
            return this.templateConfig;
        }

        public DescribeDataProcessJobTemplatesResponseBodyItems setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public DescribeDataProcessJobTemplatesResponseBodyItems setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public DescribeDataProcessJobTemplatesResponseBodyItems setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

    }

}
