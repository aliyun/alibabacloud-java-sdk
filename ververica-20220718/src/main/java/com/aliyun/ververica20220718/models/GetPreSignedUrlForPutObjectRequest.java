// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetPreSignedUrlForPutObjectRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.txt</p>
     */
    @NameInMap("fileName")
    public String fileName;

    public static GetPreSignedUrlForPutObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPreSignedUrlForPutObjectRequest self = new GetPreSignedUrlForPutObjectRequest();
        return TeaModel.build(map, self);
    }

    public GetPreSignedUrlForPutObjectRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
