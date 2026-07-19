// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ExportRbacConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>WS20250814102215000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    public static ExportRbacConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportRbacConfigRequest self = new ExportRbacConfigRequest();
        return TeaModel.build(map, self);
    }

    public ExportRbacConfigRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
