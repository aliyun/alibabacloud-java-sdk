// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class CheckDataMaskingInstanceRequest extends TeaModel {
    /**
     * <p>The database instance identity. You can obtain the value from Items[].InstanceId in the response of ListDataMaskingInstances.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze1abcdefgh****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the response description. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The cloud service code. Column encryption supports RDS, POLARDB, and PolarDBX2. If ProductId is also specified, the two parameters must match.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The cloud service type identifier. Valid values:</p>
     * <ul>
     * <li>5: RDS</li>
     * <li>8: POLARDB</li>
     * <li>27: PolarDBX2
     * If this parameter is specified together with ProductCode, the values must match.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProductId")
    public Long productId;

    public static CheckDataMaskingInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckDataMaskingInstanceRequest self = new CheckDataMaskingInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CheckDataMaskingInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CheckDataMaskingInstanceRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CheckDataMaskingInstanceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CheckDataMaskingInstanceRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

}
