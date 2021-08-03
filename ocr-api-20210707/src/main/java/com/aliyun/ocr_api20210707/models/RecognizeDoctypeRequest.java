// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeDoctypeRequest extends TeaModel {
    // 图片链接（长度不超 1014，不支持 base64）
    @NameInMap("Url")
    public String url;

    public static RecognizeDoctypeRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeDoctypeRequest self = new RecognizeDoctypeRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeDoctypeRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
