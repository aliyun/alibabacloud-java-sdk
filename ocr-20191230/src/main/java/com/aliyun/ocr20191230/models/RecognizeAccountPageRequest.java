// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeAccountPageRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static RecognizeAccountPageRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeAccountPageRequest self = new RecognizeAccountPageRequest();
        return TeaModel.build(map, self);
    }

}
