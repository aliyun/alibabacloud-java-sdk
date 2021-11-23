// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeTableAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("AssureDirection")
    public Boolean assureDirection;

    @NameInMap("HasLine")
    public Boolean hasLine;

    @NameInMap("OutputFormat")
    public String outputFormat;

    @NameInMap("SkipDetection")
    public Boolean skipDetection;

    @NameInMap("UseFinanceModel")
    public Boolean useFinanceModel;

    public static RecognizeTableAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTableAdvanceRequest self = new RecognizeTableAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeTableAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public RecognizeTableAdvanceRequest setAssureDirection(Boolean assureDirection) {
        this.assureDirection = assureDirection;
        return this;
    }
    public Boolean getAssureDirection() {
        return this.assureDirection;
    }

    public RecognizeTableAdvanceRequest setHasLine(Boolean hasLine) {
        this.hasLine = hasLine;
        return this;
    }
    public Boolean getHasLine() {
        return this.hasLine;
    }

    public RecognizeTableAdvanceRequest setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }

    public RecognizeTableAdvanceRequest setSkipDetection(Boolean skipDetection) {
        this.skipDetection = skipDetection;
        return this;
    }
    public Boolean getSkipDetection() {
        return this.skipDetection;
    }

    public RecognizeTableAdvanceRequest setUseFinanceModel(Boolean useFinanceModel) {
        this.useFinanceModel = useFinanceModel;
        return this;
    }
    public Boolean getUseFinanceModel() {
        return this.useFinanceModel;
    }

}
