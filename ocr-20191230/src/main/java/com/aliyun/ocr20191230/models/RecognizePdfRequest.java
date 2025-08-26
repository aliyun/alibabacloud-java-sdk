// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizePdfRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://viapi-test.oss-cn-shanghai.aliyuncs.com/ocr/xxxx.pdf">https://viapi-test.oss-cn-shanghai.aliyuncs.com/ocr/xxxx.pdf</a></p>
     */
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
