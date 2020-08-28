// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class TrimDocumentRequest extends TeaModel {
    @NameInMap("FileURL")
    @Validation(required = true)
    public String fileURL;

    @NameInMap("FileType")
    @Validation(required = true)
    public String fileType;

    @NameInMap("OutputType")
    @Validation(required = true)
    public String outputType;

    public static TrimDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        TrimDocumentRequest self = new TrimDocumentRequest();
        return TeaModel.build(map, self);
    }

}
