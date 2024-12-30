// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class SmartqAuthTransferRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ASDHASD*************12EASDA</p>
     */
    @NameInMap("OriginUserId")
    public String originUserId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12313***<em><strong><strong>dasfa,ASDASF</strong></strong></em>SDAFEEG</p>
     */
    @NameInMap("TargetUserIds")
    public String targetUserIds;

    public static SmartqAuthTransferRequest build(java.util.Map<String, ?> map) throws Exception {
        SmartqAuthTransferRequest self = new SmartqAuthTransferRequest();
        return TeaModel.build(map, self);
    }

    public SmartqAuthTransferRequest setOriginUserId(String originUserId) {
        this.originUserId = originUserId;
        return this;
    }
    public String getOriginUserId() {
        return this.originUserId;
    }

    public SmartqAuthTransferRequest setTargetUserIds(String targetUserIds) {
        this.targetUserIds = targetUserIds;
        return this;
    }
    public String getTargetUserIds() {
        return this.targetUserIds;
    }

}
