// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeEduFormulaRequest extends TeaModel {
    // 图片链接（不支持 base64）,图片最大尺寸 1024*1024
    @NameInMap("Url")
    public String url;

    public static RecognizeEduFormulaRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeEduFormulaRequest self = new RecognizeEduFormulaRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeEduFormulaRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
