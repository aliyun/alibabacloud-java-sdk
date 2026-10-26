// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListMiniEngineVersionsRequest extends TeaModel {
    /**
     * <p>The database instance ID. You can obtain this value from Items[].InstanceId returned by ListDataMaskingInstances.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze1abcdefgh****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the response message. Valid values: zh: Chinese; en: English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The cloud service code. Column encryption supports RDS, POLARDB, and PolarDBX2. If ProductId is also provided, the two parameters must correspond to each other.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The cloud service type identifier. Valid values: 5: RDS; 8: POLARDB; 27: PolarDBX2. If specified together with ProductCode, the values must match.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProductId")
    public Long productId;

    public static ListMiniEngineVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMiniEngineVersionsRequest self = new ListMiniEngineVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListMiniEngineVersionsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListMiniEngineVersionsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListMiniEngineVersionsRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ListMiniEngineVersionsRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

}
