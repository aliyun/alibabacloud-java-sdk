// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeInvoiceRequest extends TeaModel {
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/tfs/TB1qIIfXAPoK1RjSZKbXXX1IXXa-808-523.jpg">https://img.alicdn.com/tfs/TB1qIIfXAPoK1RjSZKbXXX1IXXa-808-523.jpg</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeInvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeInvoiceRequest self = new RecognizeInvoiceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeInvoiceRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public RecognizeInvoiceRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeInvoiceRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
