// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinklogIndicationRequest extends TeaModel {
    @NameInMap("IndicationId")
    public String indicationId;

    public static DeleteLinkeLinklogIndicationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinklogIndicationRequest self = new DeleteLinkeLinklogIndicationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinklogIndicationRequest setIndicationId(String indicationId) {
        this.indicationId = indicationId;
        return this;
    }
    public String getIndicationId() {
        return this.indicationId;
    }

}
