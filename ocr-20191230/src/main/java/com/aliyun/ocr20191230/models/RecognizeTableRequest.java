// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeTableRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

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

    public static RecognizeTableRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTableRequest self = new RecognizeTableRequest();
        return TeaModel.build(map, self);
    }

}
