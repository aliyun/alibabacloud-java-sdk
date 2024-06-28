// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DiagnoseVpnGatewayResponseBody extends TeaModel {
    /**
     * <p>The ID of the diagnostic.</p>
     * 
     * <strong>example:</strong>
     * <p>vpndgn-uf6kuxbe3iv028k3s****</p>
     */
    @NameInMap("DiagnoseId")
    public String diagnoseId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DiagnoseVpnGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DiagnoseVpnGatewayResponseBody self = new DiagnoseVpnGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public DiagnoseVpnGatewayResponseBody setDiagnoseId(String diagnoseId) {
        this.diagnoseId = diagnoseId;
        return this;
    }
    public String getDiagnoseId() {
        return this.diagnoseId;
    }

    public DiagnoseVpnGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
