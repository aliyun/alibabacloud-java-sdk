// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryJenkinsImageRegistryPersistenceDayRequest extends TeaModel {
    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>113.83.XXX.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static QueryJenkinsImageRegistryPersistenceDayRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryJenkinsImageRegistryPersistenceDayRequest self = new QueryJenkinsImageRegistryPersistenceDayRequest();
        return TeaModel.build(map, self);
    }

    public QueryJenkinsImageRegistryPersistenceDayRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
