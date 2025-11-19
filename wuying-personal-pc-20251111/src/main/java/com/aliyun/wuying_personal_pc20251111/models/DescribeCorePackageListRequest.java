// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class DescribeCorePackageListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    @NameInMap("QueryDeductionInstances")
    public Boolean queryDeductionInstances;

    @NameInMap("QueryScenario")
    public String queryScenario;

    public static DescribeCorePackageListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCorePackageListRequest self = new DescribeCorePackageListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCorePackageListRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public DescribeCorePackageListRequest setQueryDeductionInstances(Boolean queryDeductionInstances) {
        this.queryDeductionInstances = queryDeductionInstances;
        return this;
    }
    public Boolean getQueryDeductionInstances() {
        return this.queryDeductionInstances;
    }

    public DescribeCorePackageListRequest setQueryScenario(String queryScenario) {
        this.queryScenario = queryScenario;
        return this;
    }
    public String getQueryScenario() {
        return this.queryScenario;
    }

}
