// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteCustomizedDictRequest extends TeaModel {
    /**
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>123.103.9.***</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DeleteCustomizedDictRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomizedDictRequest self = new DeleteCustomizedDictRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomizedDictRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
