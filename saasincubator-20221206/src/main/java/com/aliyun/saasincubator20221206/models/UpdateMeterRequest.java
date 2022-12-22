// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.saasincubator20221206.models;

import com.aliyun.tea.*;

public class UpdateMeterRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MeterCode")
    public String meterCode;

    @NameInMap("Source")
    public String source;

    @NameInMap("Token")
    public String token;

    public static UpdateMeterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeterRequest self = new UpdateMeterRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMeterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateMeterRequest setMeterCode(String meterCode) {
        this.meterCode = meterCode;
        return this;
    }
    public String getMeterCode() {
        return this.meterCode;
    }

    public UpdateMeterRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public UpdateMeterRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
