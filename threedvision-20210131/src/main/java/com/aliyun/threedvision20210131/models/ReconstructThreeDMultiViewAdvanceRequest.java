// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.threedvision20210131.models;

import com.aliyun.tea.*;

public class ReconstructThreeDMultiViewAdvanceRequest extends TeaModel {
    @NameInMap("ZipFileUrlObject")
    @Validation(required = true)
    public java.io.InputStream zipFileUrlObject;

    @NameInMap("Mode")
    public String mode;

    public static ReconstructThreeDMultiViewAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReconstructThreeDMultiViewAdvanceRequest self = new ReconstructThreeDMultiViewAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ReconstructThreeDMultiViewAdvanceRequest setZipFileUrlObject(java.io.InputStream zipFileUrlObject) {
        this.zipFileUrlObject = zipFileUrlObject;
        return this;
    }
    public java.io.InputStream getZipFileUrlObject() {
        return this.zipFileUrlObject;
    }

    public ReconstructThreeDMultiViewAdvanceRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

}
