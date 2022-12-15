// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_oxs_cross20200701.models;

import com.aliyun.tea.*;

public class UserQpsDetail extends TeaModel {
    @NameInMap("ApiName")
    public String apiName;

    @NameInMap("Day")
    public String day;

    @NameInMap("Qps")
    public Integer qps;

    @NameInMap("QpsRule")
    public String qpsRule;

    @NameInMap("Status")
    public Integer status;

    public static UserQpsDetail build(java.util.Map<String, ?> map) throws Exception {
        UserQpsDetail self = new UserQpsDetail();
        return TeaModel.build(map, self);
    }

    public UserQpsDetail setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public UserQpsDetail setDay(String day) {
        this.day = day;
        return this;
    }
    public String getDay() {
        return this.day;
    }

    public UserQpsDetail setQps(Integer qps) {
        this.qps = qps;
        return this;
    }
    public Integer getQps() {
        return this.qps;
    }

    public UserQpsDetail setQpsRule(String qpsRule) {
        this.qpsRule = qpsRule;
        return this;
    }
    public String getQpsRule() {
        return this.qpsRule;
    }

    public UserQpsDetail setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
