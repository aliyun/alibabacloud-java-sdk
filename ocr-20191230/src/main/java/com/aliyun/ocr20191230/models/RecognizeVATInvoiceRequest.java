// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeVATInvoiceRequest extends TeaModel {
    @NameInMap("FileURL")
    @Validation(required = true)
    public String fileURL;

    @NameInMap("FileType")
    @Validation(required = true)
    public String fileType;

    public static RecognizeVATInvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVATInvoiceRequest self = new RecognizeVATInvoiceRequest();
        return TeaModel.build(map, self);
    }

}
