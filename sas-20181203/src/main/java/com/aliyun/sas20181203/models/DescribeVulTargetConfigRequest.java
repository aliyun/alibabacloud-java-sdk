// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulTargetConfigRequest extends TeaModel {
    /**
     * <p>The type of the vulnerability. Valid values:</p>
     * <ul>
     * <li><strong>cve</strong>: Linux software vulnerability</li>
     * <li><strong>sys</strong>: Windows system vulnerability</li>
     * <li><strong>cms</strong>: Web-CMS vulnerability</li>
     * <li><strong>emg</strong>: urgent vulnerability</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cve</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The UUID of the server.</p>
     * 
     * <strong>example:</strong>
     * <p>ae1527a9-2308-46ab-b10a-48ae7ff7****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static DescribeVulTargetConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulTargetConfigRequest self = new DescribeVulTargetConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVulTargetConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeVulTargetConfigRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
