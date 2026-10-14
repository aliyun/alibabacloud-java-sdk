// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeKBSyncLinkAttributeRequest extends TeaModel {
    /**
     * <p>The unique identifier of the knowledge base.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kb-123456</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <p>The unique identifier of the synchronization link.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pkbl-123456</p>
     */
    @NameInMap("LinkId")
    public String linkId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeKBSyncLinkAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeKBSyncLinkAttributeRequest self = new DescribeKBSyncLinkAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeKBSyncLinkAttributeRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public DescribeKBSyncLinkAttributeRequest setLinkId(String linkId) {
        this.linkId = linkId;
        return this;
    }
    public String getLinkId() {
        return this.linkId;
    }

    public DescribeKBSyncLinkAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
