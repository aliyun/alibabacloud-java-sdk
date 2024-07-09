// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeResolverAvailableZonesRequest extends TeaModel {
    /**
     * <p>The zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-zhangjiakou-a</p>
     */
    @NameInMap("AzId")
    public String azId;

    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-zhangjiakou</p>
     */
    @NameInMap("ResolverRegionId")
    public String resolverRegionId;

    public static DescribeResolverAvailableZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResolverAvailableZonesRequest self = new DescribeResolverAvailableZonesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResolverAvailableZonesRequest setAzId(String azId) {
        this.azId = azId;
        return this;
    }
    public String getAzId() {
        return this.azId;
    }

    public DescribeResolverAvailableZonesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeResolverAvailableZonesRequest setResolverRegionId(String resolverRegionId) {
        this.resolverRegionId = resolverRegionId;
        return this;
    }
    public String getResolverRegionId() {
        return this.resolverRegionId;
    }

}
