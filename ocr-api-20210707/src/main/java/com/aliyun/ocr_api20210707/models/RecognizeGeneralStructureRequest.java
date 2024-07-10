// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeGeneralStructureRequest extends TeaModel {
    @NameInMap("Keys")
    public java.util.List<String> keys;

    /**
     * <strong>example:</strong>
     * <p><a href="https://example.png">https://example.png</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeGeneralStructureRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeGeneralStructureRequest self = new RecognizeGeneralStructureRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeGeneralStructureRequest setKeys(java.util.List<String> keys) {
        this.keys = keys;
        return this;
    }
    public java.util.List<String> getKeys() {
        return this.keys;
    }

    public RecognizeGeneralStructureRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeGeneralStructureRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
