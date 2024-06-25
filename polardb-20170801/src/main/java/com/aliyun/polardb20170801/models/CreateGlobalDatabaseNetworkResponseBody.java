// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateGlobalDatabaseNetworkResponseBody extends TeaModel {
    /**
     * <p>The ID of the GDN.</p>
     * 
     * <strong>example:</strong>
     * <p>gd-m5ex5wqfqbou*****</p>
     */
    @NameInMap("GDNId")
    public String GDNId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C61892A4-0850-4516-9E26-44D96C1782DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateGlobalDatabaseNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGlobalDatabaseNetworkResponseBody self = new CreateGlobalDatabaseNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGlobalDatabaseNetworkResponseBody setGDNId(String GDNId) {
        this.GDNId = GDNId;
        return this;
    }
    public String getGDNId() {
        return this.GDNId;
    }

    public CreateGlobalDatabaseNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
