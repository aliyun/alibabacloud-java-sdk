// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeIdcardRequest extends TeaModel {
    // 是否需要图案检测功能，默认不需要
    @NameInMap("OutputFigure")
    public Boolean outputFigure;

    // 图片链接（长度不超 2048，不支持 base64）
    @NameInMap("Url")
    public String url;

    @NameInMap("WorkflowOp")
    public String workflowOp;

    // 图片二进制字节流，最大10MB
    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeIdcardRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeIdcardRequest self = new RecognizeIdcardRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeIdcardRequest setOutputFigure(Boolean outputFigure) {
        this.outputFigure = outputFigure;
        return this;
    }
    public Boolean getOutputFigure() {
        return this.outputFigure;
    }

    public RecognizeIdcardRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeIdcardRequest setWorkflowOp(String workflowOp) {
        this.workflowOp = workflowOp;
        return this;
    }
    public String getWorkflowOp() {
        return this.workflowOp;
    }

    public RecognizeIdcardRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
