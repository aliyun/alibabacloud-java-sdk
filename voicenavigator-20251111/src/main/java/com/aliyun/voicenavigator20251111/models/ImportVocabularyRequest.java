// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ImportVocabularyRequest extends TeaModel {
    /**
     * <p>The path to the uploaded file.</p>
     * 
     * <strong>example:</strong>
     * <p>vocabulary/热词导入单元测试.zip</p>
     */
    @NameInMap("FileKey")
    public String fileKey;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ImportVocabularyRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportVocabularyRequest self = new ImportVocabularyRequest();
        return TeaModel.build(map, self);
    }

    public ImportVocabularyRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public ImportVocabularyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
