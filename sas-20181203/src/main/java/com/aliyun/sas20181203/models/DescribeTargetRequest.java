// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeTargetRequest extends TeaModel {
    /**
     * <p>The vulnerability type. Valid values:</p>
     * <ul>
     * <li><strong>cms</strong>: Web-CMS vulnerability</li>
     * <li><strong>sys</strong>: Windows system vulnerability</li>
     * <li><strong>cve</strong>: Linux software vulnerability</li>
     * <li><strong>emg</strong>: emergency vulnerability.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;vulType&quot;:&quot;cms&quot;}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The query type. Set this parameter to vul.</p>
     * 
     * <strong>example:</strong>
     * <p>vul</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTargetRequest self = new DescribeTargetRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTargetRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public DescribeTargetRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
