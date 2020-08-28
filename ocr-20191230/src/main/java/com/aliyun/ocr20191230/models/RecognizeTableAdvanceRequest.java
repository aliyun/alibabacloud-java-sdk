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

}
