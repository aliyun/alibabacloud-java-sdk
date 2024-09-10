// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeIdcAssetCriteriaRequest extends TeaModel {
    /**
     * <p>The status of the IP address. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: The IP address is valid.</li>
     * <li><strong>1</strong>: The IP address is ignored.</li>
     * <li><em>2</em>: The IP address is invalid.</li>
     * <li><em>3</em>: The IP address is expired.</li>
     * <li><em>4</em>: The probe that is used to scan the IP address does not exist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The keyword that is used to match assets in fuzzy mode.</p>
     * 
     * <strong>example:</strong>
     * <p>testwww</p>
     */
    @NameInMap("Value")
    public String value;

    public static DescribeIdcAssetCriteriaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIdcAssetCriteriaRequest self = new DescribeIdcAssetCriteriaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIdcAssetCriteriaRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public DescribeIdcAssetCriteriaRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
