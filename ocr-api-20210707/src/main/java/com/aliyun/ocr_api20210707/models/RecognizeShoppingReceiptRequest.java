// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeShoppingReceiptRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="http://duguang-database-public.oss-cn-hangzhou.aliyuncs.com/multi_receipt_shopping_receipt/shop_receipt__ticket_2020-05-14-11-59-30.540668_01_List.jpg">http://duguang-database-public.oss-cn-hangzhou.aliyuncs.com/multi_receipt_shopping_receipt/shop_receipt__ticket_2020-05-14-11-59-30.540668_01_List.jpg</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeShoppingReceiptRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeShoppingReceiptRequest self = new RecognizeShoppingReceiptRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeShoppingReceiptRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeShoppingReceiptRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
