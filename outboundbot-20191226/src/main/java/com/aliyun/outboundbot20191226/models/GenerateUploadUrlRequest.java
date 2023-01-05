// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GenerateUploadUrlRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

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
