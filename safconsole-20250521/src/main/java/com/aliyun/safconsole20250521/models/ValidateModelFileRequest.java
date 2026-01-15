// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class ValidateModelFileRequest extends TeaModel {
    /**
     * <p>File path.</p>
     * 
     * <strong>example:</strong>
     * <p>saf/xxxxxxx/xxx.pmml</p>
     */
    @NameInMap("FilePath")
    public String filePath;

    public static ValidateModelFileRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateModelFileRequest self = new ValidateModelFileRequest();
        return TeaModel.build(map, self);
    }

    public ValidateModelFileRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

}
