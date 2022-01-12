// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class LogOptimizationRequest extends TeaModel {
    @NameInMap("Acid")
    public String acid;

    @NameInMap("Data")
    public String data;

    @NameInMap("PhoneNum")
    public String phoneNum;

    public static LogOptimizationRequest build(java.util.Map<String, ?> map) throws Exception {
        LogOptimizationRequest self = new LogOptimizationRequest();
        return TeaModel.build(map, self);
    }

    public LogOptimizationRequest setAcid(String acid) {
        this.acid = acid;
        return this;
    }
    public String getAcid() {
        return this.acid;
    }

    public LogOptimizationRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public LogOptimizationRequest setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

}
