// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeVATInvoiceRequest extends TeaModel {
    @NameInMap("FileType")
    public String fileType;

    @NameInMap("FileURL")
    public String fileURL;

    public static RecognizeVATInvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVATInvoiceRequest self = new RecognizeVATInvoiceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeVATInvoiceRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public RecognizeVATInvoiceRequest setFileURL(String fileURL) {
        this.fileURL = fileURL;
        return this;
    }
    public String getFileURL() {
        return this.fileURL;
    }

}
