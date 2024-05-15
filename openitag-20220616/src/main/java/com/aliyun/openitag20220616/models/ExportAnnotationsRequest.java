// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class ExportAnnotationsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OssPath")
    public String ossPath;

    @NameInMap("RegisterDataset")
    public String registerDataset;

    @NameInMap("Target")
    public String target;

    public static ExportAnnotationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportAnnotationsRequest self = new ExportAnnotationsRequest();
        return TeaModel.build(map, self);
    }

    public ExportAnnotationsRequest setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

    public ExportAnnotationsRequest setRegisterDataset(String registerDataset) {
        this.registerDataset = registerDataset;
        return this;
    }
    public String getRegisterDataset() {
        return this.registerDataset;
    }

    public ExportAnnotationsRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

}
