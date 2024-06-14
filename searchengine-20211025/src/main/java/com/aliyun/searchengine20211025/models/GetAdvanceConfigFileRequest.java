// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetAdvanceConfigFileRequest extends TeaModel {
    /**
     * <p>The name of the file</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("fileName")
    public String fileName;

    public static GetAdvanceConfigFileRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAdvanceConfigFileRequest self = new GetAdvanceConfigFileRequest();
        return TeaModel.build(map, self);
    }

    public GetAdvanceConfigFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
