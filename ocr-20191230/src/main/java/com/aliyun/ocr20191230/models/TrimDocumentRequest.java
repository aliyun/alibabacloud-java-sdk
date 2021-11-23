// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class TrimDocumentRequest extends TeaModel {
    @NameInMap("FileType")
    public String fileType;

    @NameInMap("FileURL")
    public String fileURL;

    @NameInMap("OutputType")
    public String outputType;

    public static TrimDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        TrimDocumentRequest self = new TrimDocumentRequest();
        return TeaModel.build(map, self);
    }

    public TrimDocumentRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public TrimDocumentRequest setFileURL(String fileURL) {
        this.fileURL = fileURL;
        return this;
    }
    public String getFileURL() {
        return this.fileURL;
    }

    public TrimDocumentRequest setOutputType(String outputType) {
        this.outputType = outputType;
        return this;
    }
    public String getOutputType() {
        return this.outputType;
    }

}
