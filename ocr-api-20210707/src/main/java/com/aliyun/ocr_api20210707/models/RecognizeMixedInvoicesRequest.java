// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeMixedInvoicesRequest extends TeaModel {
    @NameInMap("MergePdfPages")
    public Boolean mergePdfPages;

    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/tfs/TB1.bnGbRWD3KVjSZFsXXcqkpXa-1654-2341.jpg">https://img.alicdn.com/tfs/TB1.bnGbRWD3KVjSZFsXXcqkpXa-1654-2341.jpg</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeMixedInvoicesRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeMixedInvoicesRequest self = new RecognizeMixedInvoicesRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeMixedInvoicesRequest setMergePdfPages(Boolean mergePdfPages) {
        this.mergePdfPages = mergePdfPages;
        return this;
    }
    public Boolean getMergePdfPages() {
        return this.mergePdfPages;
    }

    public RecognizeMixedInvoicesRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public RecognizeMixedInvoicesRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeMixedInvoicesRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
