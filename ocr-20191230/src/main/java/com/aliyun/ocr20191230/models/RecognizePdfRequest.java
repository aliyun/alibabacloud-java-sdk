// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizePdfRequest extends TeaModel {
    // A short description of struct
    @NameInMap("FileURL")
    public String fileURL;

    public static RecognizePdfRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizePdfRequest self = new RecognizePdfRequest();
        return TeaModel.build(map, self);
    }

    public RecognizePdfRequest setFileURL(String fileURL) {
        this.fileURL = fileURL;
        return this;
    }
    public String getFileURL() {
        return this.fileURL;
    }

}
