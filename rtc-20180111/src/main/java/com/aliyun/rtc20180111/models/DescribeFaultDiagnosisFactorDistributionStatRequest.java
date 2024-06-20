// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeFaultDiagnosisFactorDistributionStatRequest extends TeaModel {
    /**
     * <p>APP ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0rbd****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1615892596****</p>
     */
    @NameInMap("EndTs")
    public Long endTs;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1615892596</p>
     */
    @NameInMap("StartTs")
    public Long startTs;

    public static DescribeFaultDiagnosisFactorDistributionStatRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaultDiagnosisFactorDistributionStatRequest self = new DescribeFaultDiagnosisFactorDistributionStatRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFaultDiagnosisFactorDistributionStatRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeFaultDiagnosisFactorDistributionStatRequest setEndTs(Long endTs) {
        this.endTs = endTs;
        return this;
    }
    public Long getEndTs() {
        return this.endTs;
    }

    public DescribeFaultDiagnosisFactorDistributionStatRequest setStartTs(Long startTs) {
        this.startTs = startTs;
        return this;
    }
    public Long getStartTs() {
        return this.startTs;
    }

}
