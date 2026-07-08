// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeComfyUserDataDownloadUrlRequest extends TeaModel {
    /**
     * <p>The name of the file to download.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>myfile</p>
     */
    @NameInMap("FileName")
    public String fileName;

    public static DescribeComfyUserDataDownloadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeComfyUserDataDownloadUrlRequest self = new DescribeComfyUserDataDownloadUrlRequest();
        return TeaModel.build(map, self);
    }

    public DescribeComfyUserDataDownloadUrlRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
