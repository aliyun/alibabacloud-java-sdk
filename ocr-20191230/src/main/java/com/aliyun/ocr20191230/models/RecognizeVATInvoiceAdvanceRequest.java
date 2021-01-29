// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeVATInvoiceAdvanceRequest extends TeaModel {
    @NameInMap("FileURLObject")
    @Validation(required = true)
    public java.io.InputStream fileURLObject;

    @NameInMap("FileType")
    public String fileType;

    public static RecognizeVATInvoiceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVATInvoiceAdvanceRequest self = new RecognizeVATInvoiceAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeVATInvoiceAdvanceRequest setFileURLObject(java.io.InputStream fileURLObject) {
        this.fileURLObject = fileURLObject;
        return this;
    }
    public java.io.InputStream getFileURLObject() {
        return this.fileURLObject;
    }

    public RecognizeVATInvoiceAdvanceRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

}
