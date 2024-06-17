// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetFileRequest extends TeaModel {
    /**
     * <p>The name of the file in full path</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/schemas/automobile_vector_schema.json</p>
     */
    @NameInMap("fileName")
    public String fileName;

    public static GetFileRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFileRequest self = new GetFileRequest();
        return TeaModel.build(map, self);
    }

    public GetFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
