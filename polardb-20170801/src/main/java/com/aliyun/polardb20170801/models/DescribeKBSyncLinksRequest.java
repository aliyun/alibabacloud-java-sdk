// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeKBSyncLinksRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FEISHU</p>
     */
    @NameInMap("ImPlatform")
    public String imPlatform;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pkb-xxxxx</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeKBSyncLinksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeKBSyncLinksRequest self = new DescribeKBSyncLinksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeKBSyncLinksRequest setImPlatform(String imPlatform) {
        this.imPlatform = imPlatform;
        return this;
    }
    public String getImPlatform() {
        return this.imPlatform;
    }

    public DescribeKBSyncLinksRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public DescribeKBSyncLinksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
