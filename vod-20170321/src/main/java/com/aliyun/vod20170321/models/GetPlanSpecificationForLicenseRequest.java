// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetPlanSpecificationForLicenseRequest extends TeaModel {
    @NameInMap("FromApp")
    public String fromApp;

    @NameInMap("NeedItemSpecification")
    public Boolean needItemSpecification;

    @NameInMap("PlanCode")
    public String planCode;

    @NameInMap("PlanId")
    public String planId;

    public static GetPlanSpecificationForLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPlanSpecificationForLicenseRequest self = new GetPlanSpecificationForLicenseRequest();
        return TeaModel.build(map, self);
    }

    public GetPlanSpecificationForLicenseRequest setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public GetPlanSpecificationForLicenseRequest setNeedItemSpecification(Boolean needItemSpecification) {
        this.needItemSpecification = needItemSpecification;
        return this;
    }
    public Boolean getNeedItemSpecification() {
        return this.needItemSpecification;
    }

    public GetPlanSpecificationForLicenseRequest setPlanCode(String planCode) {
        this.planCode = planCode;
        return this;
    }
    public String getPlanCode() {
        return this.planCode;
    }

    public GetPlanSpecificationForLicenseRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

}
