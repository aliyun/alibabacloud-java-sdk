// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModelFileUploadRequest extends TeaModel {
    /**
     * <p>File name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-07-10/商品信息批量导出-20230710132028</p>
     */
    @NameInMap("ObjectName")
    public String objectName;

    /**
     * <p>Region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegId")
    public String regId;

    public static ModelFileUploadRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelFileUploadRequest self = new ModelFileUploadRequest();
        return TeaModel.build(map, self);
    }

    public ModelFileUploadRequest setObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }
    public String getObjectName() {
        return this.objectName;
    }

    public ModelFileUploadRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
