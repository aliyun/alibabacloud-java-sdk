// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ExportMaterialFileShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WS20250801154628000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileIds")
    public String fileIdsShrink;

    public static ExportMaterialFileShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportMaterialFileShrinkRequest self = new ExportMaterialFileShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExportMaterialFileShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ExportMaterialFileShrinkRequest setFileIdsShrink(String fileIdsShrink) {
        this.fileIdsShrink = fileIdsShrink;
        return this;
    }
    public String getFileIdsShrink() {
        return this.fileIdsShrink;
    }

}
