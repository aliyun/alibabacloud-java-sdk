// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeEduPaperOcrRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>scan：扫描图， photo：实拍图</p>
     */
    @NameInMap("ImageType")
    public String imageType;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OutputOricoord")
    public Boolean outputOricoord;

    /**
     * <strong>example:</strong>
     * <p>default:默认, Math:数学, PrimarySchool_Math:小学数学, JHighSchool_Math: 初中数学, Chinese:语文, PrimarySchool_Chinese:小学语文, JHighSchool_Chinese:初中语文, English:英语, PrimarySchool_English:小学英语, JHighSchool_English:初中英语, Physics:物理, JHighSchool_Physics:初中物理, Chemistry: 化学, JHighSchool_Chemistry:初中化学, Biology:生物, JHighSchool_Biology:初中生物, History:历史, JHighSchool_History:初中历史, Geography:地理, JHighSchool_Geography:初中地理, Politics:政治, JHighSchool_Politics:初中政治</p>
     */
    @NameInMap("Subject")
    public String subject;

    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/tfs/TB1Wo7eXAvoK1RjSZFDXXXY3pXa-2512-3509.jpg">https://img.alicdn.com/tfs/TB1Wo7eXAvoK1RjSZFDXXXY3pXa-2512-3509.jpg</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeEduPaperOcrRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeEduPaperOcrRequest self = new RecognizeEduPaperOcrRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeEduPaperOcrRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

    public RecognizeEduPaperOcrRequest setOutputOricoord(Boolean outputOricoord) {
        this.outputOricoord = outputOricoord;
        return this;
    }
    public Boolean getOutputOricoord() {
        return this.outputOricoord;
    }

    public RecognizeEduPaperOcrRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public RecognizeEduPaperOcrRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeEduPaperOcrRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
