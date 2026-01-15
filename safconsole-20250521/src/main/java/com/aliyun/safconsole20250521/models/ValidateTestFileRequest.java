// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class ValidateTestFileRequest extends TeaModel {
    /**
     * <p>Model ID.</p>
     * 
     * <strong>example:</strong>
     * <p>456</p>
     */
    @NameInMap("CustomerModuleId")
    public String customerModuleId;

    /**
     * <p>File path.</p>
     * 
     * <strong>example:</strong>
     * <p>saf/xxxxxx/xxxxx.pmml</p>
     */
    @NameInMap("FilePath")
    public String filePath;

    public static ValidateTestFileRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateTestFileRequest self = new ValidateTestFileRequest();
        return TeaModel.build(map, self);
    }

    public ValidateTestFileRequest setCustomerModuleId(String customerModuleId) {
        this.customerModuleId = customerModuleId;
        return this;
    }
    public String getCustomerModuleId() {
        return this.customerModuleId;
    }

    public ValidateTestFileRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

}
