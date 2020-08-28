// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeChinapassportRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static RecognizeChinapassportRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeChinapassportRequest self = new RecognizeChinapassportRequest();
        return TeaModel.build(map, self);
    }

}
