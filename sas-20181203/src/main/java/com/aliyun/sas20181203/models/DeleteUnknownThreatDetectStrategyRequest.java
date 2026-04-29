// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteUnknownThreatDetectStrategyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("IdList")
    public java.util.List<Long> idList;

    public static DeleteUnknownThreatDetectStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUnknownThreatDetectStrategyRequest self = new DeleteUnknownThreatDetectStrategyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUnknownThreatDetectStrategyRequest setIdList(java.util.List<Long> idList) {
        this.idList = idList;
        return this;
    }
    public java.util.List<Long> getIdList() {
        return this.idList;
    }

}
