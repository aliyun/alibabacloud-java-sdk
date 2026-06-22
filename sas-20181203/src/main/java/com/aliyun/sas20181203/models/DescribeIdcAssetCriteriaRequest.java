// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeIdcAssetCriteriaRequest extends TeaModel {
    /**
     * <p>Indicates whether the corresponding IP address is valid. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: valid</li>
     * <li><strong>1</strong>: ignored</li>
     * <li><strong>2</strong>: invalid</li>
     * <li><strong>3</strong>: expired</li>
     * <li><strong>4</strong>: probe does not exist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The fuzzy match value entered when querying assets.</p>
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
