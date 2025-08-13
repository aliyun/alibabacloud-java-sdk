// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModelSampleDownloadRequest extends TeaModel {
    /**
     * <p>Region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegId")
    public String regId;

    public static ModelSampleDownloadRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelSampleDownloadRequest self = new ModelSampleDownloadRequest();
        return TeaModel.build(map, self);
    }

    public ModelSampleDownloadRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
