// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetLocalDefaultRegionRequest extends TeaModel {
    /**
     * <p>The cloud service provider. Valid values:</p>
     * <ul>
     * <li><strong>Tencent</strong>: Tencent Cloud.</li>
     * <li><strong>HUAWEICLOUD</strong>: Huawei Cloud.</li>
     * <li><strong>Azure</strong>: Microsoft Azure.</li>
     * <li><strong>AWS</strong>: Amazon Web Services (AWS).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Tencent</p>
     */
    @NameInMap("Vendor")
    public String vendor;

    public static GetLocalDefaultRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLocalDefaultRegionRequest self = new GetLocalDefaultRegionRequest();
        return TeaModel.build(map, self);
    }

    public GetLocalDefaultRegionRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
