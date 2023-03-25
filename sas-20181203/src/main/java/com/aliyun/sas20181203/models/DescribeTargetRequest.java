// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeTargetRequest extends TeaModel {
    /**
     * <p>The type of the vulnerability. Valid values:</p>
     * <br>
     * <p>*   **cms**: Web CMS vulnerability</p>
     * <p>*   **sys**: Windows system vulnerability</p>
     * <p>*   **cve**: Linux software vulnerability</p>
     * <p>*   **emg**: urgent vulnerability</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The type of the query. Set the value to vul.</p>
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
