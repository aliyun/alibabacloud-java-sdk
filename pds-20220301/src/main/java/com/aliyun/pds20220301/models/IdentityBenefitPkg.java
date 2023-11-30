// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class IdentityBenefitPkg extends TeaModel {
    @NameInMap("benefit_pkg_id")
    public String benefitPkgId;

    @NameInMap("name")
    public String name;

    public static IdentityBenefitPkg build(java.util.Map<String, ?> map) throws Exception {
        IdentityBenefitPkg self = new IdentityBenefitPkg();
        return TeaModel.build(map, self);
    }

    public IdentityBenefitPkg setBenefitPkgId(String benefitPkgId) {
        this.benefitPkgId = benefitPkgId;
        return this;
    }
    public String getBenefitPkgId() {
        return this.benefitPkgId;
    }

    public IdentityBenefitPkg setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
