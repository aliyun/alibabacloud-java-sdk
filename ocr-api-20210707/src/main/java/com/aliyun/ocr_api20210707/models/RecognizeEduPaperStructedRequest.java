// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeEduPaperStructedRequest extends TeaModel {
    // 是否需要自动旋转功能(结构化检测、混贴场景、教育相关场景会自动做旋转，无需设置)，返回角度信息
    @NameInMap("NeedRotate")
    public Boolean needRotate;

    // 图片链接（长度不超 1014，不支持 base64）
    @NameInMap("Url")
    public String url;

    public static RecognizeEduPaperStructedRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeEduPaperStructedRequest self = new RecognizeEduPaperStructedRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeEduPaperStructedRequest setNeedRotate(Boolean needRotate) {
        this.needRotate = needRotate;
        return this;
    }
    public Boolean getNeedRotate() {
        return this.needRotate;
    }

    public RecognizeEduPaperStructedRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
