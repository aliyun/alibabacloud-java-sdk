// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RegisterKnowledgeBaseFileRequest extends TeaModel {
    /**
     * <p>The OSS object key of the uploaded file, excluding the oss://BucketName/ prefix.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pks-2ze123456789abcd/pkb-2ze123456789abcd/example.pdf</p>
     */
    @NameInMap("FilePath")
    public String filePath;

    /**
     * <p>The knowledge base ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pkb-2ze123456789abcd</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <p>The ID of the region where the knowledge base resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static RegisterKnowledgeBaseFileRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterKnowledgeBaseFileRequest self = new RegisterKnowledgeBaseFileRequest();
        return TeaModel.build(map, self);
    }

    public RegisterKnowledgeBaseFileRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public RegisterKnowledgeBaseFileRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public RegisterKnowledgeBaseFileRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
