// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.threedvision20210131.models;

import com.aliyun.tea.*;

public class ReconstructThreeDMultiViewRequest extends TeaModel {
    @NameInMap("Mode")
    public String mode;

    @NameInMap("ZipFileUrl")
    public String zipFileUrl;

    public static ReconstructThreeDMultiViewRequest build(java.util.Map<String, ?> map) throws Exception {
        ReconstructThreeDMultiViewRequest self = new ReconstructThreeDMultiViewRequest();
        return TeaModel.build(map, self);
    }

    public ReconstructThreeDMultiViewRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ReconstructThreeDMultiViewRequest setZipFileUrl(String zipFileUrl) {
        this.zipFileUrl = zipFileUrl;
        return this;
    }
    public String getZipFileUrl() {
        return this.zipFileUrl;
    }

}
