// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeVATInvoiceAdvanceRequest extends TeaModel {
    @NameInMap("FileURLObject")
    @Validation(required = true)
    public java.io.InputStream fileURLObject;

    @NameInMap("FileType")
    @Validation(required = true)
    public String fileType;

    public static RecognizeVATInvoiceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVATInvoiceAdvanceRequest self = new RecognizeVATInvoiceAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
