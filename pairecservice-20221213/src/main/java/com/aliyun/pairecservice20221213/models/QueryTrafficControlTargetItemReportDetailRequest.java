// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class QueryTrafficControlTargetItemReportDetailRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2024-01-01</p>
     */
    @NameInMap("Date")
    public String date;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Pre</p>
     */
    @NameInMap("Environment")
    public String environment;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec_123****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryTrafficControlTargetItemReportDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTrafficControlTargetItemReportDetailRequest self = new QueryTrafficControlTargetItemReportDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryTrafficControlTargetItemReportDetailRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public QueryTrafficControlTargetItemReportDetailRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public QueryTrafficControlTargetItemReportDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
