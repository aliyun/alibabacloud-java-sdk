// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeExcelExportRequest extends TeaModel {
    // 文件名称
    @NameInMap("FileName")
    public String fileName;

    // 图片识别op类型
    @NameInMap("ImageOp")
    public String imageOp;

    // 识别图片数量
    @NameInMap("OcrImageCount")
    public Long ocrImageCount;

    // 图片识别结果集
    @NameInMap("OcrResult")
    public String ocrResult;

    // 票证类型
    @NameInMap("OcrType")
    public String ocrType;

    public static RecognizeExcelExportRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeExcelExportRequest self = new RecognizeExcelExportRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeExcelExportRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public RecognizeExcelExportRequest setImageOp(String imageOp) {
        this.imageOp = imageOp;
        return this;
    }
    public String getImageOp() {
        return this.imageOp;
    }

    public RecognizeExcelExportRequest setOcrImageCount(Long ocrImageCount) {
        this.ocrImageCount = ocrImageCount;
        return this;
    }
    public Long getOcrImageCount() {
        return this.ocrImageCount;
    }

    public RecognizeExcelExportRequest setOcrResult(String ocrResult) {
        this.ocrResult = ocrResult;
        return this;
    }
    public String getOcrResult() {
        return this.ocrResult;
    }

    public RecognizeExcelExportRequest setOcrType(String ocrType) {
        this.ocrType = ocrType;
        return this;
    }
    public String getOcrType() {
        return this.ocrType;
    }

}
