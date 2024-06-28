// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVbrHaResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the VBR failover group.</p>
     * 
     * <strong>example:</strong>
     * <p>vbrha-sa1sxheuxtd98****</p>
     */
    @NameInMap("VbrHaId")
    public String vbrHaId;

    public static CreateVbrHaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVbrHaResponseBody self = new CreateVbrHaResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVbrHaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVbrHaResponseBody setVbrHaId(String vbrHaId) {
        this.vbrHaId = vbrHaId;
        return this;
    }
    public String getVbrHaId() {
        return this.vbrHaId;
    }

}
