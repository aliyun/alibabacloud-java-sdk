// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GenerateUploadUrlRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>faaf8508-9542-4ac4-84a2-0ddcbb5f79a6 (2).json</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <strong>example:</strong>
     * <p>3b9b5dc6d67ee9fa</p>
     */
    @NameInMap("Key")
    public String key;

    public static GenerateUploadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateUploadUrlRequest self = new GenerateUploadUrlRequest();
        return TeaModel.build(map, self);
    }

    public GenerateUploadUrlRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GenerateUploadUrlRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

}
