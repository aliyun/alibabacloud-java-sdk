// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeHouseholdRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsResidentPage")
    public Boolean isResidentPage;

    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/tfs/TB11ZxTMxD1gK0jSZFsXXbldVXa-920-606.png">https://img.alicdn.com/tfs/TB11ZxTMxD1gK0jSZFsXXbldVXa-920-606.png</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeHouseholdRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeHouseholdRequest self = new RecognizeHouseholdRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeHouseholdRequest setIsResidentPage(Boolean isResidentPage) {
        this.isResidentPage = isResidentPage;
        return this;
    }
    public Boolean getIsResidentPage() {
        return this.isResidentPage;
    }

    public RecognizeHouseholdRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeHouseholdRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
