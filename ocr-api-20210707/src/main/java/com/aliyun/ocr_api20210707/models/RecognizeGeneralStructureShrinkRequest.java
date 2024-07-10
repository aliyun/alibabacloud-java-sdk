// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeGeneralStructureShrinkRequest extends TeaModel {
    @NameInMap("Keys")
    public String keysShrink;

    /**
     * <strong>example:</strong>
     * <p><a href="https://example.png">https://example.png</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeGeneralStructureShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeGeneralStructureShrinkRequest self = new RecognizeGeneralStructureShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeGeneralStructureShrinkRequest setKeysShrink(String keysShrink) {
        this.keysShrink = keysShrink;
        return this;
    }
    public String getKeysShrink() {
        return this.keysShrink;
    }

    public RecognizeGeneralStructureShrinkRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeGeneralStructureShrinkRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
