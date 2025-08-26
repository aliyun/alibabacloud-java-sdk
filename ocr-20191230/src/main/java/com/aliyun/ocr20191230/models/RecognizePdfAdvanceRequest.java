// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizePdfAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://viapi-test.oss-cn-shanghai.aliyuncs.com/ocr/xxxx.pdf">https://viapi-test.oss-cn-shanghai.aliyuncs.com/ocr/xxxx.pdf</a></p>
     */
    @NameInMap("FileURL")
    public java.io.InputStream fileURLObject;

    public static RecognizePdfAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizePdfAdvanceRequest self = new RecognizePdfAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizePdfAdvanceRequest setFileURLObject(java.io.InputStream fileURLObject) {
        this.fileURLObject = fileURLObject;
        return this;
    }
    public java.io.InputStream getFileURLObject() {
        return this.fileURLObject;
    }

}
