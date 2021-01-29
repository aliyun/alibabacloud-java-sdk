// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeTableRequest extends TeaModel {
    @NameInMap("ImageType")
    public Integer imageType;

    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("OutputFormat")
    public String outputFormat;

    @NameInMap("UseFinanceModel")
    public Boolean useFinanceModel;

    @NameInMap("AssureDirection")
    public Boolean assureDirection;

    @NameInMap("HasLine")
    public Boolean hasLine;

    @NameInMap("SkipDetection")
    public Boolean skipDetection;

    public static RecognizeTableRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTableRequest self = new RecognizeTableRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeTableRequest setImageType(Integer imageType) {
        this.imageType = imageType;
        return this;
    }
    public Integer getImageType() {
        return this.imageType;
    }

    public RecognizeTableRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public RecognizeTableRequest setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }

    public RecognizeTableRequest setUseFinanceModel(Boolean useFinanceModel) {
        this.useFinanceModel = useFinanceModel;
        return this;
    }
    public Boolean getUseFinanceModel() {
        return this.useFinanceModel;
    }

    public RecognizeTableRequest setAssureDirection(Boolean assureDirection) {
        this.assureDirection = assureDirection;
        return this;
    }
    public Boolean getAssureDirection() {
        return this.assureDirection;
    }

    public RecognizeTableRequest setHasLine(Boolean hasLine) {
        this.hasLine = hasLine;
        return this;
    }
    public Boolean getHasLine() {
        return this.hasLine;
    }

    public RecognizeTableRequest setSkipDetection(Boolean skipDetection) {
        this.skipDetection = skipDetection;
        return this;
    }
    public Boolean getSkipDetection() {
        return this.skipDetection;
    }

}
