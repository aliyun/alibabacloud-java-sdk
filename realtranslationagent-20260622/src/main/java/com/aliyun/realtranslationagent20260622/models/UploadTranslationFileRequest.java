// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class UploadTranslationFileRequest extends TeaModel {
    @NameInMap("APIKey")
    public String APIKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("File")
    public String file;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileName")
    public String fileName;

    public static UploadTranslationFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadTranslationFileRequest self = new UploadTranslationFileRequest();
        return TeaModel.build(map, self);
    }

    public UploadTranslationFileRequest setAPIKey(String APIKey) {
        this.APIKey = APIKey;
        return this;
    }
    public String getAPIKey() {
        return this.APIKey;
    }

    public UploadTranslationFileRequest setFile(String file) {
        this.file = file;
        return this;
    }
    public String getFile() {
        return this.file;
    }

    public UploadTranslationFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
