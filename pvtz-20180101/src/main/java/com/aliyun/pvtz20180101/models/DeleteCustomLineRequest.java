// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DeleteCustomLineRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1045001</p>
     */
    @NameInMap("LineId")
    public String lineId;

    public static DeleteCustomLineRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomLineRequest self = new DeleteCustomLineRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomLineRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteCustomLineRequest setLineId(String lineId) {
        this.lineId = lineId;
        return this;
    }
    public String getLineId() {
        return this.lineId;
    }

}
