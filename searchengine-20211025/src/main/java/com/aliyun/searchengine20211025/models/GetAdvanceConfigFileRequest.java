// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetAdvanceConfigFileRequest extends TeaModel {
    /**
     * <p>The name of the file</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/intervene_dict/chn_ecommerce_general.dict</p>
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
