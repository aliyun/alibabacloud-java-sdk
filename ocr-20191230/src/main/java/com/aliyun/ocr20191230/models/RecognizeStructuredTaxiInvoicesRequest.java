// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeStructuredTaxiInvoicesRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    public static RecognizeStructuredTaxiInvoicesRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeStructuredTaxiInvoicesRequest self = new RecognizeStructuredTaxiInvoicesRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeStructuredTaxiInvoicesRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
