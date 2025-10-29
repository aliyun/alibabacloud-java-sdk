// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class AddPolarFsQuotaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pfs-2ze0i74ka607*****</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>7F2007D3-7E74-4ECB-89A8-BF130D******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddPolarFsQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddPolarFsQuotaResponseBody self = new AddPolarFsQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public AddPolarFsQuotaResponseBody setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public AddPolarFsQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
