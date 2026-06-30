// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class UploadTranslationFileAdvanceRequest extends TeaModel {
    @NameInMap("APIKey")
    public String APIKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("File")
    public java.io.InputStream fileObject;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileName")
    public String fileName;

    public static UploadTranslationFileAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadTranslationFileAdvanceRequest self = new UploadTranslationFileAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public UploadTranslationFileAdvanceRequest setAPIKey(String APIKey) {
        this.APIKey = APIKey;
        return this;
    }
    public String getAPIKey() {
        return this.APIKey;
    }

    public UploadTranslationFileAdvanceRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public UploadTranslationFileAdvanceRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
