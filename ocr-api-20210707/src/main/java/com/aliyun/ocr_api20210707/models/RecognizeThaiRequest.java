// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeThaiRequest extends TeaModel {
    // 是否需要自动旋转功能(结构化检测、混贴场景、教育相关场景会自动做旋转，无需设置)，返回角度信息
    @NameInMap("NeedRotate")
    public Boolean needRotate;

    // 是否输出单字识别结果
    @NameInMap("OutputCharInfo")
    public Boolean outputCharInfo;

    // 是否输出表格识别结果，包含单元格信息
    @NameInMap("OutputTable")
    public Boolean outputTable;

    // 图片链接（长度不超 1014，不支持 base64）
    @NameInMap("Url")
    public String url;

    public static RecognizeThaiRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeThaiRequest self = new RecognizeThaiRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeThaiRequest setNeedRotate(Boolean needRotate) {
        this.needRotate = needRotate;
        return this;
    }
    public Boolean getNeedRotate() {
        return this.needRotate;
    }

    public RecognizeThaiRequest setOutputCharInfo(Boolean outputCharInfo) {
        this.outputCharInfo = outputCharInfo;
        return this;
    }
    public Boolean getOutputCharInfo() {
        return this.outputCharInfo;
    }

    public RecognizeThaiRequest setOutputTable(Boolean outputTable) {
        this.outputTable = outputTable;
        return this;
    }
    public Boolean getOutputTable() {
        return this.outputTable;
    }

    public RecognizeThaiRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
