// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeKnowledgeBaseFilesRequest extends TeaModel {
    /**
     * <p>The list of file IDs, separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>doc_a,doc_b</p>
     */
    @NameInMap("FileIds")
    public String fileIds;

    /**
     * <p>The keyword used to filter file names.</p>
     * 
     * <strong>example:</strong>
     * <p>Financial report</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The unique ID of the knowledge base.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pkb-xxxxx</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <p>The unique ID of the synchronization link.</p>
     * 
     * <strong>example:</strong>
     * <p>pkbl-2ze123456789abc</p>
     */
    @NameInMap("LinkId")
    public String linkId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The source type.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static DescribeKnowledgeBaseFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeKnowledgeBaseFilesRequest self = new DescribeKnowledgeBaseFilesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeKnowledgeBaseFilesRequest setFileIds(String fileIds) {
        this.fileIds = fileIds;
        return this;
    }
    public String getFileIds() {
        return this.fileIds;
    }

    public DescribeKnowledgeBaseFilesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeKnowledgeBaseFilesRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public DescribeKnowledgeBaseFilesRequest setLinkId(String linkId) {
        this.linkId = linkId;
        return this;
    }
    public String getLinkId() {
        return this.linkId;
    }

    public DescribeKnowledgeBaseFilesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeKnowledgeBaseFilesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeKnowledgeBaseFilesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeKnowledgeBaseFilesRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
