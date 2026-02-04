// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class DeleteAppDomainRedirectRequest extends TeaModel {
    /**
     * <p>Business ID of the application instance</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>ID of the domain redirect record</p>
     * 
     * <strong>example:</strong>
     * <p>803858889404426240</p>
     */
    @NameInMap("RecordId")
    public Long recordId;

    public static DeleteAppDomainRedirectRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppDomainRedirectRequest self = new DeleteAppDomainRedirectRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppDomainRedirectRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DeleteAppDomainRedirectRequest setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

}
