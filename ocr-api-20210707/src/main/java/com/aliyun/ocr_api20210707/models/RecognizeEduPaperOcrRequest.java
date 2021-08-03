// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeEduPaperOcrRequest extends TeaModel {
    // 图片链接（长度不超 1014，不支持 base64）
    @NameInMap("Url")
    public String url;

    // 图片类型
    @NameInMap("ImageType")
    public String imageType;

    // 年级学科
    @NameInMap("Subject")
    public String subject;

    // 是否输出原图坐标信息(如果图片被做过旋转，图片校正等处理)
    @NameInMap("OutputOricoord")
    public Boolean outputOricoord;

    public static RecognizeEduPaperOcrRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeEduPaperOcrRequest self = new RecognizeEduPaperOcrRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeEduPaperOcrRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeEduPaperOcrRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

    public RecognizeEduPaperOcrRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public RecognizeEduPaperOcrRequest setOutputOricoord(Boolean outputOricoord) {
        this.outputOricoord = outputOricoord;
        return this;
    }
    public Boolean getOutputOricoord() {
        return this.outputOricoord;
    }

}
