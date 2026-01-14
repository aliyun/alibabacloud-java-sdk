// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListWhitePortalMenuRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asdagad***213425</p>
     */
    @NameInMap("DataportalId")
    public String dataportalId;

    public static ListWhitePortalMenuRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWhitePortalMenuRequest self = new ListWhitePortalMenuRequest();
        return TeaModel.build(map, self);
    }

    public ListWhitePortalMenuRequest setDataportalId(String dataportalId) {
        this.dataportalId = dataportalId;
        return this;
    }
    public String getDataportalId() {
        return this.dataportalId;
    }

}
