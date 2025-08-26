// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeVATInvoiceAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>jpg</p>
     */
    @NameInMap("FileType")
    public String fileType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/ocr/RecognizeVATInvoice/RecognizeVATInvoice3.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/ocr/RecognizeVATInvoice/RecognizeVATInvoice3.jpg</a></p>
     */
    @NameInMap("FileURL")
    public java.io.InputStream fileURLObject;

    public static RecognizeVATInvoiceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVATInvoiceAdvanceRequest self = new RecognizeVATInvoiceAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeVATInvoiceAdvanceRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public RecognizeVATInvoiceAdvanceRequest setFileURLObject(java.io.InputStream fileURLObject) {
        this.fileURLObject = fileURLObject;
        return this;
    }
    public java.io.InputStream getFileURLObject() {
        return this.fileURLObject;
    }

}
