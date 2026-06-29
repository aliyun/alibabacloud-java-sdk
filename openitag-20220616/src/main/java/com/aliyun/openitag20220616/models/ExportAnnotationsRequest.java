// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class ExportAnnotationsRequest extends TeaModel {
    /**
     * <p>OSS path.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://***-hz-oss.oss-cn-hangzhou.aliyuncs.com/output/</p>
     */
    @NameInMap("OssPath")
    public String ossPath;

    /**
     * <p>Specifies whether to register the result as a PAI dataset. Valid values:</p>
     * <ul>
     * <li>true: Registers the annotation result as a PAI dataset.</li>
     * <li>false: Exports the annotation result directly to an OSS folder without registering it as a dataset.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RegisterDataset")
    public String registerDataset;

    /**
     * <p>Target.</p>
     * 
     * <strong>example:</strong>
     * <p>PAI</p>
     */
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
