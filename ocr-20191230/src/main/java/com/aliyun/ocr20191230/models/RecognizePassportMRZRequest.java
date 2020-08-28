// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizePassportMRZRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static RecognizePassportMRZRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizePassportMRZRequest self = new RecognizePassportMRZRequest();
        return TeaModel.build(map, self);
    }

}
