// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeTableAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("OutputFormat")
    @Validation(required = true)
    public String outputFormat;

    @NameInMap("UseFinanceModel")
    @Validation(required = true)
    public Boolean useFinanceModel;

    @NameInMap("AssureDirection")
    @Validation(required = true)
    public Boolean assureDirection;

    @NameInMap("HasLine")
    @Validation(required = true)
    public Boolean hasLine;

    @NameInMap("SkipDetection")
    @Validation(required = true)
    public Boolean skipDetection;

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

    public RecognizeTableAdvanceRequest setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }

    public RecognizeTableAdvanceRequest setUseFinanceModel(Boolean useFinanceModel) {
        this.useFinanceModel = useFinanceModel;
        return this;
    }
    public Boolean getUseFinanceModel() {
        return this.useFinanceModel;
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

    public RecognizeTableAdvanceRequest setSkipDetection(Boolean skipDetection) {
        this.skipDetection = skipDetection;
        return this;
    }
    public Boolean getSkipDetection() {
        return this.skipDetection;
    }

}
