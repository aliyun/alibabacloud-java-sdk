// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryDTXBizTypeRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("StatemachineId")
    public String statemachineId;

    public static QueryDTXBizTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDTXBizTypeRequest self = new QueryDTXBizTypeRequest();
        return TeaModel.build(map, self);
    }

    public QueryDTXBizTypeRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryDTXBizTypeRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QueryDTXBizTypeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryDTXBizTypeRequest setStatemachineId(String statemachineId) {
        this.statemachineId = statemachineId;
        return this;
    }
    public String getStatemachineId() {
        return this.statemachineId;
    }

}
